package Methods;

public class Methods{
    public static void main(String[] args){
        int[] arr={1,2,3};
        int res = sumArray(arr);
        System.out.println(res);

        String str = modifyString("  komal  ");
        System.out.println(str);

        System.out.println(sum(1,2,3));

        System.out.println(isPrime(13));
    }


    public static int sumArray(int[] arr) {
        int res=0;
        for (int element : arr) {
            res+=element;
        }
        return res;
    }
    public static String modifyString(String str){
        return str.trim().toUpperCase();
    }

    public static int sum (int...a){
        int sum =0;
        for(int element: a){
            sum+=element;
        }
        return sum;
    }

    public static boolean isPrime(int n){
        int res=0;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%2==0){
                res++;
            }
        }
        return res==0;

    }
}