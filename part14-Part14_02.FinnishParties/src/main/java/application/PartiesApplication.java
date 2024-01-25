package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public void start(Stage stage) {
        List<String[]> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get("partiesdata.tsv"))
                    .map(row -> row.split("\t"))
                    .forEach(l -> rows.add(l));
        } catch (IOException ex) {
            System.out.println("Error: reading the file");
            return;
        }
        
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
//Each data set
        for (int i = 1; i < rows.size(); i++) {
            String[] row = rows.get(i);
            
            XYChart.Series data = new XYChart.Series();
            data.setName(row[0]); //row[0] = party(each data set)
            
            for (int column = 1; column < row.length; column++) {
                String value = row[column];
                if (value.equals("-")) {
                    continue;
                }
                int year = Integer.parseInt(rows.get(0)[column]);
                data.getData().add(new XYChart.Data(year, Double.parseDouble(value)));
            }
            
            lineChart.getData().add(data);
        }
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
