package br.senac.pi;

import java.util.Scanner;

public class Entradadedados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	
   System.out.println("Ol�!");//Mensagem inicial
   System.out.println("Digite um n�mero:");//interage com o usu�rio
   Scanner s = new Scanner(System.in);//Prepara entrada de dados
   int valor = s.nextInt(); //Faz a leitura de dados
   System.out.println("valor = " + valor);// imprime o valor lido
   s.close();//libera o recuso d entrada de dados
}}
