import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args) {
		int votesA, votesB, votesC, chairs, quoEle, quoA, quoB, quoC;
		Scanner entry = new Scanner(System.in);
		System.out.print("Digite a quantidade de votos do partido A: ");
		votesA  = entry.nextInt();
		System.out.print("Digite a quantidade de votos do partido B: ");
		votesB  = entry.nextInt();
		System.out.print("Digite a quantidade de votos do partido C: ");
		votesC  = entry.nextInt();
		System.out.print("Digite a quantidade de cadeiras disponíveis: ");
		chairs  = entry.nextInt();
		quoEle = (votesA + votesB + votesC) / chairs;
		quoA = votesA / quoEle;
		quoB = votesB / quoEle;
		quoC = votesC / quoEle;
		System.out.println("Quociente eleitoral: " + quoEle);
		if (quoA == 0 || quoB == 0 || quoC == 0) {
			System.out.println("Houve partido(s) com o quociente partidário igual a 0");
		} else {
			System.out.println("Não houve partido com o quociente partidário igual a 0 ");
		}
	}
}