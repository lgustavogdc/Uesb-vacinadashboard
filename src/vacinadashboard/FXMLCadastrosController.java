package vacinadashboard;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import vacinadashboard.controle.VacinacoesRealizadas;

/**
 * FXML Controller class
 *
 * @author lgustavogdc
 */
public class FXMLCadastrosController implements Initializable {

     @FXML
    private Label lblStatus;
    
    @FXML
    private TextField nameInput;
    
    @FXML
    private TextField ageInput;
    
     @FXML
    private TextField CPFInput;
    
    @FXML
    private TextField vacinaInput;
    
     @FXML
    private TextField tipoDoseInput;
    
     
     @FXML
    private void cadastrarVacinação(ActionEvent event) throws IOException, Throwable {
        if(nameInput.getText().equals("") || 
                ageInput.getText().equals("") || 
                CPFInput.getText().equals("") || 
                vacinaInput.getText().equals("") || 
                tipoDoseInput.getText().equals("")){
                lblStatus.setText("Preencha todos os campos");
            }else{
                if(tipoDoseInput.getText().equals("1") || tipoDoseInput.getText().equals("2")){
                lblStatus.setText("Cadastro concluido com sucesso");
                    VacinacoesRealizadas v = new VacinacoesRealizadas();
                    v.cadastrarVacinas(nameInput.getText(), 
                                       Integer.parseInt(ageInput.getText()),
                                       CPFInput.getText(), 
                                       vacinaInput.getText(),  
                                       tipoDoseInput.getText());
                } else{
                    lblStatus.setText("Preencha o tipo de dose da vacina corretamente (1 ou 2)");
                }
            }
    }
    
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
