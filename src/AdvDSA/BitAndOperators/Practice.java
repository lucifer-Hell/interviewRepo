package AdvDSA.BitAndOperators;

public class Practice {
    public static void main(String[] args) {
        // In java all integers are signed
        System.out.println(Integer.toBinaryString(1<<1));
        System.out.println(checkKthBitSetOrNot(8,3));
    }
    //generic print function
    static void print(Object val){
        System.out.println(val);
    }

    // use 1 based index
    static boolean checkKthBitSetOrNot(int number, int k){
        return( number & (1<<(k-1)))!=0;
    }
}
