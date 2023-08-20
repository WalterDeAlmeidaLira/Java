package EstruturaDeDados.Aula02;
import java.util.Scanner;

public class Temperatura{
	public static void main(String[] args) {
		double[] temp = new double[7];
		Scanner leitor = new Scanner(System.in);
		int soma = 0, media, contador=1 , acima = 0, abaixo =0;
		for(int i = 0; i < temp.length; i++) {
			System.out.println("digite a temperatur do "+ contador + " dia");
			contador++;
			int valor = leitor.nextInt();
			temp[i]= valor;
			soma += valor;
		}		
		media = soma/7;
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] >= media) {
				acima++;
			}
			if(temp[i] < media) {
				abaixo++;
			}
		}
		System.out.println("A media da temperatura na semana foi de " + media+"°");
		System.out.println("A temperatura fico acima da media durante " + acima);
		System.out.println("A temperatura fico abaixo da media durante " + abaixo);
	}
}
