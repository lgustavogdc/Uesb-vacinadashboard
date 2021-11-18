package vacinadashboard;

import vacinadashboard.modelo.Vacinacao;
import vacinadashboard.controle.VacinacoesRealizadas;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class FXMLRelatoriosController implements Initializable {
    @FXML
    private BarChart<String, Integer> primeiraDose;
    
    @FXML
    private BarChart<String, Integer> segundaDose;
    
    @FXML
    private Label totalDeDoses;
    
    @FXML
    private Label totalDePessoasImunizadas;
    
    @FXML
    private CategoryAxis xAxis;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int janeiro1Dose = 0, fevereiro1Dose = 0,  marco1Dose = 0,
                abril1Dose = 0,maio1Dose = 0,junho1Dose = 0,
                julho1Dose = 0,agosto1Dose = 0,setembro1Dose = 0,
                outubro1Dose = 0,novembro1Dose = 0,dezembro1Dose = 0; 
        
        int janeiro2Dose = 0, fevereiro2Dose = 0, marco2Dose = 0,
                abril2Dose = 0,maio2Dose = 0,junho2Dose = 0,
                julho2Dose = 0,agosto2Dose = 0,setembro2Dose = 0,
                outubro2Dose = 0,novembro2Dose = 0, dezembro2Dose = 0;
        
        int totalDePessoasCompletamenteVacinadas = 0;
            try{
                XYChart.Series<String, Integer> series1dose = new XYChart.Series<>();
                XYChart.Series<String, Integer> series2dose = new XYChart.Series<>();
                VacinacoesRealizadas vr = new VacinacoesRealizadas();
                ArrayList <Vacinacao> vacinacoes = vr.listarVacinacoes();
                if(vacinacoes.size() >= 1){
                     totalDeDoses.setText(Integer.toString(vacinacoes.size()));
                 for(int i = 0; i < vacinacoes.size(); i++){
                      Vacinacao v = vacinacoes.get(i);
                      if(v.getTipoDeDose().equals("2")){
                        totalDePessoasCompletamenteVacinadas++;
                        System.out.println("totalDePessoasCompletamenteVacinadas" + totalDePessoasCompletamenteVacinadas+ "  ");
                      }
                      if(v.getDataDoVacinado().getMonth().toString().equals("JANUARY")){
                        if(v.getTipoDeDose().equals("1")){
                        janeiro1Dose++;
                        }else{
                           janeiro2Dose++;
                        }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("FEBRUARY")){
                          if(v.getTipoDeDose().equals("1")){
                            fevereiro1Dose++;
                        }else{
                           fevereiro2Dose++;
                        }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("MARCH")){
                          if(v.getTipoDeDose().equals("1")){
                            marco1Dose++;
                        }else{
                           marco2Dose++;
                        }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("MAY")){
                      if(v.getTipoDeDose().equals("1")){
                            maio1Dose++;
                        }else{
                          maio2Dose++;
                        }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("JUNE")){
                        if(v.getTipoDeDose().equals("1")){
                            junho1Dose++;
                        }else{
                            junho2Dose++;
                        }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("JULY")){
                          if(v.getTipoDeDose().equals("1")){
                            junho1Dose++;
                        }else{
                            junho2Dose++;
                        }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("SEPTEMBER")){
                           if(v.getTipoDeDose().equals("1")){
                            setembro1Dose++;
                        }else{
                            setembro2Dose++;
                        }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("OCTOBER")){
                           if(v.getTipoDeDose().equals("1")){
                            outubro1Dose++;
                        }else{
                            outubro2Dose++;
                        }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("NOVEMBER")){
                           if(v.getTipoDeDose().equals("1")){
                             novembro1Dose++;
                             }else{
                             novembro2Dose++;
                            }
                    }
                    if(v.getDataDoVacinado().getMonth().toString().equals("DECEMBER")){
                        if(v.getTipoDeDose().equals("1")){
                             dezembro1Dose++;
                             }else{
                              dezembro2Dose++;
                           }
                    }
                  }
                 System.out.println("totalDePessoasCompletamenteVacinadas" + totalDePessoasCompletamenteVacinadas+ "  ");
                 totalDePessoasImunizadas.setText(Integer.toString(totalDePessoasCompletamenteVacinadas));
                }

                  series1dose.getData().add(new XYChart.Data<>("Janeiro", janeiro1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Fevereiro", fevereiro1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Março", marco1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Abril", abril1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Maio", maio1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Junho", junho1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Julho", julho1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Agosto", agosto1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Setembro", setembro1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Outubro", outubro1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Novembro", novembro1Dose));
                  series1dose.getData().add(new XYChart.Data<>("Dezembro", dezembro1Dose));
                  series1dose.setName("Total por mês");

                  series2dose.getData().add(new XYChart.Data<>("Janeiro", janeiro2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Fevereiro", fevereiro2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Março", marco2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Abril", abril2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Maio", maio2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Junho", junho2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Julho", julho2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Agosto", agosto2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Setembro", setembro2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Outubro", outubro2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Novembro", novembro2Dose));
                  series2dose.getData().add(new XYChart.Data<>("Dezembro", dezembro2Dose));
                  series2dose.setName("Total por mês");

                  primeiraDose.getData().add(series1dose);
                  segundaDose.getData().add(series2dose);
          }catch(FileNotFoundException erro){
                System.out.println("Erro: " + erro.getMessage());
          }catch(IOException erro){
                System.out.println("Erro: " + erro.getMessage());
          }catch(ClassNotFoundException erro){
                System.out.println("Erro: " + erro.getMessage());
          }
        
    }    
    
}
