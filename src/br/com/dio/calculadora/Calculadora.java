package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  =  new Scanner(System.in);
		int a,b;
		
		System.out.println("Digite um valor:");
		a = scan.nextInt();
		System.out.println("Digite um valor:");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int divisao = divisao(a,b);
		int multiplicacao = multiplicacao(a,b);
		
		System.out.println("soma :"+ soma);
		System.out.println("subtracao :"+subtracao);
		System.out.println("multiplicacao :"+multiplicacao);
		System.out.println("divisao :2"+divisao);
	}
	public static int soma (int a, int b)
	{
		return a+b;
	}
	public static int subtracao (int a,int b)
	{
		return a-b;
	}
	public static int divisao(int a,int  b)
	{
		return a/b;
	}
	public static int multiplicacao(int a,int b)
	{
		return a*b;
	}
}
