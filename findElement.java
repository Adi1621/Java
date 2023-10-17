public class findElement {
    public static void main(String[] args){
        int arr[] = new int[]{ 3 , 5 ,6, 4 , 2};
        int x = 4;
        int ans = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;
                
            }

        }
        System.out.println(ans);

        

    }
    
}
