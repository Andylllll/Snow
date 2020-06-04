package lanqiao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ALGO_124 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	int row;  
    	int[][] arr;
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        row = Integer.parseInt(br.readLine());
        arr = new int[row][row];
        for(int i = 0; i < row; i++){
            String[] str = br.readLine().split(" ");
            for(int j = 0; j <= i; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        int maxSum = maxSum(row,arr);
        System.out.println(maxSum);
    }

    public static int maxSum(int row, int[][] arr) {
        for(int i = row-2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                arr[i][j] += (arr[i+1][j] > arr[i+1][j+1]? arr[i+1][j] : arr[i+1][j+1]);
            }
        }
        return arr[0][0];
    }

}

