# java

## Set - hashCode()

### Introduction

<p>
Imagine if you have a table with information of all pacients of hospital.
</p>
<p>
If you search for a pacient, the time is (O(n) linear search or 
O(log N) to binaries search) thats can be useless in a big table. But
using a hash table to search, the time is reduce to (O(1)) for any situation, justing calculate the value Hash Code in input and output information.
</p>

### Example 1
#### Observe the following rule, in which each letter of the alphabet will receive a value according to the order of writing:

<p>A = 1</p>
<p>B = 2</p>
<p>C = 3</p>
<p>.</p>
<p>.</p>
<p>.</p>
<p>Z = 26</p>
<br/>

#### Then:

<p>A l  e x</p>
<p>↓ ↓  ↓ ↓</p>
<p>1 30 5 23</p>
<p>1+30+5+24 = 41</p>

<hr/>
<p>A n a</p>
<p>↓ ↓ ↓</p>
<p>1 14 1</p>
<p>1+14+1 = 16</p>

<hr/>
<p>C i r k</p>
<p>↓ ↓  ↓ ↓</p>
<p>3 9 18 11</p>
<p>3+9+18+11 = 41</p>

<hr>
<p>Gleen</p>
<p>↓ ↓ ↓</p>
<p>7 12 5 5 14</p>
<p>7+12+5+5+14 = 43</p>

#### Each set of words has a code, which will make it easier to find using hashCode():

<table>
  <tr>
    <th>16</th>
    <th>41</th>
    <th>43</th>
  </tr>
  <tr>
    <td rowspan="2">Ana</td>
    <td>Alex</th>
    <td rowspan="2">Glen</td>
  </tr>
  <tr>
    <td>Cirk</td>
  </tr>
</table>

#### But look at column 41. Has 2 names in the same location. In these situations we combine the hashCode() with equals() to find the name

##### Some rules:

<ol>
  <li>If x.equals(y) == true, then y.hashCode() == x.hashCode();</li>
  <li>If y.hashCode() == x.hashCode(), then no necessary are equal;</li>
  <li>When searching between 2 identical codes, one hour returns true;</li>
  <li>If x.equals(y) == false. Then hashCode() can be empty;</li>
  <li>y.hashCode() != x.hashCode(). Then equals() must be false.</li>
 </ol>

<hr/>

### Sources:
<ul>
<li>
  <a href="https://www.youtube.com/watch?v=O0fP8jA4RVA" />DevDojo</a></li>
  <li><a href="https://angeliski.com.br/2014/01/05/equals-e-hashcode/#:~:text=O%20hashCode%20%C3%A9%20uma%20ferramenta,de%20hash%20de%20modo%20correto." />Angelisk</a></li>

</ul>
