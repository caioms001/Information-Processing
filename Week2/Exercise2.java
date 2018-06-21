import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		int num;
		Scanner entry = new Scanner(System.in);
		System.out.print("Digite o número: ");
		num = entry.nextInt();
		if (num > 0) {
			System.out.println("O número " + num + " é positivo");
		}
		else if (num < 0) {
			System.out.println("O número " + num + " é negativo");
		}
		else if (num == 0) {
			System.out.println("O número " + num + " é nulo");
		}
	}
}