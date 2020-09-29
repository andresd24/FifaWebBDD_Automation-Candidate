ç#!/bin/bash
java -jar selenium-server-3.7.1.jar -role hub &
java -Dwebdriver.gecko.driver=geckodriver -jar selenium-server-3.7.1.jar -role webdriver -hub http://127.0.0.1:4444/grid/register -nodeConfig /opt/selenium/defaultNodeConfig.json -browser "browserName=firefox,platform=LINUX" &		

