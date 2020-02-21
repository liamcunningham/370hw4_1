import java.util.Scanner;
//tesing even x%2=0
public class hw4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfValues = Integer.parseInt(scan.next());
        int[] values = new int[numOfValues];
        //approach 1: two index search
        for (int i = 0; i < values.length-1; i++) {
            //if (values[i])is positive dont iterate
            //if values[i] is negative iterate
            if (values[i]%2!=0){
                //swap
            }
            for (int j = values.length-1; j > 0; j--) {
                //j -> end
                //i -> beg
                //if values[i] is positive dont iterate
                //if values[i] is negative iterate
                if (values[j]%2==0){}
            }
        }
        //approach 2:
    }
}
