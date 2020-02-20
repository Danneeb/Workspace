package db222pt_assign2.Exercise6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Snowman extends Application{

	public static void main(String[] args) {
		launch(args);
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Snowman");
		
		Circle head = new Circle(400,150,25);
		head.setStrokeWidth(5.0);
		head.setFill(Color.WHITE);
		
		Circle body = new Circle(400,215,40);
		body.setFill(Color.WHITE);
		
		Circle lwrbody = new Circle(400,315,60);
		lwrbody.setFill(Color.WHITE);
		
		Circle sun = new Circle(730,70,60);
		sun.setFill(Color.YELLOW);
		
		Line ground = new Line(0,1370,0,1370);
		ground.setStroke(Color.ANTIQUEWHITE);
		ground.setStrokeWidth(2000.0);
		
		Circle eye = new Circle(393,145,2);
		eye.setStroke(Color.BLACK);
		eye.setStrokeWidth(2.0);
		eye.setFill(null);
		
		Circle eye2 = new Circle(407,145,2);
		eye2.setStroke(Color.BLACK);
		eye2.setStrokeWidth(2.0);
		eye2.setFill(null);
		
		Circle mouth = new Circle(400,155,5);
		mouth.setStroke(Color.BLACK);
		mouth.setStrokeWidth(3.0);
		mouth.setFill(null);
		
		Circle btn1 = new Circle(400,185,4);
		Circle btn2 = new Circle(400,215,4);
		Circle btn3 = new Circle(400,245,4);
		
		Group root = new Group();
		root.getChildren().addAll(head,body,lwrbody,sun,ground,eye,eye2,mouth,btn1,btn2,btn3);
		
		Scene scene = new Scene(root,800,500,Color.DEEPSKYBLUE);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}