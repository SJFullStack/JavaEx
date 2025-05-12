import java.util.Scanner;

public class $02if {
public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력 >> ");
        int score = sc.nextInt();

        if(score >= 90)
            System.err.println("A학점");
        else if(score >= 80)
            System.err.println("B학점");
        else if(score >= 70)
            System.err.println("c학점");
        else if(score >= 60)
            System.err.println("D학점");
        else
            System.err.println("F학점");

        sc.close();
    }
}