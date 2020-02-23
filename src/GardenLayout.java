import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GardenLayout extends Application 
{
	AnchorPane myPane = new AnchorPane();
	Scene scene = new Scene(myPane, 50*10, 50*10);
	Point2D p = new Point2D(10, 10);
	Flower redFlower = new Flower(p, Color.DARKRED, false);
	Point2D bedp = new Point2D(200, 200);
	FlowerBed bed = new FlowerBed(bedp, Color.BROWN, false);
	List<GardenComponent> gardenComponents = new ArrayList<GardenComponent>();

	@Override
	public void start(Stage gardenStage) throws Exception 
	{
		gardenStage.setScene(scene);
		gardenStage.setTitle("Garden Layout");
		gardenStage.show();
		scene.setOnMouseDragged(mouseHandler);
		scene.setOnMouseReleased(mouseHandler);
		scene.setOnMousePressed(mouseHandler);
		gardenComponents.add(redFlower);
		//gardenComponents.add(bed);
		for (int i = 0; i < gardenComponents.size(); i++)
		{
			myPane.getChildren().add((Node) gardenComponents.get(i).obj);
		}
	}
	
	public static void main(String args[])
	{
		launch(args);
	}
	
	EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() 
	{

		@Override
		public void handle(MouseEvent mouseEvent) 
		{
			Point2D clickPoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
			System.out.println(clickPoint.getX() + " " + clickPoint.getY());
			String eventName = mouseEvent.getEventType().getName();
			Point2D lastPosition = new Point2D(0, 0);
			
			for (int i = 0; i < gardenComponents.size(); i++)
			{
				double xdiff = Math.abs(clickPoint.getX() - gardenComponents.get(i).position.getX());
				double ydiff = Math.abs(clickPoint.getY() - gardenComponents.get(i).position.getY());

				if ((xdiff < gardenComponents.get(i).size) && (ydiff < gardenComponents.get(i).size))
				{
					if (eventName == "MOUSE_DRAGGED")
					{
						if (lastPosition != null)
						{
							System.out.println("Dragging");
							int deltaX = (int) (clickPoint.getX()-lastPosition.getX());
							int deltaY = (int) (clickPoint.getY()-lastPosition.getY());
							gardenComponents.get(i).move(deltaX, deltaY);
						}
					}
				}
			}
			/*
			if (eventName == "MOUSE_DRAGGED")
			{
				if (lastPosition != null)
				{
					System.out.println("Dragging");
					int deltaX = (int) (clickPoint.getX()-lastPosition.getX());
					int deltaY = (int) (clickPoint.getY()-lastPosition.getY());
					redFlower.move(deltaX, deltaY);
				}
			}
			*/
			lastPosition = clickPoint;
			
		}
		
	};

}
