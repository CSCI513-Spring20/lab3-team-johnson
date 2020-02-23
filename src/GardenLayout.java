import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GardenLayout extends Application 
{
	AnchorPane myPane = new AnchorPane();
	Scene scene = new Scene(myPane, 50*10, 50*10);

	@Override
	public void start(Stage gardenStage) throws Exception 
	{
		gardenStage.setScene(scene);
		gardenStage.setTitle("Garden Layout");
		gardenStage.show();
	}
	
	public static void main(String args[])
	{
		launch(args);
	}

}
