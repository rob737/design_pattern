javac -d classes -sourcepath code code\com\oozinoz\applications\ShowGzip.java
java -classpath config;classes com.oozinoz.applications.ShowGzip
dir /od config
echo You should see a new, compressed version of config\demo.doc

