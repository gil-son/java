package inheritance.ex02;

public class Main {

    public static void main(String[] args) {

        GrandFather grandfather = new GrandFather("Dean", 1.80, 80.6);
        System.out.println(grandfather.toString());
        grandfather.speaking();
        grandfather.sleeping();
        grandfather.walking();

        Father father = new Father("Sam", 1.83, 80.5,"Brown");
        System.out.println(father.toString());
        father.speaking();
        father.sleeping();
        father.walking();

        Child child = new Child("Bob", 1.35, 30.2,"Brown", true);
        System.out.println(child.toString());
        System.out.println(child.getIntelligence());
        child.speaking();
        child.sleeping();
        child.walking();
    }
}
