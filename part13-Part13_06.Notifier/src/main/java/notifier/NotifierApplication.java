package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {
    
    public void start(Stage window) {
        TextField text = new TextField();
        Button button = new Button("copy");
        Label label = new Label();
        
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });
        
        VBox compGroup = new VBox();
        compGroup.setSpacing(20);
        compGroup.getChildren().addAll(text, button, label);
        
        Scene view = new Scene(compGroup);
        window.setScene(view);
        window.show();
    }
            

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
