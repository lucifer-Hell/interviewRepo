package AdvDSA.Maths;

public class ExactlyThreeDivisors {
    // optimized approach
    // idea is that a number which is prime will always have it sqr having
    // 3 exactly div
    public int exactly3Divisors(int N)
    {
        if(N<=3)return 0;
        int count=0;
        for(int i=2;i*i<=N;i++){
            if(isPrime(i))
                count++;
        }
        return count;
    }

    private boolean isPrime(int i) {
        for(int j=2;j*j<=i;j++)
            if(i%j==0)
               return false;
        return true;
    }
}
