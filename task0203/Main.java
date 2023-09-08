package task0203;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(0);
        List <Figura> figuras = new ArrayList<>();
        Integer count = 0;

        while (count<10){
            figuras.add(new Figura(random.nextInt(8)+1, 
                random.nextInt(6)+1, random.nextInt(2)));
            count++;
        }

        Collections.sort(figuras, new AreaComparator());
        System.out.println("\n Сортировка по площади \n");

        for (Figura figura: figuras){
            switch (figura.getVarior()){
                case 0: 
                System.out.printf("Круг с диаметром %d имеет S =  %.1f \n",
                    figura.getHeight(), figura.getArea());
                    break;
                case 1: 
                System.out.printf("Прямоугольник (%d на %d) имеет S = %.1f \n", 
                    figura.getHeight(), figura.getWidht(), figura.getArea()); 
                break;
                default:
                System.out.println("Некорректное значение");
                break;
            }
        }

        Collections.sort(figuras, new PerimetrComparator());
        System.out.println("\n Сортировка по периметру \n");

        for (Figura figura: figuras){
            switch (figura.getVarior()){
                case 0: 
                System.out.printf("Окружность с диаметром %d имеет L = %.1f \n",
                    figura.getHeight(), figura.getPerimetr());
                    break;
                case 1: 
                System.out.printf("Прямоугольник (%d на %d) имеет P = %.1f \n", 
                    figura.getHeight(), figura.getWidht(), figura.getPerimetr()); 
                    break;
            }
        }
        
        // Collections.sort(rectangles, new AreaComparator());

        // for (Rectangle rectangle: rectangles){
        //     System.out.printf("%.1f * %.1f = %.1f \n", 
        //         rectangle.getHeight(), rectangle.getWidth(), rectangle.getArea()); 
        // }

        // Collections.sort(rectangles, new PerimetrComparator());

        // System.out.println("Прямоугольники со сторонами имеют Периметр:");
        // for (Rectangle rectangle: rectangles){
        //     System.out.printf("Длина %.1f и ширина %.1f: ПЕРИМЕТР  %.1f \n", 
        //         rectangle.getHeight(), rectangle.getWidth(), rectangle.gerPerimetr()); 
        // }
    }
}
