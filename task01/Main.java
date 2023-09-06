package task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double widht;
        double height;

        try(Scanner iScanner = new Scanner(System.in)){
            System.out.println("Длина прямоугольника: ");
            height = Double.parseDouble(iScanner.nextLine());
            System.out.println("Ширина прямоугольника: ");
            widht = Double.parseDouble(iScanner.nextLine());

            Rectangle rectangle = (x, y) -> x*y;
            System.out.printf("Площадь = %.1f", rectangle.calcucateArea(widht, height));
        }
}
}
