package inheritance.ex02;

public class Child extends Father {
    protected boolean intelligence;

    public Child() {

    } 

    public Child(boolean intelligence) {
        this.intelligence = intelligence;
    }

    public Child(String name, double height, double weight, boolean intelligence) {
        super(name, height, weight);
        this.intelligence = intelligence;
   }
    
    
    public Child(String name, double height, double weight, String hair, boolean intelligence) {
         super(name, height, weight, hair);
         this.intelligence = intelligence;
    }

    public void playing() {
        System.out.println("Child is playing!");
    }

    public boolean getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(boolean intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void speaking() {
        System.out.println("\nChild is speaking!");
    }

    @Override
    public void sleeping() {
        System.out.println("Child is sleeping!");
    }

    @Override
    public void walking() {
        System.out.println("Child is walking!");
    }
    
    @Override
    public String toString() {
        return "\nAttributes [name=" + name + ", height=" + height + ", weight=" + weight + " hair= " +hair+ " intelligence = "+intelligence+"]";
    }
    
}
