package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public void start(Stage window) {
        
        BorderPane layout1 = new BorderPane();
        layout1.setTop(new Label("First view!"));
        Button button1 = new Button("To the second view!");
        layout1.setCenter(button1);
        
        VBox layout2 = new VBox();
        Button button2 = new Button("To the third view!");
        Label text2 = new Label("Second view!");
        layout2.getChildren().addAll(button2, text2);
        
        GridPane layout3 = new GridPane();
        layout3.add(new Label("Third view!"), 0, 0);
        Button button3 = new Button("To the first view!");
        layout3.add(button3, 1, 1);
        
        Scene scene1 = new Scene(layout1);
        Scene scene2 = new Scene(layout2);
        Scene scene3 = new Scene(layout3);
        
        button1.setOnAction((event) -> {
            window.setScene(scene2);
        });
        button2.setOnAction((event) -> {
            window.setScene(scene3);
        });
        button3.setOnAction((event) -> {
            window.setScene(scene1);
        });
        
        window.setScene(scene1);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
