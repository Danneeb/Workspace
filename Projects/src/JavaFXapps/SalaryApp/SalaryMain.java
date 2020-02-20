package JavaFXapps.SalaryApp;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SalaryMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Calculate your salary");
		GridPane pane = new GridPane();
		
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(10,10,10,10));
		
		Text txt = new Text("Heej");
		pane.add(txt, 0, 0);
		
		Scene scene = new Scene(pane);
		
		stage.setScene(scene);
		stage.show();
		//testar repo från laptop
	}

}
