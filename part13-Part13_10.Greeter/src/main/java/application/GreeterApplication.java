package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public void start(Stage window) {

        Label askName = new Label("Enter your name and start");
        TextField enterName = new TextField();
        Button startButton = new Button("Start");

        GridPane layout1 = new GridPane();
        layout1.add(askName, 0, 0);
        layout1.add(enterName, 0, 1);
        layout1.add(startButton, 0, 2);

        layout1.setPrefSize(300, 180);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));

        Scene ask = new Scene(layout1);
        
        Label greetName = new Label("");

        BorderPane layout2 = new BorderPane();
        layout2.setCenter(greetName);
        
        Scene greet = new Scene(layout2);
        
        startButton.setOnAction((event) -> {
            greetName.setText("Welcome " + enterName.getText() + "!");
            window.setScene(greet);
        });
        
        window.setScene(ask);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
