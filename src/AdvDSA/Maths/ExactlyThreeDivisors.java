package AdvDSA.Maths;

public class ExactlyThreeDivisors {
    // brute approach
    public int exactly3Divisors(int N)
    {
        if(N<=3)return 0;
        int count=0;
        for(int i=4;i<=N;i++){
            if(have3Divisors(i))
                count++;
        }
        return count;
    }

    private boolean have3Divisors(int i) {
        int divCount=0;
        for(int j=1;j<=i;j++)
            if(i%j==0)
                divCount++;
        return (divCount==3);
    }
}
