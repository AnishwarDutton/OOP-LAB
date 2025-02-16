import java.util.Scanner;
public class bitwise_op {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x= in.nextInt();
        System.out.println("Enter the second number: ");
        int y= in.nextInt();
        int carry;
        while(y!=0){
            carry=x&y;
            x=x^y;
            y=carry<<1;
        }
        System.out.println("The sum is "+x);
        if(x%2==0){
            System.out.println("The sum if even");
        }
        else{
            System.out.println("The sum is odd");
        }
    }
}