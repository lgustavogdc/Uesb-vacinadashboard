package vacinadashboard.controle;

import java.util.ArrayList;
import vacinadashboard.dados.dadosVacinacao;
import java.io.FileNotFoundException;
import java.io.IOException;
import vacinadashboard.modelo.Vacinacao;

/**
 *
 * @author lgustavogdc
 */
public class VacinacoesRealizadas {
    public void cadastrarVacinas(String nome, int idade, String CPF, String vacina ,String tipo) throws IOException, ClassNotFoundException, FileNotFoundException {
        Vacinacao v = new Vacinacao(nome, idade, CPF, vacina, tipo);
        dadosVacinacao dv = new dadosVacinacao();
        dv.cadastrarVacinacao(v);
    }
    
    public ArrayList<Vacinacao> listarVacinacoes() throws IOException, ClassNotFoundException, FileNotFoundException {
        dadosVacinacao dv = new dadosVacinacao();
        return dv.listarVacinacoes();
    }
}



