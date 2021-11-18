package vacinadashboard;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author lgustavogdc
 */
public class FXMLMainPageController implements Initializable {
   @FXML
    private MenuItem menuItemCadastros;
    
    @FXML
    private MenuItem menuItemRelatorios;
    
    @FXML
    private AnchorPane anchorPane;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    public void showFXMLCadastrosController() throws IOException{
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLCadastrosController.fxml"));
        anchorPane.getChildren().setAll(a);
    }
    
    @FXML
    public void showFXMLRelatoriosController() throws IOException{
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLRelatoriosController.fxml"));
        anchorPane.getChildren().setAll(a);
    }   
}
