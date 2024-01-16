package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public void start(Stage window) {
        BorderPane layout = new BorderPane();
     
        Label letterLabel = new Label("Letters: 0");
        Label wordLabel = new Label("Words: 0");
        Label longLabel = new Label("The longest word is: ");
        
        HBox text = new HBox();
        text.setSpacing(10);
        text.getChildren().add(letterLabel);
        text.getChildren().add(wordLabel);
        text.getChildren().add(longLabel);
        
        TextArea textBox = new TextArea("");
        textBox.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            letterLabel.setText("Letters: " + characters);
            wordLabel.setText("Words: " + words);
            longLabel.setText("The longest word is: " + longest);
        });

        layout.setBottom(text);
        layout.setCenter(textBox);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}