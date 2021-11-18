package vacinadashboard.dados;

import vacinadashboard.modelo.Vacinacao;

import java.io.*;
import java.util.ArrayList;

public class dadosVacinacao {
    public void cadastrarVacinacao (Vacinacao v) throws FileNotFoundException,
            IOException, ClassNotFoundException{
        ArrayList <Vacinacao> vacinacoes = new ArrayList();
        File arq = new File ("listaVacinacoes.ser");
        if (arq.exists()){
            vacinacoes = listarVacinacoes();
        }
        vacinacoes.add(v);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(vacinacoes);
        }
    }

    public ArrayList<Vacinacao> listarVacinacoes() throws FileNotFoundException,
            IOException, ClassNotFoundException{
        ArrayList <Vacinacao> vacinacoes;
        File arq = new File ("listaVacinacoes.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        vacinacoes = (ArrayList<Vacinacao>) lerObj.readObject();
        return vacinacoes;
    }

}