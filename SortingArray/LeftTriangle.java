package SortingArray;

public class LeftTriangle {
    public static void Pattern(int n){
        int i,j;
        for(i =0; i <n; i++){
           // System.out.print(" ");
            for (j = 0; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Pattern(n);
    }
}
