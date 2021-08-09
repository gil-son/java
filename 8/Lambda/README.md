# Java - Lambda

## Lambda

<p>
	The principal objective from Lambda is introduce tech of funcional languages, like Scala or LISP. That principle reduce the quantity of code when used in a function. For example internal classes that require frequently in Java, like Listeners and Threads.
</p>

<p>
	Lambda is a function without declaration, then don't require a name or a type modify access. The ideia is use the method in the same locale where is used. The Lambda functions have your sintaxes very defined, like (argument) -> (body).
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
<br/>

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
  
  <a href="https://github.com/gil-son/java/tree/main/8/Lambda/src">See more</a>
  
  <br/>
  
  
 <p>
	Ok, how that is possible?	
</p>
 
<p>
	This is possible through SAM (Single Abstract Method) that say ' Can use in any interface that have only an abstract method'. Then the examples showed have only an interface and method. If exist only a method in Interface, then this method from interface is used...
</p>  

<p>
	How the method don't receive parameter, then this part:
</p>

```
	() ->
```

<p>
	Don't receive parameter...
</p>


<p>
	In sequence has the scop to coding...
</p>

```
	{ }
```

<p>
	So is possible dive in parts
</p>

```
	( element/optinal parameter ->  scop to use element )
```


<p>
	So is possible dive in parts
</p>

```
	( element/optinal parameter ->  scop to use element )
```


### Annotation

<p>
	The annotation @FunctionalInterface, is used to indicate the rule SAM is used in interface:
</p>


```
@FunctionalInterface
public interface Runnable {
    
    public abstract void run();
}
```
<p>
	Then this annotation force the use thats rule, otherwise... If exist more method, the script will not compiler. This annotation is not obligatory, but is a nice 	practice. Case don't have the annotation, but exist just a method, is possible to use Lambda.
</p>


<hr/>

### Sources

<ul>
	<li>
		<a href="https://www.youtube.com/watch?v=lbCYLgoVpfQ&t=264s">Rinaldo Dev</a>
	</li>
 	<li>
		<a href="https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826">Dev Media - Lambda</a>
	</li>
 </ul>
