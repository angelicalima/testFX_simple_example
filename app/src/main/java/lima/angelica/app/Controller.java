package lima.angelica.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import lima.angelica.database.DatabaseManager;

import java.io.IOException;

public class Controller {
    @FXML
    private Button btnCreateDatabase;
    @FXML
    private Label labelStatus;

    @FXML
    public void createDatabase(){
        try {
            DatabaseManager.createDatabase("c:\\users\\angelica\\desktop\\database.txt");
            labelStatus.setTextFill(Paint.valueOf("green"));
            labelStatus.setText("created");
        }
        catch (IOException ex) {
            labelStatus.setTextFill(Paint.valueOf("red"));
            labelStatus.setText("Error");
        }
    }
}
