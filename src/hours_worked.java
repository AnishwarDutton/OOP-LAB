import java.util.Scanner;
public class hours_worked {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of hours worked: ");
        int n=in.nextInt();
        System.out.println("Enter the hourly rate: ");
        double h= in.nextDouble();
        double Sal;
        if(n>40){
            Sal = (n-40)*h*1.5+40*h;
        }
        else{
            Sal=n*h;
        }
        System.out.println("The salary is "+ Sal);
    }
}
