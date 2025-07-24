package BTVNb3;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();

        int a = rand.nextInt(101);
        int b = rand.nextInt(101);
        int c = rand.nextInt(201);

        System.out.println("Phép toán" + a + " + " + b + " = " + c);
        System.out.println("Đáp án của bạn (Correct / Incorrect): ");
        String answer = sc.nextLine().trim();

        boolean correctAnswer = (a + b == c);

        if((correctAnswer && answer.equalsIgnoreCase("Correct")) || (!correctAnswer && answer.equalsIgnoreCase("Incorrect"))){
            System.out.println("Bạn trả lời đúng !");
        }
        else{
            System.out.println("Bạn trả lời sai!");
        }
    }
}
