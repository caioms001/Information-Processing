import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args){
		Scanner entry = new Scanner(System.in);
		float imc, weight, heigth;
		System.out.print("Digite o peso: ");
		weight = entry.nextFloat();
		System.out.print("Digite a altura: ");
		heigth = entry.nextFloat();
		imc = weight / (heigth * heigth);
		System.out.print("IMC = " + imc + " - ");
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso ideal");
		} else if (imc <= 24.9) {
			System.out.println("Parabéns - você está no seu peso normal!");
		} else if (imc <= 29.9) {
			System.out.println("Você está acima do seu peso (sobrepeso)");
		} else if (imc <= 34.9) {
			System.out.println("Obesidade grau I");
		} else if (imc <= 39.9) {
			System.out.println("Obesidade grau II");
		} else {
			System.out.println("Obesidade grau III");
		}
	}
}