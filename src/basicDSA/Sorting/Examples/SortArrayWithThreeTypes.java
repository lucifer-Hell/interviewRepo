package basicDSA.Sorting.Examples;

public class SortArrayWithThreeTypes {
    public static int [] sort(int [] arr){
        int i=-1,j=-1,k=-1;
        for(int ele:arr){
            if(ele==0){
                // type 1 case
                swap(arr,++j,++k);
                swap(arr,++i,j);
                arr[i]=ele;
            }
            else if (ele==1 ){
                // type 2 case
                swap(arr,++j,++k);
                arr[j]=ele;
            }
            else {
                // type 3 case
                k++;
                arr[k]=ele;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    /*  0 - T1 , 1- T2 , 2 -T3
        IP --> [ 1,1,0,0,2,2,1,1,0,0]
        OP --> [ 0,0,0,0,1,1,1,1,2,2]
        // APP -1
        int [] t1, t2,t3;
        int i=0,j=0,k=0;
        int type0[]=[0,
        iterate through arr
            whenever a type is encounted (n)
            add that element in the corresponding type arr and then incr the index
        iterate over t1 and it in arr
        similalry for t2 and t3 --> (3n)
        Time complexity - 4n
        space complexity - 3n
        // APP -2 ( Lomuto Partition )
        [ t1 ,t1,t1...,t2,t2,t2,....,t3,t3,t3]
          l1     r1     l2   r2     l3   r3
        [ 1,1,0,0,2,2,1,1,0,0]
        l1,r1,l2,r2,l3,r3
        l1,l2,l3=-1 , r1,r2,r3=-1;
           [1,1,2,0,2,1,1,0,0]
           [0,0,0,1,1,1,1,2,2]
           i j k
           i=-1,j=1,k=2
           [0,1,0,1]
           i=-1,j=-1,k=-1;
           ele 0 --> i=0,j=0,k=0;
           ele 1 --> i=0,j=1,k=1
           ele 0 -->  j++, k++ , swap (j,k) ==> j=2,k=2
                      i++ , swap(i,j) ==> i=1,j=2
                      arr[i]=0;
          ele 1 -->   j++, k++, swap(j,k) == j=3,k=3
                      arr[j]=1;
          ele 2--> k++;arr[k]=2;
    */

}
