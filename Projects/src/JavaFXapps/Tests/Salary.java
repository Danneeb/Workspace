package JavaFXapps.Tests;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Salary extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Calculator");
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10,10,10,10));
		pane.setVgap(5.0);
		pane.setHgap(5.0);
		
		Button salary = new Button();
		
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		
	}

}
