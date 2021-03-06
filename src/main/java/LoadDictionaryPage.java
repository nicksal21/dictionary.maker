import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoadDictionaryPage extends Application {
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Load Dictionary");

        GridPane grid = MainPage.makeGrid(Pos.CENTER);

        Text title = MainPage.makeTextLabel("Load New Dictionary", "Arial", FontWeight.EXTRA_BOLD, 32);

        Button wordListButton = MainPage.makeButton("View Word List");
        wordListButton.setOnAction(event -> {
        });

        HBox wordListBox = MainPage.makeHBox(wordListButton, 10, Pos.CENTER);

        Button grammarListButton = MainPage.makeButton("View Grammar Rules");
        wordListButton.setOnAction(event -> {
        });

        HBox grammarBox = MainPage.makeHBox(grammarListButton, 10, Pos.CENTER);

        wordListButton.setPrefWidth(grammarBox.getWidth());

        // Add elements to grid
        grid.add(title, 0, 0, 2 ,1);
        grid.add(wordListBox, 1, 2, 1 ,1);
        grid.add(grammarBox, 1, 3, 1 ,1);

        // Creates scene
        Scene scene = new Scene(grid, 500, 500);

        // Sets scene
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}