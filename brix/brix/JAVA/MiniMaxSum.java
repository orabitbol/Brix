public class MiniMaxSum {

    public static int MaxNumber(int[] arr) {
        int MaxNum = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (MaxNum < arr[i]) {
                MaxNum = arr[i];
            }
        }

        return MaxNum;
    }

    public static int MinNumber(int[] arr) {
        int MinNum = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (MinNum > arr[i]) {
                MinNum = arr[i];
            }
        }

        return MinNum;
    }

    public static void MiniMaxSum(int[] arr) {
        int sum = 0;
        int MaxNum = MaxNumber(arr);

        int MinNum;
        for(MinNum = 0; MinNum < arr.length; ++MinNum) {
            if (MaxNum != arr[MinNum]) {
                sum += arr[MinNum];
            }
        }

        System.out.println(sum);
        sum = 0;
        MinNum = MinNumber(arr);

        for(int i = 0; i < arr.length; ++i) {
            if (MinNum != arr[i]) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
      int [] arr ={1,3,5,7,9};
        MiniMaxSum(arr);
    }

}
