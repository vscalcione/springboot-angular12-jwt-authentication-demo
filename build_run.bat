@ECHO OFF

echo STEP 1: Mvn clean instruction
call mvn clean install -U -DskipTests=true
call timeout /t 30
echo STEP 2: Springboot run
call mvn spring-boot:run