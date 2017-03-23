set PR_STARTUP=manual

REM set PR_TYPE=interactive
set PR_SERVICEUSER=.\Jenkins
set PR_SERVICEPASSWORD=password

set PR_JVM=auto

set PR_JVMOPTIONS=-Dwebdriver.gecko.driver=I:\geckodriver-windows-service-0.0.1-SNAPSHOT-dist\geckodriver-windows-service-0.0.1-SNAPSHOT\geckodriver.exe
set PR_CLASSPATH=I:\geckodriver-windows-service-0.0.1-SNAPSHOT-dist\geckodriver-windows-service-0.0.1-SNAPSHOT\geckodriver-windows-service-0.0.1-SNAPSHOT.jar

set PR_STARTMODE=jvm
set PR_STARTCLASS=com.example.GeckodriverTestService
set PR_STARTMETHOD=start
set PR_STARTPARAMS=

set PR_STOPMODE=jvm
set PR_STOPCLASS=com.example.GeckodriverTestService
set PR_STOPMETHOD=stop
set PR_STOPARAMS=

set PR_LOGPATH=I:\geckodriver-windows-service-0.0.1-SNAPSHOT-dist\geckodriver-windows-service-0.0.1-SNAPSHOT\logs\
set PR_STDOUTPUT=auto
set PR_STDERROR=auto

prunsrv.exe install geckodriver-test