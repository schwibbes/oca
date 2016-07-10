rm -rf bin/*
cmd=$(cygpath -u 'C:\Program Files\Java\jdk1.8.0_40\bin\javac') 
"$cmd" -d bin $*
