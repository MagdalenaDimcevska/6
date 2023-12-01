package pr_6;

public class rdnd {
private String color;
private int x;
private String tekst;
private int y;
	public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public String getTekst() {
	return tekst;
}
public void setTekst(String tekst) {
	this.tekst = tekst;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
	public static void main(String[] args) {
rdnd c1=new rdnd();
c1.setColor("Red");
System.out.println(c1.getColor());
rdnd d1=new rdnd();
d1.setX(10);
System.out.println(d1.getX());
rdnd n1=new rdnd();
n1.setTekst("New");
System.out.println(n1.getTekst());
rdnd b1=new rdnd();
b1.setY(9);
System.out.println(b1.getY());
	}

}
