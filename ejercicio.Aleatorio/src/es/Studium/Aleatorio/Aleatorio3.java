package es.Studium.Aleatorio;

import java.util.Random;
public class Aleatorio3
{
	public static void main(String[] args) {
		Random rnd=new Random(); //Creamos el objeto para generar numero ramdom
		//creamos un mientras para ejecutar el ramdon 10 veces
			//Saca numeros del 1 al 6
			System.out.println(rnd.nextInt(6)+1); //Le hemos sumado +1 para evitar que nos saque del 0-5
	} 
}