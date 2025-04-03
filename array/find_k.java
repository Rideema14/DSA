package array;

public class find_k {
    public static void main(String args[]) {
        int []arr ={3,10,56,2};
        int k=10;
       for(int i=0;i<3;i++){
        if(k==arr[i]){
            System.out.println("found"+k);
            k++;
            break;
        }
        else{
            System.out.println("not found");
        }
       }
      
    }
}
