package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`"
        );
    };

    //todo Task 3
    public void sumOfLiterals(){
        char c = 'Z';
        int i1 = 0xface;
        int i2 =012;
        long l=80L;
        float f1=44e-1f;
        float f2=5.5f;
        double d1=8.88e1;
        double d2=99.9;

        int sum;

        sum = c + i1 + i2 + (int)l + (int)f1 + (int)f2 + (int)d1 + (int)d2;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a, b, sum;
        a=scanner.nextInt();
        b=scanner.nextInt();
        sum=a+b;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x=scanner.nextInt();
        System.out.print("y: ");
        y=scanner.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }

    //todo Task 6
    public void compareTwoNumbers(){

        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        System.out.print("n1: ");
        n1=scanner.nextInt();
        System.out.print("n2: ");
        n2=scanner.nextInt();

        if (n1>n2){
            System.out.println("n1 > n2");
        }

        else if (n2>n1){
            System.out.println("n2 > n1");
        }

        else if (n1==n2){
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        int r;
        System.out.print("Enter annual Revenue: ");
        r=scanner.nextInt();

        if ((r<0) || (r>=100000)){
            System.out.println("Invalid Revenue");
        }
        else if ((r>=0)&&(r<20000)){
            System.out.println("Poor Sales Revenue");
        }
        else if ((r>=20000)&&(r<50000)){
            System.out.println("Average Sales Revenue");
        }
        else if ((r>=50000)&&(r<80000)){
            System.out.println("Good Sales Revenue");
        }
        else if ((r>=80000)&&(r<100000)){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){

        Scanner scanner = new Scanner(System.in);
        int c;
        System.out.print("Enter CommissionClass: ");
        c=scanner.nextInt();

        switch(c){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        int y;
        System.out.print("Year: ");
        y=scanner.nextInt();

        if (y%4==0){
            if (y%100==0){
                if (y%400==0){
                    System.out.println("Leapyear");
                }
                else {
                    System.out.println("Not a Leapyear");
                }
            }
            else {
                System.out.println("Leapyear");
            }
        }
        else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n;
        int x;
        int y;
        System.out.print("Number: ");
        n=scanner.nextInt();

        x=n%10;
        n=n/10;
        y=n%10;
        n=n/10;

        x=x*100;
        y=y*10;
        n=n+y+x;

        System.out.println(n);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}