import java.util.Scanner;

public class Weighted_Average {
    public static void main(String[] args) {
    	float p1, p2, t1, t2, avg;
    	Scanner entry = new Scanner(System.in);
    	p1 = entry.nextInt();
    	p2 = entry.nextInt();
    	t1 = entry.nextInt();
    	t2 = entry.nextInt();
    	avg = (p1 * 25 + p2 * 30 + t1 * 20 + t2 * 25) / 100;
    	System.out.println(avg);
    }
}