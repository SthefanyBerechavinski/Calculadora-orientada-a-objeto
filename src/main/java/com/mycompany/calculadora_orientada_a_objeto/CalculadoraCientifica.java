/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora_orientada_a_objeto;

/**
 *
 * @author sthefany.1921
 */
public class CalculadoraCientifica extends Calculadora {
    public double raizQuadrada(double a){
        return Math.sqrt(a);
    }
    
    public double potencia(double a, double b){
        return Math.pow(a, b);
    }
    
    public double porcentagem(double a, double b){
        return (a*b)/100;
    }
    
    public double raizCubica(double a){
        return Math.cbrt(a);
    }
}
