package AdvDSA.Maths;

public class ModularMultiplicativeInverse {
    private int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int modInverse(int a, int m)
    {
        if(gcd(a,m)!=1)return -1;
        int j=1;
        while(j<=m){
            if((a*j)%m==1)return j;
            else j++;
        }
        return -1;
    }
}
