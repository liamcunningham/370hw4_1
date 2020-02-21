import java.util.Scanner;
import java.util.Stack;


/*
 * HackerRank link:https://www.hackerrank.com/contests/cst370-s20-hw4/challenges/matching-form/submissions/code/1321046652
 * Title:hw4_1
 * Abstract:takes brackets and sees if the number of open and closed brackets are equal
 * Author:Liam Cunningham
 * ID:0383
 * Date:2/21/20
 */
public class hw4_1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        char bracketLA = '(';
        char bracketRA = ')';
        char bracketLB = '[';
        char bracketRB = ']';
        char bracketLC = '{';
        char bracketRC = '}';

        //grab all input data
        Stack<Character>stackL = new Stack<>();
        Stack<Character>stackR = new Stack<>();

        String full = scan.next();
        for (int i = 0; i < full.length(); i++) {
            char test = full.charAt(i);
            if (test==(bracketLA)||test==(bracketLB)||test==(bracketLC)){
                stackL.push(test);
            }
            if (test==(bracketRA)||test==(bracketRB)||test==(bracketRC)){
                stackR.push(test);
            }


        }



        if (stackL.size()==stackR.size()){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }


//        System.out.println(stack);

    }
}
