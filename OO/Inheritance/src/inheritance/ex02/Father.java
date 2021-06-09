package inheritance.ex02;

public class Father extends GrandFather {
    protected String hair;

     public Father() {

     }

     public Father(String hair) {
            this.hair = hair;
     }

     public Father(String name, double height, double weight, String hair) {
         super(name, height, weight);
         this.hair = hair;
     }
     
     public Father(String name, double height, double weight) {
         super(name, height, weight);
     }

    public void running() {
        System.out.println("GrandFather is running!");
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    @Override
    public void speaking() {
        System.out.println("\nFather is speaking!");
    }

    @Override
    public void sleeping() {
        System.out.println("Father is sleeping!");
    }
    @Override
    public void walking() {
        System.out.println("Father is walking!");
    }
    
    @Override
    public String toString() {
        return "\nAttributes [name=" + name + ", height=" + height + ", weight=" + weight + " hair= " +hair+"]";
    }
}
