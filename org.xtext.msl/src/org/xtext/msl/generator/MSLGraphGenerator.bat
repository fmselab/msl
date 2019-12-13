@echo off

:: This batch file generates an image from the generated DOT code.
:: The image will contain the graphical notation for your own MSL model.

title MSL Graph Generator

:: Ask for the directory
:askDir
echo Write or paste the directory where you have stored the DOT code:
set /p dir=
echo.

:: Ask for file's name
:askFile
echo Write or paste the file's name containing the DOT code (without extension):
set /p name=
echo.
set "fullName=%name%.dot"

:: Go into the directory and search file
:search
cd %dir%
if exist %fullName% (
	goto imgExt
) else (
  echo The file does not exist: check for errors and try again.
  echo.
  call :askFile
)

:: Ask for output image's extension
:imgExt
echo Choose the extension for the output image (jpeg/png):
set /p ext=
if /i "%ext%"=="jpeg" (
	goto extJpeg
) else if /i "%ext%"=="png" (
	goto extPng
) else (
	echo.
	echo Error: please choose between jpeg or png.
	call :imgExt
)

:: Execute dot command to generate the graph
:extJpeg
set "outputName=%name%.jpeg"
dot -Tjpeg %fullName% -o %outputName% && echo The generation was successfull. 
goto close

:extPng
set "outputName=%name%.png"
dot -Tpng %fullName% -o %outputName% && echo The generation was successfull.
echo.
goto close

:: Finish
:close
set /p end=Do you want to exit? (y/n): 
if /i "%end%"=="y" (
	exit
) else if /i "%end%"=="n" (
	goto continue
) else (
	echo Error: repeat.
	call :close
)

:continue
set /p choice=Do you want to generate another image? (y/n): 
if /i "%choice%"=="y" (
	goto :next
) else if /i "%choice%"=="n" (
	exit
) else (
	echo Error: repeat.
	call :continue
)

:next
set /p nextGen=Is the file in the same directory as the previous one? (y/n): 
if /i "%nextGen%"=="y" (
    echo.
	call :askFile
) else if /i "%nextGen%"=="n" (
	echo.
	call :askDir
) else (
	echo Error: repeat.
	call :next
)
