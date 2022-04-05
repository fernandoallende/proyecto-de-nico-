/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9;

import matematicas.Matematicas;
import service.Service;

/**
 *
 * @author User
 */
public class Poo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematicas m = new Matematicas();
        m.setNum1(Math.random());
        m.setNum2(Math.random());
        Service s = new Service();
        s.devolverMayor(m);
        s.calcularPotencia(m);
        s.calculaRaiz(m);
    }
    
}
