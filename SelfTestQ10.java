// Demonstrate JavaFX events and buttons.

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class SelfTestQ10 extends Application {

	Label response;
	
	public static void main(String[] args) {

		// Start the JavaFX application by calling launch().
		launch(args);
	}
	
	// Override the start() method.
	public void start(Stage myStage) {
		
		// Give the stage a title.
		myStage.setTitle("Use JavaFX Buttons and Events.");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane rootNode = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		rootNode.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene myScene = new Scene(rootNode, 300, 100);
		
		// Set the scene on the stage.
		myStage.setScene(myScene);
		
		// Create a label.
		response = new Label("Push a Button");
		
		// Create two push buttons.
		Button btnUp = new Button("Run");
		Button btnDown = new Button("Exit");
		
		// Handle the action events for the Up button.
		btnUp.setOnAction((ae) -> response.setText("You pressed Run."));
			
		
		
		// Handle the action events for the Down button.
		btnDown.setOnAction((ae) -> Platform.exit());
		
		// Add the label and buttons to the scene graph.
		rootNode.getChildren().addAll(btnUp, btnDown, response);
		
		// Show the stage and its scene.
		myStage.show();
	}

}




















