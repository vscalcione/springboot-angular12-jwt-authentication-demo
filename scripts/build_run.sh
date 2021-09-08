#!/bin/bash

echo 'STEP 1: Mvn clean instruction'
mvn clean install -U -DSkipTests=true

echo 'STEP 2: SpringBoot run'
mvn spring-boot:run