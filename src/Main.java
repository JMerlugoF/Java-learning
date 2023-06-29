import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int n1 = 100;
        int n2 = 28;
        String helloString = "hello";
        int n = 11;

        if(n1 >= n2){
            System.out.println("o n1 é maior que o n2");
        } else {
            System.out.println("o n2 é maior que o n1");
        }

        String message = n1 >= n2 ? "o n1 é maior que o n2" : "o n2 é maior que o n1";

        System.out.println(message);

        int[] numberArray = new int[3];

        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = n+i;
        }

        for ( int number : numberArray ) {
            System.out.println(number);
        }

        listNumber(numberArray);

//        Arrays.stream(numberArray).forEach(System.out::println);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Qual seu nome?");
//        String name = scanner.nextLine();
//        System.out.println("qual sua idade?");
//        int age = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age).getYear();
//        System.out.println("Ah, então você nasceu em "+ year );

        Example listNumbers = new Example();
        listNumbers.addNumber(11.0);
        listNumbers.addNumber(178.0);
        listNumbers.addNumber(300.0);
        listNumbers.addNumber(120.0);
        listNumbers.removeNumberByContent(178.0);
        listNumbers.listALl();
    }

    public static void listNumber(int[] numberArray){
        int cont = 0;
        while(cont < 3) {
            System.out.println(numberArray[cont]);
            cont++;
        }
    }
}