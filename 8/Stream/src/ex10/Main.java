package ex10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

          List<Pessoa> pessoas = new ArrayList<>();
          pessoas.add(new Pessoa("Alison", 25L));
          pessoas.add(new Pessoa("Rita", 60L));
          pessoas.add(new Pessoa("Joao", 20L));
          pessoas.add(new Pessoa("Maria", 24L));
          pessoas.add(new Pessoa("Ricardo", 35L));


          Pessoa olderAge = pessoas
                .stream()
                .max(Comparator.comparing(Pessoa::getAge))
                .orElseThrow(NoSuchElementException::new);


          System.out.println(olderAge.getName()+" "+olderAge.getAge());

    }


}
