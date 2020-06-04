package lanqiao;

public class L18_3 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        
        for(int i = 1; i<123456; i++){
            int temp = 2*a-3*b;
            b = 3*a+2*b;
            a = temp;
        }
        System.out.println(a+"+"+b+"i");
    }
}
