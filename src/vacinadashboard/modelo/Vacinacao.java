
package vacinadashboard.modelo;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author lgustavogdc
 */
public class Vacinacao implements Serializable {
    private String nomeDoVacinado;
    private int idadeDoVacinado;
    private String CPFDoVacinado;
    private String VacinaDoVacinado;
    private LocalDate dataDoVacinado;
    private String tipoDeDose;
    
    public Vacinacao(String nome, int idade, String CPF, String vacina ,String tipo){
        this.dataDoVacinado = LocalDate.now();
        this.nomeDoVacinado = nome;
        this.idadeDoVacinado = idade;
        this.CPFDoVacinado = CPF;
        this.tipoDeDose = tipo;
        this.VacinaDoVacinado = vacina;
    }

    public String getNomeDoVacinado() {
        return nomeDoVacinado;
    }

    public int getIdadeDoVacinado() {
        return idadeDoVacinado;
    }

    public String getCPFDoVacinado() {
        return CPFDoVacinado;
    }

    public String getVacinaDoVacinado() {
        return VacinaDoVacinado;
    }

    public LocalDate getDataDoVacinado() {
        return dataDoVacinado;
    }

    public String getTipoDeDose() {
        return tipoDeDose;
    }

    public void setNomeDoVacinado(String nomeDoVacinado) {
        this.nomeDoVacinado = nomeDoVacinado;
    }

    public void setIdadeDoVacinado(int idadeDoVacinado) {
        this.idadeDoVacinado = idadeDoVacinado;
    }

    public void setCPFDoVacinado(String CPFDoVacinado) {
        this.CPFDoVacinado = CPFDoVacinado;
    }

    public void setVacinaDoVacinado(String VacinaDoVacinado) {
        this.VacinaDoVacinado = VacinaDoVacinado;
    }

    public void setDataDoVacinado(LocalDate dataDoVacinado) {
        this.dataDoVacinado = dataDoVacinado;
    }

    public void setTipoDeDose(String tipoDeDose) {
        this.tipoDeDose = tipoDeDose;
    }
    
    
}
