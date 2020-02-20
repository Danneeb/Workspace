package db222pt_assign2.Exercise7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CompoundInterest extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage)  {
		
		
		
		primaryStage.setTitle("Compound Interest");
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10,10,10,10));
		pane.setHgap(5.0);
		pane.setVgap(5.0);
		
		Text txt1 = new Text("Start Amount: ");
		final TextField startAmount = new TextField();
		pane.add(txt1, 0, 0);
		pane.add(startAmount, 1, 0);
		
		Text txt2 = new Text("Interest: ");
		final TextField interest = new TextField();
		pane.add(txt2, 0, 1);
		pane.add(interest, 1, 1);
		
		Text txt3 = new Text("Number of Years: ");
		final TextField noy = new TextField();
		pane.add(txt3, 0, 2);
		pane.add(noy, 1, 2);
		
		Button btn1 = new Button("Calculate");
		pane.add(btn1, 0, 3);
		
		final Label result = new Label();
		pane.add(result, 0, 4);
		
		
		
		btn1.setOnAction(Event ->{
			String start = startAmount.getText();
			String inte  = interest.getText();
			String nYear = noy.getText();
			Double startInt = Double.parseDouble(start);
			Double inteInt = Double.parseDouble(inte);
			Double nYearInt = Double.parseDouble(nYear);
			
			double totInt = (inteInt/100)+1;
			double powerOf = Math.pow(totInt, nYearInt);
			double totSum = powerOf*startInt;
			result.setText(Double.toString(Math.round(totSum)));
			
		});
		
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}