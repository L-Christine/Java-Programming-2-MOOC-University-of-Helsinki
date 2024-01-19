package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button firstBtn = new Button("Joke");
        Button secondBtn = new Button("Answer");
        Button thirdBtn = new Button("Explanation");
        
        menu.getChildren().addAll(firstBtn, secondBtn, thirdBtn);
        layout.setTop(menu);
        
        StackPane layout1 = createView("What do you call a bear with no teeth?");
        StackPane layout2 = createView("A gummy bear.");
        StackPane layout3 = createView("gummy bear is a candy");
        
        firstBtn.setOnAction((event) -> layout.setCenter(layout1));
        secondBtn.setOnAction((event) -> layout.setCenter(layout2));
        thirdBtn.setOnAction((event) -> layout.setCenter(layout3));
        
        layout.setCenter(layout1);
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text){
        StackPane layout = new StackPane(); 
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
