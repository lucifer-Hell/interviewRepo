package basicDSA.Recursion;

public class RopeCut {
    /*
    * given=>> ropeLength=n, cutSize={ 2 ,5 ,1 }
    *  output ==> max number of pieces which we can get by cutting one of the following size
    *  XX XXX...
    * */

    public static int maxCut(int len,int a,int b,int c){
        if(len<=0)
           return  len;
        int res=getMax(maxCut(len-a,a,b,c),maxCut(len-b,a,b,c), maxCut(len-c,a,b,c));
        return (res<0)?-1:res+1;
    }
    private static int getMax(int a,int b,int c){
        return Math.max(Math.max(a,b),c);
    }
}
