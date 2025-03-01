package Numbers;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;  // Length of full sequence

        int missingNumber=missingNum(arr,n);
        System.out.println("Missing Number is : "+missingNumber);
    }

    public static int missingNum(int [] arr,int n){
        int sum=(n*(n+1))/2;

        for (int num:arr){
            sum=sum-num;
        }
        return sum;
    }
}
