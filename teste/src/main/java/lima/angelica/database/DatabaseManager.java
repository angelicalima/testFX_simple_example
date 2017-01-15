/**
 * Created by Angelica on 14/01/2017.
 */

package lima.angelica.database;

import java.io.FileWriter;
import java.io.IOException;

public class DatabaseManager {
    public static void createDatabase( String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write("gravei");
        writer.close();
    }
}
