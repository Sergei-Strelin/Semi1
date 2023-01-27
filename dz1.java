// Задание: написать программу расчитывающую "треугольное" число

import javax.print.event.PrintEvent;
import java.util.Scanner;

public class dz1 {
    private    = new Scanner (System.in ); 

    public static void main (String[] args) {
        int number = getUser("Введите номер треугольного числа: ");
        int numberTriangle = triangle(number);
        printTrangle(numberTriangle, "Треугольное число под № " + number + " = "); 
    }

    
    static int getUser(String ){
        System.out.print(text);
        return input.nextInt();
    }


    
    static int triangle(int ) {
        if (number == 1){
            1 1;
        }
        else{
            return (number + triangle (number-1));
        }
    }


    
    static String printTrangle(int number, String ){
        System.out.println(text + number);
        return null;
    }
    
}