package pr_6;
public class Vehicle {
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    v1.setColor("Red");
    System.out.println(v1.getColor());
}}

