
public  class ArrayUnique {

    public static void Unique(String []arr)
    {int sign=0;

        // String [] temp=new String[arr.length];
 for (int i=0;i< arr.length;i++)
 {
for (int j=0;j<i;j++)
    if (arr[i]==arr[j] )
    {
        sign=1;
        if (i==arr.length-1 && arr[i]!=arr[j])
        {
            System.out.println(arr[arr.length-1]);
        }
        break;

    }
if (sign==0){
        System.out.print(arr[i]+"  ");


    }


 }
       // System.out.print(arr[arr.length-1]);
    }
    public static void main(String[] args) {
        String arr[]={"5","4","7","6","4","6","5","7"};
        Unique(arr);
    }
}