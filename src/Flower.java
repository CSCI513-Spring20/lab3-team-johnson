import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Flower extends GardenComponent{
	Point2D flowerPosition;
	Color flowerColor;
	boolean moveable;
	Circle flower;
	
	public Flower(Point2D p, Color c, boolean move)
	{
		position = p;
		flowerColor = c;
		moveable = move;
		size = 10;
		flower = new Circle();
		flower.setCenterX(p.getX());
		flower.setCenterY(p.getY());
		flower.setRadius(size);
		flower.setFill(flowerColor);
		flower.setStroke(Color.BLACK);
		flower.setStrokeWidth(1);
		obj = flower;
	}
	
	public void move(double x, double y)
	{	
		flower.setCenterX(x);
		flower.setCenterY(y);
	}

}
