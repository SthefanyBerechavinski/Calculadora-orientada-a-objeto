/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_orientada_a_objeto;

import java.util.Scanner;

/**
 *
 * @author sthefany.1921
 */
public class ProgramaCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora= new Calculadora();
        CalculadoraCientifica cc= new CalculadoraCientifica();

        Scanner scanner= new Scanner(System.in);
        int opcao;
        float num1=0, num2=0;
        
        boolean continuar=true;
        
        String escolha;
        
        while(continuar){
            
            System.out.println("-----Calculadora Científica----- ");
            System.out.println( "Selecione uma opção:");
            System.out.println("-----------------------");
            System.out.println("| 1 - Soma            |");
            System.out.println("| 2 - Subtração       |");
            System.out.println("| 3 - Multiplicação   |");
            System.out.println("| 4 - Divisão         |");
            System.out.println("| 5 - Raíz Quadrada   |");
            System.out.println("| 6 - Potência        |");
            System.out.println("| 7 - Porcentagem     |");
            System.out.println("| 8 - Raíz Cúbica     |");
            System.out.println("-----------------------");
            opcao=scanner.nextInt();

            if(opcao == 1){
                System.out.println("Informe o primeiro valor:");
                num1= scanner.nextFloat();
                System.out.println("Informe o segundo valor:");
                num2= scanner.nextFloat();
                System.out.println("Resultado da soma: " + calculadora.somar(num1, num2));
            }
            else if(opcao == 2){
                System.out.println("Informe o primeiro valor:");
                num1= scanner.nextFloat();
                System.out.println("Informe o segundo valor:");
                num2= scanner.nextFloat();
                System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
            }
            else if(opcao == 3){
                System.out.println("Informe o primeiro valor:");
                num1= scanner.nextFloat();
                System.out.println("Informe o segundo valor:");
                num2= scanner.nextFloat();
                System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(num1, num2));
            }
            else if(opcao == 4){
                System.out.println("Informe o primeiro valor:");
                num1= scanner.nextFloat();
                System.out.println("Informe o segundo valor:");
                num2= scanner.nextFloat();
                System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));
            }
            else if(opcao == 5){
                System.out.println("Informe o valor:");
                num1= scanner.nextFloat();
                System.out.println("A raíz quadrada é: " + cc.raizQuadrada(num1));
            }
            else if(opcao == 6){
                System.out.println("Informe o primeiro valor:");
                num1= scanner.nextFloat();
                System.out.println("Informe o segundo valor:");
                num2= scanner.nextFloat();
                System.out.println("Resultado da potência: " + cc.potencia(num1, num2));
            }
            else if(opcao == 7){
                System.out.println("Informe o primeiro valor:");
                num1= scanner.nextFloat();
                System.out.println("Informe o segundo valor:");
                num2= scanner.nextFloat();
                System.out.println("Resultado da porcentagem: " + cc.porcentagem(num1, num2));
            }
            else if(opcao == 8){
                System.out.println("Informe o primeiro valor:");
                num1= scanner.nextFloat();
                System.out.println("Resultado: " + cc.raizCubica(num1));
            }
            
            System.out.println("Deseja continuar? (S/N)");
            escolha=scanner.next();
            
            if(escolha.equals("S") || escolha.equals("s")){
                continuar=true;
            }else{
                continuar=false;
            }
        }
    }
}
