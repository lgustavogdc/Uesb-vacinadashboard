package vacinadashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Luís Gustavo Gonçalves
 * @author Mateus Spinola
 * @author Guilherme Santos
 * 
 */
public class VacinaDashboard extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLLoginController.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        scene.setFill(Color.web("#0D1117"));
        
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
