package uni.makarov.hw.antlr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AntlrApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        AntlrController antlrController = new AntlrController();
        AntlrView antlrView = new AntlrView(antlrController);

        Scene scene = new Scene(antlrView.asParent(), 800, 400);

        stage.setTitle("Antlr");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}