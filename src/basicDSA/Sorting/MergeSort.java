package basicDSA.Sorting;

public class MergeSort {
    public static int[] mergeSort(int []arr,int l,int r){
        if(l>=r){
            return arr;
        }
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        return arr;
    }
    public static int []sort(int []arr){
       return mergeSort(arr,0,arr.length-1);
    }
    public static void merge(int []a,int l,int m,int r){
        if(l>=r)
            return;
        int i=l,j=m+1,k=0;
        int []aux=new int[r-l+1];
        while(i<=m && j<=r){
            if(a[i]>a[j]){
                aux[k]=a[j++];
            }else {
                // a[i]<=a[j]
                aux[k]=a[i++];
            }
            k++;
        }
        while(i<=m){
            aux[k]=a[i++];
            k++;
        }
        while(j<=r){
            aux[k]=a[j++];
            k++;
        }
        // reset k index
        k=0;
        for(i=l;i<=r;i++,k++)
            a[i]=aux[k];
    }
}
