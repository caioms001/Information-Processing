import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
    	float width, lenght, unitPrice, can, price;
    	Scanner entry = new Scanner(System.in);
    	width = entry.nextInt();
        lenght = entry.nextInt();
    	unitPrice = entry.nextInt();
    	can = width * lenght / 4 / 5;
        price = can * unitPrice;
    	System.out.println("Latas: " + can);
        System.out.println("Custo total: " + price);
    }
}