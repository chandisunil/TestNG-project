set projectLocation=C:\Users\SundayKart\workspace\TestNGProject
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testNG.xml
pause