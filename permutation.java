class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        per(nums,ans,0);
        return ans;
        
    }
    public void per(int[] arr,List<List<Integer>> ans,int fi){
        if(fi==arr.length){
            List<Integer> p=new ArrayList<>();
            for(int num:arr)
                p.add(num);
            ans.add(p);
        }
        else{
            for(int i=fi;i<arr.length;i++){
            swap(arr,i,fi);
                per(arr,ans,fi+1);
                swap(arr,i,fi);
        }
    }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}