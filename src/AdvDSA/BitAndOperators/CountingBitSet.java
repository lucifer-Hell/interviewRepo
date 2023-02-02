package AdvDSA.BitAndOperators;

public class CountingBitSet {
    // Idea is to use recursive approach for set bit count
    public static int countSetBits(int n){
        if(n==0)return 0;
        int totalCount=0;
        // find the leftMostBitPos
        int leftMostBitPos=getLeftMostBitPos(n);
        // no of set bits till leftMostBitPos number
        totalCount+=(1<<(leftMostBitPos-2))*(leftMostBitPos-1);
        // remaining bit count
        int temp=countSetBits(n&(~(1<<(leftMostBitPos-1))));
        totalCount+= n-(1<<(leftMostBitPos-1))+1+temp;
        return totalCount;
    }

    private static int getLeftMostBitPos(int n) {
        int pos=0;
        while(n>0){
            n>>=1;
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(17));
        System.out.println(countSetBits(4));
        System.out.println(countSetBits(0));
        System.out.println(countSetBits(100));

    }
}
