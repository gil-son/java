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
