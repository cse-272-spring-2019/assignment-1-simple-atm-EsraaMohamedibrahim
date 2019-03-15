
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 

public class HomeWindow {
int x;
Stage stage;
Scene scene;
 
Transaction transaction=new Transaction();
History history=new History(null);
//GUI loginForm;
	
public HomeWindow(Stage s) {
	stage=s;
};
	
	public void prepareScene(){
		Label welcome =new Label("Welcome To My ATM ");	
		Button deposit =new Button ("Deposit");
		Button withdraw=new Button ("Withdraw");
		Button balance=new Button ("Balance Inqury");
		Button previous=new Button ("Previous");
		Button next=new Button ("Next");

        Label w = new Label("Enter the amount you want to withdraw/deposit       ");
        TextField textfield = new TextField();

		
     
        Label label = new Label();
		
		GridPane grid =new GridPane();
		
		grid.add(welcome, 0, 0);
		grid.add(deposit, 1, 2);
		grid.add(withdraw, 1, 3);
		grid.add(balance, 1, 4);
		grid.add(previous, 1, 5);
		grid.add(next, 1, 6);		
        grid.add(textfield, 1, 8);
        grid.add(w,0,8);
        
        
       
        
        grid.add(label, 0,9);
    
		
		
	        
		deposit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				double t =Double.parseDouble(textfield.getText());
			if (t<=0) {
				label.setText("Insufficient amount.");
			}
			else {
				transaction.deposit(t);
				label.setText("You successfully deposited"+t+" to your balance.");
			}

			}   

		});
		
		
		withdraw.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				double x =Double.parseDouble(textfield.getText());
				if (x<0)
				{
					label.setText ("enter positive amount");
				}
				else if(x>(transaction.getBalance()))
				{
					label.setText("There is not enough credit ");
				}
				else {
					transaction.withdraw(x);
					label.setText("You successfully withdraw the amount ");
				}

			}   

		});
		
		
		balance.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
label.setText("Your current balance: "+transaction.getBalance());


			}   

		});
		
		
		
		previous.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
		   history.historyarr.get(x--)  ;
		   
			}
		});
		
		
		
		next.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
        		
			history.historyarr.get(x++);	
			}   

		});		
		
		
scene=new Scene (grid,600,400);


	}


	public Scene getScene() {
		return scene;
	}
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	/*public void setLoginForm(GUI loginForm) {
		this.loginForm = loginForm;
	}
	
	
	*/
}

