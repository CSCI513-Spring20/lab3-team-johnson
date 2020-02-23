import java.awt.Point;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Flower extends GardenComponent{
	Point flowerPosition;
	Color flowerColor;
	boolean moveable;
	Circle flower;
	
	public Flower(Point p, Color c, boolean move)
	{
		flowerPosition = p;
		flowerColor = c;
		moveable = move;
		flower = new Circle();
		flower.setCenterX(flowerPosition.x);
		flower.setCenterY(flowerPosition.y);
		flower.setRadius(5);
		flower.setFill(flowerColor);
		flower.setStroke(Color.BLACK);
		flower.setStrokeWidth(1);
	}

}
