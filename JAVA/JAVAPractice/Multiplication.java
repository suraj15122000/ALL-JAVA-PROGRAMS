import java.util.Scanner;


 public class  Multiplication{
    static void mult(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a =sc.nextInt();
        System.out.println("your table is : ");
        mult(a);
        

    }
}