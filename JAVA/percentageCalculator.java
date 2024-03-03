import java.util.*;
public class percentageCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your marks of hindi out of 100:");
        // int hindi=sc.nextInt();
        // System.out.println("Enter your marks of english out of 100:"); 
        // int english=sc.nextInt();
        // System.out.println("Enter your marks of math out of 100:");
        // int math=sc.nextInt();
        // System.out.println("Enter your marks of sanskrit out of 100:");
        // int sanskrit=sc.nextInt();
        // System.out.println("Enter your marks of science out of 100:"); 
        // int science=sc.nextInt();
        // System.out.print("Your total marks out of 500:");
        // int total=hindi+english+math+science+sanskrit;
        // System.out.println(total);
        // float percentage=((float)total/500)*100;
        // System.out.print("Your percentage is ");
        // System.out.println(percentage);
        // float f1=5.5623f;
        // System.out.println(f1);
        // System.out.printf("%.2f",f1);
    //    Decfor.Format(f1); 
    // String str="   hi    ";
    // String newstring=str.trim();
    // System.out.println(str);
    // System.out.println(newstring);
    // String s1=new String("suraj");
    // String s2=s1.substring(1,4);
    // String s3="suraj";
    // System.out.println(s3.replace('u','i'));
    //System.out.println(s2);
    System.out.println("Enter hindi marks out of 100:");
    int hindi=sc.nextInt();
    System.out.println("Enter english marks out of 100:");
    int english=sc.nextInt();
    System.out.println("Enter math marks out of 100:");
    int math=sc.nextInt();
    int total=hindi+english+math;
    float percentage=((float)total/300)*100;
    System.out.println("Your total marks in percentage :"+percentage);
    if(percentage>=40){
        if(hindi>=33 && english>=33 && math>=33){
            System.out.println("Congratulation You are paas.");
        }
        else{
            System.out.println("You are failed.");
        }
    }
    else{
        System.out.println("You are failed.");
    }


    }
}
