import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class JavaFX_tester extends Application {
    public static void run(){
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        String version = System.getProperty("javafx.version");
        Label label = new Label("Hello from JavaFX: " + version + " ");
        Label fisk = new Label("Fisk er en myte!");
        //TextField hejsa = new TextField("Fisk er landdyr");
        //StackPane stackPane = new StackPane(label);
        GridPane pane = new GridPane();
        //pane.setGridLinesVisible(true);
        //stackPane.getChildren().add(hejsa);
        //stackPane.getChildren().add(new Label("Hej IT 62450!"));
        //stackPane.add(label, 3, 2);
        pane.add(label,0,0);
        pane.add(fisk, 2,2);
        Scene scene = new Scene(pane, 1000,600);
        stage.setScene(scene);
        stage.show();
    }
}
