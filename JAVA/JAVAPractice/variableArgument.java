class variableArgument{
    static int sum(int ...arr){
        int result =0;
        for(int a:arr){
            result=result+a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("sum of 2 and 4 is "+sum(2,4));
        
    }
}