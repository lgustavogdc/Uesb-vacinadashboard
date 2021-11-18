package vacinadashboard;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author lgustavogdc
 */
public class FXMLLoginController implements Initializable {
    
    @FXML
    private Label lblStatus;
    
    @FXML
    private TextField txtUsername;
    
    @FXML
    private TextField txtPassword;
    
    @FXML
    private void Login(ActionEvent event) throws IOException, Throwable {
        if(txtUsername.getText().equals("medicasso") 
           && txtPassword.getText().equals("senha")){
            lblStatus.setText("Entrou com sucesso");
            Stage mainStage = (Stage) lblStatus.getScene().getWindow();
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("FXMLMainPageController.fxml"));
        
            Scene scene = new Scene(root, 1100, 500);
            scene.setFill(Color.web("#0D1117"));
            
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            
            mainStage.close();
        }else{
            lblStatus.setText("Login falhou");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {}    
    
}
