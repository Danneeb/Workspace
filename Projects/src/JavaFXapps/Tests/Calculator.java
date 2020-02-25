package JavaFXapps.Tests;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculator extends Application{
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
		pane.setAlignment(Pos.CENTER);
		Text txt = new Text("What do you want to do?");
		pane.add(txt, 0, 0);
		Button salary = new Button("calculate salary");
		pane.add(salary, 0, 1);
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();



		
		CalculateSalary(salary);




		
	}
	public static void CalculateSalary(Button salary) {
		salary.setOnAction(e ->{
			SalaryButton sc = new SalaryButton();
			sc.button();
		});
	}

}
