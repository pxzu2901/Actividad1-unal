/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

/**
 *
 * @author Administrator
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double horas_trabajadas, valor_hora, retencion, salario_bruto, salario_neto;
        valor_hora = 5000;
        horas_trabajadas= 48;
        salario_bruto = valor_hora * horas_trabajadas;
        retencion= salario_bruto * (12.0/100);
        salario_neto=salario_bruto-retencion; 

        System.out.println("El salario bruto es: " + salario_bruto + "\n" + "La retencion es: " + retencion + "\n" + "El salario neto es: " + salario_neto);
    }
}
