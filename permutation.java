import java.util.ArrayList;

/**
 * permutation
 */
public class permutation {
static ArrayList<Integer[]> res=new ArrayList<Integer[]>();
    public static void main(String[] args) {
        
        int nums[]=new int[3];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        permute(nums,0);
    }
    public static void permute(int []arr,int fi){
        if(fi==arr.length-1){
          for(int num:arr)
          System.out.print(num+" ");
          System.out.println();
          return;
        }
        else{
            for(int i=fi;i<arr.length;i++){
           swap(arr,i,fi);
           permute(arr,fi+1);
           swap(arr,i,fi);
            }
        }
    }
    public static void swap(int []arr,int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}

}