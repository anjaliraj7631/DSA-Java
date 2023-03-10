package linear_search;

public class MaxInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int ans = Integer.MIN_VALUE; //arr[0][0]
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>ans){
                    ans=arr[row][col];
                }
            }
        }
        return ans;
    }
}
