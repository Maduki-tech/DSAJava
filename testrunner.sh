#!/bin/bash

# Path to VisualVM
VISUALVM_PATH=/Applications/VisualVM.app/Contents/MacOS/visualvm

# Maven command to start your project (adjust as necessary)
MVN_COMMAND="mvn clean install exec:java -Dexec.mainClass="de.schlueter.App""

echo "Starting application..."
$MVN_COMMAND &

APP_PID=$!

echo "Application started with PID: $APP_PID"

echo "Opening VisualVM..."
$VISUALVM_PATH --openpid $APP_PID

wait $APP_PID

