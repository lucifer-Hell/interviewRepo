package basicDSA.Recursion;

public class TowerOfHanoi {
    public static void move(int n,String src, String aux ,String dest) {
        if(n==0)
            return ;
        move(n-1,src,dest,aux);
        System.out.println("move "+n+" from "+src+" to "+dest);
        move(n-1,aux,src,dest);
    }
}
