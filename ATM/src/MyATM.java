import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyATM extends Application {
	public static void main (String args[])
	{
		
		launch(args);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ATM");
		GUI loginForm=new GUI(primaryStage);
		HomeWindow homewindow=new HomeWindow(primaryStage);
		homewindow.prepareScene();
		loginForm. preparescene();
		loginForm.setHomewindow(homewindow);
	//	homewindow.setLoginForm(loginForm);
	     primaryStage.setScene(loginForm.getScene());
		primaryStage.show();

	}
	
}
