package org.inheritance;

abstract class Shape
{
	String color;
	
	//abstract method
	abstract double area();
	public abstract String toString();
	
	//constructor
	public Shape(String color)
	{
		this.color=color;
	}
	
	//concrete method
	public String getColor()
	{
		return this.color;
	}
	
	//final method
	final void test()
	{
		System.out.println("This is a final method.");
	}
	
	static void staticMethod()
	{
		System.out.println("This is a static method.");
	}
	
	
}

class Circle extends Shape
{
	
	double radius;
	
	public Circle(String color, double radius)
	{
		super(color);
		this.radius=radius;
	}

	@Override
	double area() {
		
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		
		return super.getColor() + " "+ area();
	}
	
}


class Rectangle extends Shape
{
	double length;
	double width;
	
	public Rectangle(String color,double length,double width)
	{
		super(color);
		this.length=length;
		this.width=width;
	}

	@Override
	double area() {
		
		return length * width;
	}

	@Override
	public String toString() {
		
		return super.getColor() + " "+ area();
	}
	
}


public class AbstractClassExample {

	public static void main(String[] args) {
		Circle c=new Circle("Red",6.9);
		System.out.println(c.toString());
		
		Rectangle r=new Rectangle("blue", 10.4, 20.6);
		System.out.println(r.toString());

	}

}
