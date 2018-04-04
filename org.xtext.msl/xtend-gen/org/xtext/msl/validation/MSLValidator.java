/**
 * generated by Xtext 2.13.0
 */
package org.xtext.msl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.msl.mSL.AbstractGroup;
import org.xtext.msl.mSL.AbstractSystem;
import org.xtext.msl.mSL.Configuration;
import org.xtext.msl.mSL.GroupBinding;
import org.xtext.msl.mSL.MSLPackage;
import org.xtext.msl.mSL.Pattern;
import org.xtext.msl.mSL.SystemBinding;
import org.xtext.msl.validation.AbstractMSLValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MSLValidator extends AbstractMSLValidator {
  public final static String MULTIPLE_CONCRETIZATION = "multipleConcretization";
  
  public final static String NO_CONCRETIZATION = "noConcretization";
  
  public final static String NOT_MATCHED_INTERACTION = "notMatchedInteraction";
  
  private int found;
  
  private boolean matched;
  
  private AbstractGroup startAbsGroup;
  
  private AbstractGroup endAbsGroup;
  
  @Check
  public void checkPattern(final Pattern pattern) {
    EList<AbstractGroup> _abstractGroups = pattern.getAbsPattern().getAbstractGroups();
    for (final AbstractGroup g : _abstractGroups) {
      {
        this.found = 0;
        EList<GroupBinding> _groups = pattern.getGroups();
        for (final GroupBinding cg : _groups) {
          boolean _equals = cg.getAbsGroup().getName().equals(g.getName());
          if (_equals) {
            this.found++;
          }
        }
        if ((this.found == 0)) {
          String _name = g.getName();
          String _plus = ("Group " + _name);
          String _plus_1 = (_plus + " has not been concretized");
          this.error(_plus_1, MSLPackage.Literals.PATTERN__NAME, MSLValidator.MULTIPLE_CONCRETIZATION);
        } else {
          if ((this.found > 1)) {
            String _name_1 = g.getName();
            String _plus_2 = ("Group " + _name_1);
            String _plus_3 = (_plus_2 + " has been concretized more than once");
            this.error(_plus_3, MSLPackage.Literals.PATTERN__NAME, MSLValidator.NO_CONCRETIZATION);
          }
        }
      }
    }
    EList<AbstractSystem> _managedSystems = pattern.getAbsPattern().getManagedSystems();
    for (final AbstractSystem s : _managedSystems) {
      {
        this.found = 0;
        EList<SystemBinding> _managedSystems_1 = pattern.getManagedSystems();
        for (final SystemBinding ms : _managedSystems_1) {
          boolean _equals = ms.getAbsSys().getName().equals(s.getName());
          if (_equals) {
            this.found++;
          }
        }
        if ((this.found == 0)) {
          String _name = s.getName();
          String _plus = ("System " + _name);
          String _plus_1 = (_plus + " has not been concretized");
          this.error(_plus_1, MSLPackage.Literals.PATTERN__NAME, MSLValidator.MULTIPLE_CONCRETIZATION);
        } else {
          if ((this.found > 1)) {
            String _name_1 = s.getName();
            String _plus_2 = ("System " + _name_1);
            String _plus_3 = (_plus_2 + " has been concretized more than once");
            this.error(_plus_3, MSLPackage.Literals.PATTERN__NAME, MSLValidator.NO_CONCRETIZATION);
          }
        }
      }
    }
  }
  
  @Check
  public Object checkConfiguration(final Configuration configuration) {
    return null;
  }
}
