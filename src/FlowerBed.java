import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class FlowerBed extends GardenComponent{
	List<GardenComponent> flowers = new ArrayList<GardenComponent>();
	Color flowerBedColor;
	boolean moveable;
	Rectangle flowerBed;
	
	public FlowerBed(Point2D p, Color c, boolean move)
	{
		position = p;
		flowerBedColor = c;
		moveable = move;
		size = 100;
		flowerBed = new Rectangle(p.getX(), p.getY(), size, size);
		flowerBed.setX(p.getX());
		flowerBed.setY(p.getY());
		flowerBed.setFill(flowerBedColor);
		flowerBed.setStroke(Color.BLACK);
		flowerBed.setStrokeWidth(1);
		obj = flowerBed;
	}
	
	
	public void add(GardenComponent gc)
	{
		flowers.add(gc);
	}
	
	public void remove(GardenComponent gc)
	{
		flowers.remove(gc);
	}
	
	public GardenComponent getChild(int i)
	{
		return (GardenComponent)flowers.get(i);
	}
	
	public void move(double x, double y)
	{
		position = new Point2D(x, y);
		flowerBed.setX(position.getX());
		flowerBed.setY(position.getY());
		for (int i = 0; i < flowers.size(); i++)
		{
			flowers.get(i).move(x, y);
		}
	}
}
