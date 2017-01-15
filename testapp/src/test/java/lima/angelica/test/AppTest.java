package lima.angelica.test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lima.angelica.app.Main;
import org.junit.Test;
import org.loadui.testfx.GuiTest;
import java.io.*;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by Angelica on 15/01/2017.
 */
public class AppTest extends GuiTest {

    protected Parent getRootNode() {
        Parent root = null;
            FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("/lima/angelica/app/sample.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return root;

    }

    @Test
    public void testDataBaseCreate(){
        final Button button = find("#btnCreateDatabase");
        final Label label = find("#labelStatus");
        click(button);
        assertEquals(label.getText(),"created");

        BufferedReader file ;
        boolean fileExists = false;
        try {
            file = new BufferedReader(new FileReader("c:/users/angelica/desktop/database.txt"));
            fileExists = true;
        }
        catch (IOException ex){

        }
        System.out.print(fileExists);
        assertTrue(fileExists);

    }
}
