set ProjectPath=%~dp0
cd %ProjectPath%
set p=%PATH%
java -javaagent:"%ProjectPath%libAllureReport\aspectjweaver-1.9.8.jar" -classpath "%ProjectPath%bin;%ProjectPath%libAllureReport\*;%ProjectPath%libAllureReport\*;%ProjectPath%libExtentVersion4\*;%ProjectPath%libLog\*;%ProjectPath%libraries\*;%ProjectPath%libReportNG\*;%ProjectPath%libWebDriverManager\*" org.testng.TestNG "%ProjectPath%bin\RunTest.xml"
pause