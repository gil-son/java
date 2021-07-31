# Java - Labda

## Labda

<p>
	The principal objective from Lambda is introduce tech of funcional languages, like Scala or LISP. That principle reduce the quantity of code when used in a function. For example internal classes that require frequently in Java, like Listeners and Threads.
</p>





<p>
	Look this example Java 7 without Lambda to execute a Thread:
</p>

  
```

public class Java8LambdaRunnable {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello World!");
			}	
		}).run();			
	}
}

```




<p>
	Look this example Java 8 with Lambda to execute a Thread:
</p>

  
  ```
  public class Java8LambdaRunnable {

		public static void main(String[] args) {
		
		new Thread(() -> { 
			System.out.println("Hello World!");
		}).run();
		
	}
}

  ```
  
  <br/>
  <a href="https://github.com/gil-son/java/tree/main/8/Lambda/src">See more</a>
  
  
  
  <!--
  <table>
     <tr>
        <td></td>
      </tr>
      <tr>
        <td></td>
      </tr>
</table>
-->

<hr/>

### Sources

<ul>
	<li>
		<a href="https://www.youtube.com/watch?v=lbCYLgoVpfQ&t=264s">Rinaldo Dev</a>
	</li>
 
 </ul>
