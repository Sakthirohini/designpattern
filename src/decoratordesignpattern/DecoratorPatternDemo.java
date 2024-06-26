package decoratordesignpattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		 Shape redCircle = (Shape) new RedShapeDecorator(new Circle());
		 Shape redRectangle = (Shape) new RedShapeDecorator(new Rectangle());
		 System.out.println("Circle with normal border");
		 circle.draw();
		 System.out.println("\nCircle of red border");
		 redCircle.draw();
		 System.out.println("\nRectangle of red border");
		 redRectangle.draw();

	}

}
