 #!/bin/sh

echo "Starting java project"

rm -rf /app/target
find . -name "*.java" -print | xargs javac -d /app/target  
java -classpath /app/target br.com.jtest.Main & export APP_RUNNING_PID=$!


inotifywait -r -m -e modify ./ | 
   while read path _ file; do 
        if [[  $(expr match "$file" '.*\.java$') != 0 ]]; then 
            echo "File modified: $path$file " 
            
            if [  "$APP_RUNNING_PID" -gt 0 ]; then 
                kill -9 $APP_RUNNING_PID
            fi
            
            rm -rf /app/target
            find . -name "*.java" -print | xargs javac -d /app/target  
            java -classpath /app/target br.com.jtest.Main & export APP_RUNNING_PID=$!
        fi
   done