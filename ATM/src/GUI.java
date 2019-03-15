import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI  {
int x;
Scene scene;
Stage stage;
Transaction transaction;
HomeWindow homewindow;
public GUI(Stage stage) {
	this.stage=stage;
}


public void preparescene() {
transaction =new Transaction();
Label cardnumber =new Label("Enter your card number   ");
PasswordField passwordField=new PasswordField();
Button submit =new Button("submit");
Label validationLabel=new Label();
GridPane grid =new GridPane();
grid.add(cardnumber, 0, 0);
grid.add(passwordField, 1, 0);
grid.add(submit, 1, 3);
grid.add(validationLabel,1,5);


submit.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent event) {
	String cardnumber =passwordField.getText() ;
	
boolean  valid =  transaction.validation(cardnumber);
if (valid) {
	validationLabel.setText("It's Valid Card");
	stage.setScene(homewindow.getScene());
}
else
	
	validationLabel.setText("Sory it's invalid card");

	}

	
});
		 scene =new Scene (grid,600,400);
		
	}





	public Scene getScene() {
		return this.scene;
	}
	public void setHomewindow(HomeWindow homewindow) {
	this.homewindow = homewindow;
  
		
	
		
		
	}

	
	
}
