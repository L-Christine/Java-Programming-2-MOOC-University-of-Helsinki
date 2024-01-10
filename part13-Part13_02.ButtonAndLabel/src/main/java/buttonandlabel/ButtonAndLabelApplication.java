package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {
    
    public void start(Stage window) {
        Label textComp = new Label("Text");
        Button buttonComp = new Button("Button");
        
        FlowPane compGroup = new FlowPane();
        compGroup.getChildren().add(textComp);
        compGroup.getChildren().add(buttonComp);
        
        Scene view = new Scene(compGroup);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
        System.out.println("Hello world!");
    }

}
