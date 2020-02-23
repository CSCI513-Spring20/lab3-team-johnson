import java.util.ArrayList;
import java.util.List;

public class FlowerBed extends GardenComponent{
	List<GardenComponent> flowers = new ArrayList<GardenComponent>();
	
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
}
