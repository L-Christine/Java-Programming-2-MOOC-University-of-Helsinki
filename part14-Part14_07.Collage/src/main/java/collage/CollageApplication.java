package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {
        Image sourceImage = new Image("file:monalisa.png");
        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
        
        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {
 
                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();
 
                Color newColor = new Color(red, green, blue, opacity);
 
                imageWriter.setColor(xCoordinate, yCoordinate, newColor);
 
                xCoordinate++;
            }
 
            yCoordinate++;
        }
        
        //small image
        for (int x = 0; x < width / 2; x++) {
            for (int y = 0; y < height / 2; y++) {
                Color color = imageReader.getColor(x * 2, y * 2);
                imageWriter.setColor(x, y, color);
            }
        }
        
        //copy the small image
        imageReader = targetImage.getPixelReader();
        for (int x = 0; x < width / 2; x++) {
            for (int y = 0; y < height / 2; y++) {
                Color color = imageReader.getColor(x, y);
 
                imageWriter.setColor(x + width / 2, y, color);
                imageWriter.setColor(x, y + height / 2, color);
                imageWriter.setColor(x + width / 2, y + height / 2, color);
            }
        }
        
        //negative image
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = imageReader.getColor(x, y);
 
                double r = 1 - color.getRed();
                double g = 1 - color.getGreen();
                double b = 1 - color.getBlue();
 
                Color negative = new Color(r, g, b, color.getOpacity());
 
                imageWriter.setColor(x, y, negative);
            }
        }
 
        ImageView image = new ImageView(targetImage);
        
        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
