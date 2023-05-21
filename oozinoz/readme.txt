This code provides the base of examples that appear in "The Design Patterns Java Workbook," by Steve Metsker.

---- Learning Java --------

The workbook assumes that you're pretty comfortable working with Java. If that's not the case, you may want to spend some time studying Java before working with the workbook examples. I personally like the SAMS book "Teach Yourself Java 2 in 21 Days," by Laura Lemay and Rogers Cadenhead. This book will help you get to the point where you can compile and run Java programs.

---- Running the Examples --------

If you are familiar with how Java packages and classes correspond to directory structures, you should be able to compile and run the examples in "The Design Patterns Java Workbook." One hitch is that some of the example programs need to look along a classpath for an external resource, such as a graphics file. For instance, the Visualization class looks for a machine.gif that must like along the class path. To run the Visualization class:

     1) cd to your downloaded Oozinoz directory.

          E:\>          
          E:\>cd oozinoz          
          E:\oozinoz>

     2) Compile the Visualization code, forcing the compilation of any supporting classes. The javac compiler must be available for this to work. You can retrieve the compiler from java.sun.com.

         E:\oozinoz>javac -d classes -sourcepath code code\com\oozinoz\visualization\Visualization.java

     3) Run the application.
         E:\oozinoz>java -classpath images;classes com.oozinoz.visualization.Visualization

Putting the "images" directory in the class path lets the application find the machine.gif file.

The Visualization application lets you add machines to a factory, and lets you drag the machines around the screen. The point of the example is that the "Undo" button lets you return the application to an earlier state. This example appears in the "Memento" chapter.

---- Example Bat Files ----

Two other examples that require special directories in the classpath are ShowGzip and ShowProxy. The oozinoz.zip download file includes .bat files that demonstrate how to compile and run these examples.

---- JUnit --------

If you look through the code you will find several classes that extend the TestCase class from the JUnit automated testing framework. These classes help to verify that the example code is in good working order. To compile these classes you will need to acquire the framework code. It is available at www.junit.org.

---- Anything Else --------

If you have any comments or questions, please shoot me a note at Steve.Metsker@acm.org.
