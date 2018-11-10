package org.xtext.msl.generator.openhabgenerator.ui.handlers;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.handlers.HandlerUtil;
import org.xtext.msl.generator.openhabgenerator.OpenHABGenerator;

/**
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class OpenHABGeneratorHandler extends AbstractHandler {
	public static boolean WRITE_TO_FILE = false;

	/**
	 * the command has been executed, so extract extract the needed information from
	 * the application context.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		String path = null;
		IEditorInput editorInput = window.getActivePage().getActiveEditor().getEditorInput();
		if (editorInput instanceof org.eclipse.ui.part.FileEditorInput) {
			path = ((org.eclipse.ui.part.FileEditorInput) editorInput).getURI().getPath();
		} else if (editorInput instanceof org.eclipse.ui.ide.FileStoreEditorInput) {
			path = ((org.eclipse.ui.ide.FileStoreEditorInput) editorInput).getURI().getPath();
		} else {
			throw new Error("Unknown editor " + editorInput.getClass().getSimpleName());
		}
		IConsoleView view = null;
		try {
			view = (IConsoleView) window.getActivePage().showView(IConsoleConstants.ID_CONSOLE_VIEW);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		MessageConsole myConsole = findConsole("OpenHABGenerator");
		view.display(myConsole);
		myConsole.activate();
		OutputStream out = myConsole.newOutputStream();
		PrintStream printOut = new PrintStream(out);
		System.setOut(printOut);
		// System.setErr(printOut);
		try {
			myConsole.clearConsole();
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			OpenHABGenerator openhabGenerator = new OpenHABGenerator(path, pw);
			openhabGenerator.generate();
			String openhabText = sw.toString();
			printOut.println(openhabText);
			//System.err.println(path);
			if(WRITE_TO_FILE) {
				//TODO
			}
		} catch (Exception e) {
			e.printStackTrace();
			Display d = Display.getDefault();
			Shell shell = new Shell(d);
			MessageBox message = new MessageBox(shell);
			message.setMessage("Error during the execution of the OpenHAB generator");
			message.setText("Execution error");
			message.open();
		}
		return null;
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}
}
