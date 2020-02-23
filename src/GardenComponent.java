import javafx.geometry.Point2D;

public abstract class GardenComponent {
	Point2D position;
	int size;
	Object obj;
	
	public void add(GardenComponent gc)
	{
		throw new UnsupportedOperationException();
	}
	
	public void remove(GardenComponent gc)
	{
		throw new UnsupportedOperationException();
	}
	
	public GardenComponent getChild(int i)
	{
		throw new UnsupportedOperationException();
	}
	
	public void move(double x, double y)
	{
		throw new UnsupportedOperationException();
	}

}
