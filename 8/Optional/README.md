# Java
## Practice - Java 8 - Optional



### Introduction

<p>
  'Optional' emerged in version 8 Java  with the proposed of verify if exist an object or not exist an object, then is a new concept to resolve nulls objects
</p>

 <p>
  Before version 8 Java to resolve null objects was required verify with 'if':
 </p>
 
 ```
 
 Address ad = null;
 
if(ad != null) {
    System.out.println(ad.getAllAddress());
  }else {
    System.out.println("The variable is null, don't reference a object");
  }
    
 ```
 
<p>
  or treat with 'try/catch':
</p>

```
try {
    System.out.println(ad.getAllAddress());
  }catch(NullPointerException e) {
    System.out.println(e.getMessage());
  }
 
```


#### ofNullable()

<p>
    This method verify if exist an object/value, case yes, will return an Optional, case not, will return an empty Optional:
</p>

```

  public class ContactDAO {

	public Optional<Contact> searchByName(String name) {
		return Optional.ofNullable(null);
	}
}

```

<a href="https://github.com/gil-son/java/tree/main/8/Optional/src/ex01">See more</a>





## Sources:

<ul>
  <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html">Docs - Oracle - Java 8 - Optional</a></li>
  <li><a href="https://medium.com/@racc.costa/optional-no-java-8-e-no-java-9-7c52c4b797f1"> Medium - Optional</a></li>
</ul>














