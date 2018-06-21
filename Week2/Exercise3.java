import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		float weight, height, imc;
		Scanner entry = new Scanner(System.in);
		System.out.print("Informe seu peso: ");
		weight = entry.nextFloat();
		System.out.print("Informe sua altura: ");
		height = entry.nextFloat();
		imc = weight / (height * height);
		System.out.print("IMC = " + imc + " - ");
		if (imc < 18.5) {
			System.out.println("Você está abaixo do seu peso ideal");
		} else if (imc < 25) {
			System.out.println("Parabéns - você está no seu peso normal!");
		} else if (imc < 30) {
			System.out.println("Você está acima do seu peso (sobrepeso)");
		} else if (imc < 35) {
			System.out.println("Obesidade grau I");
		} else if (imc < 40) {
			System.out.println("Obesidade grau II");
		} else if (imc >= 40) {
			System.out.println("Obesidade grau III");
		}
	}
}