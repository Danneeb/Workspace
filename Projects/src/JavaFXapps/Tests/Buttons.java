package JavaFXapps.Tests;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Buttons {

	public void button() {
		Stage newWindow = new Stage();
		newWindow.setTitle("Salary Calculator");

		GridPane salaryPane = new GridPane();
		salaryPane.setPadding(new Insets(10,10,10,10));
		salaryPane.setVgap(5.0);
		salaryPane.setHgap(5.0);
		Scene sceSalary = new Scene(salaryPane);
		newWindow.setScene(sceSalary);
		newWindow.show();
	}
}
