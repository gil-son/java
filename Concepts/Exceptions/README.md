# Java - Concepts - Exceptions

## What are Exceptions?

<ul>
	<li> Exceptions are events taht occur during the execution of programs that disrupt the   normal flow of instructions (e. g. divide by zero, array access out of bound, ect).
  </li>
  <li>
    In Java, an exception is an <b>object</b> that wraps an error event that occured within a method and contains:
		<ul>
			<li> Information about the error including its type</li>
			<li> The state of the program when the error occurred</li>
			<li> Optionally, other custom information</li>
		</ul>	
	</li>
  <li>
    Exceptions are used to indicate many different types of error conditions.
    <ul> JVM Errors:
      <li>OutOfMemoryError</li>
      <li>StackOverflowError</li>
      <li>LinkageError</li>
    </ul>
  </li>
  <li>
    System errors:
    <ul>
      <li>FileNotFoundException</li>
      <li>IOException</li>
      <li>SocketTimeoutException
          <ul>
            Programming errors:
                <ul>
                    <li>NullPointerException</li>
                    <li>ArrayIndexOutBoundsException</li>
                    <li>ArithmeticException</li>
                </ul>
          </ul>
      </li>
    </ul>
  </li>
</ul>


## Why Use Exceptions?

<ul>
	<li> Exceptions separate error handling code from regular code
		<ul>
			<li>Benefit: Cleaner algorithms, less clutter</li>
		</ul>	
	</li>
	<li> Exceptions propagate errors up the call stack.
		<ul>
			<li>Benefit: Nested methods do not have to explicitly catch-and-forward errors (less work, more reliable)</li>
		</ul>	
	</li>
	<li> Exception classes group and differentiate error types.
		<ul>
			<li>You can group errors by their generalize parent class, <b>or</b></li>
			<li>Differentiate errors by their actual class</li>
		</ul>	
	</li>
	<li> 
			In a traditional programming language like C, an error condition is usually indicated using an integer return value (e.g. -1 for out of memory). However, this practice:
			<ul>
				<li>Requires standardization on error codes (hard for large projects)</li>
				<li>Makes functions hard to use because they must return actual values by reference</li>
				<li>Requires programmers to check return error codes in every nested function call. This leads to cluttered source code and hard-to-follow logic</li>
				<li>Does not allow for the state of the program to be easily captured on an error condition for later examination</li>
				<li>Cannot be enforced, and programmers often ignore error conditions, which leads to security or stability issues in programs</li>
			</ul>	
		</li>
</ul>




## try

<p>The reserved word 'try' is used to trying a process, where is the risk to generate an exception:</p>

```

public class Main {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } 
  }
}

```

<a href="https://github.com/gil-son/java/blob/main/Concepts/Exceptions/src/exceptions/ex01/Array.java"/>More examples</a>


## catch

If the process pass into 'try' and generate an exception... The reserved word 'catch' will catch this exception through the object of exceptions in your parameter. This object contain classes and methods to axilliate:

```
public class Main {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
```
<a href="https://github.com/gil-son/java/tree/main/Concepts/Exceptions/src/exceptions/ex02"/>More examples</a>

## finally

<p>The reserved word 'finally' will execute, independent if generate an exception or not</p>

<ol>
	<li>Open file</li>
	<li>Perform reading</li>
	<li>Error occurs</li>
	<li>Close file in finally'</li>
</ol>

<p>
Whether or not the exception occurs, the file needs to be closed if it doesn't have 'finally' and an exception simply occurs
the error is handled, but the procedure is incomplete. So to complete the process in this situation, 'finally' is used</p>

<p>Another situation is trying to access a database, using the 'try' where a connection to the database is opened, it is made
an operation in the bank. During this procedure it may occur okay, but maybe not... regardless of the result, it is necessary
close the connection to the database, and at that time it uses the finally</p>

<p></p>

```
public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
```

<a href="https://github.com/gil-son/java/blob/main/Concepts/Exceptions/src/exceptions/ex03/TestingFinally.java"/>More examples</a>




## Sources


<ul>
  <li><a href="https://www.protechtraining.com/content/java_fundamentals_tutorial-exceptions">ProTech</a></li>
  <li><a href="https://pt.stackoverflow.com/questions/63617/o-que-%C3%A9-a-nullpointerexception-e-quais-s%C3%A3o-suas-principais-causas">Stack Overflow (PT-BR)</a></li>	
  <li><a href="https://www.w3schools.com/java/java_try_catch.asp"> W3S -Java Exceptions - Try...Catch</a></li>
   <li><a href="https://www.youtube.com/watch?v=ld2C4GcAtsg&t=2s"> Curso de Java 47 at 49/a></li>
</ul>

