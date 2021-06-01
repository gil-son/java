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











## Sources


<ul>
  <li><a href="https://www.protechtraining.com/content/java_fundamentals_tutorial-exceptions">ProTech</a></li>
  <li><a href="https://pt.stackoverflow.com/questions/63617/o-que-%C3%A9-a-nullpointerexception-e-quais-s%C3%A3o-suas-principais-causas">Stack Overflow (PT-BR)</a></li>	
</ul>

