class A{
    int a=10;
    static int b=20;
    public static void main(String args[]){
        int c=30;
        A ref=new A();
        System.out.println(ref.a);
        System.out.println(c);
        System.out.println(A.b);
    }
}