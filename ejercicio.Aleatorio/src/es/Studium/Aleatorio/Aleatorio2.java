package es.Studium.Aleatorio;

import java.util.Random;
public class Aleatorio2
{
	public static void main(String[] args) {
		Random rnd=new Random(); //Creamos el objeto para generar numero ramdom
		//creamos un mientras para ejecutar el ramdon 10 veces
		int i,x;
		for(i=0;i<10;i++) {
			x=rnd.nextInt(1000);//Saca numeros del 0 al 999
			System.out.println(x); }
	} 
}