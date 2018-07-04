import java.util.Scanner;

public class Exercise2 {
	public static void main (String[] args){
		Scanner entry = new Scanner(System.in);
		int num, sumEven = 0, sumOdd = 0, countAll = 0;
		float countEven = 0, countOdd = 0, percentEven, percentOdd;
		do {
			System.out.print("Digite um número: ");
			num = entry.nextInt();
			if (num >= 0) {
				if (num % 2 == 0) {
					System.out.print("par ");
					sumEven += num;
					countEven++;
				} else {
					System.out.print("impar ");
					sumOdd += num;
					countOdd++;
				}
				countAll++;
			}
		} while (num >= 0);
		percentEven = countEven / countAll * 100;
		percentOdd = countOdd / countAll * 100;
		System.out.print("somapar=" + sumEven);
		System.out.print(" somarimpar=" + sumOdd);
		System.out.print(" taxapar=" + percentEven + "%");
		System.out.println(" taxaimpar=" + percentOdd + "%");
	}
}