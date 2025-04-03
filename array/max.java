package array;
public class max{
    public static void main(String args[]) {
        int max=0;
        int []arr ={3,10,56,2};
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       System.out.println(max);
    }
}