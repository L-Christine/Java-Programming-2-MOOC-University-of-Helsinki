package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {
    public void start(Stage window) {
        Button buttonComp = new Button("Button");
        TextField textComp = new TextField("Text");
       
        FlowPane compGroup = new FlowPane();
        compGroup.getChildren().add(buttonComp);
        compGroup.getChildren().add(textComp);
        
        Scene view = new Scene(compGroup);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
