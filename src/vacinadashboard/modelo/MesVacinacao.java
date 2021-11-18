/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vacinadashboard.modelo;

/**
 *
 * @author lgustavogdc
 */
public class MesVacinacao {
    private static int primeiraDoseMes = 0;
    private static int segundaDoseMes = 0;

    public void setPrimeiraDoseMes(int primeiraDoseMes) {
        this.primeiraDoseMes = primeiraDoseMes;
    }

    public void setSegundaDoseMes(int segundaDose) {
        this.segundaDoseMes = segundaDose;
    }

    public static int getPrimeiraDoseMes() {
        return primeiraDoseMes;
    }

    public static int getSegundaDoseMes() {
        return segundaDoseMes;
    }
}
