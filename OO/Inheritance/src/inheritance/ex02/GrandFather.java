package inheritance.ex02;

public class GrandFather {

    protected String name;
    protected double height;
    protected double weight;

    public GrandFather () {

    }

    public GrandFather(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void speaking() {
        System.out.println("\nGrandFather is speaking!");
    }

    public void sleeping() {
        System.out.println("GrandeFather is sleeping!");
    }

    public void walking() {
        System.out.println("GrandFather is sleeping!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nAttributes [name=" + name + ", height=" + height + ", weight=" + weight + "]";
    }
}
