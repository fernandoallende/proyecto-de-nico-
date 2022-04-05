/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Objects;
import java.util.Scanner;
import matematicas.Matematicas;

/**
 *
 * @author User
 */
public class Service {

    Scanner leer = new Scanner(System.in);

    public boolean devolverMayor(Matematicas m) {
        boolean devolverMayor = false;
        if (m.getNum1() > m.getNum2()) {
            devolverMayor = true;
        } else {
            if (m.getNum1() < m.getNum2()) {
                devolverMayor = false;
            } else {
                if (Objects.equals(m.getNum1(), m.getNum2())) {
                    System.out.println("los numeros son iguales");
                }
            }
        }
        return devolverMayor;
    }

    public void calcularPotencia(Matematicas m) {
        double calcularPotencia = 0;

        if (this.devolverMayor(m) == true) {
            calcularPotencia = Math.pow(Math.round(m.getNum1()), Math.round(m.getNum2()));
        } else {
            if (this.devolverMayor(m) == false) {
                calcularPotencia = Math.pow(Math.round(m.getNum2()), Math.round(m.getNum1()));
            }
        }
        System.out.println("la potencia es de " + calcularPotencia);
    }

    public void calculaRaiz(Matematicas m) {
        double calcularRaiz = 0;
        if (this.devolverMayor(m) == true) {
            calcularRaiz = Math.sqrt(Math.abs(m.getNum2()));
        } else {
            if (this.devolverMayor(m) == false) {
                calcularRaiz = Math.sqrt(Math.abs(m.getNum1()));
            }
        }
        System.out.println("la raiz cuadrada es " + calcularRaiz);
    }
}
