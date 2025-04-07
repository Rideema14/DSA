package hashmap;
import java.util.HashMap;
import java.util.Scanner;
// import java.util.Map;
public class same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();}
        HashMap<Integer ,Integer> frequencymap =new HashMap<>();
        for(int i=0;i<n;i++){
            if(frequencymap.containsKey(arr[i])){
                int Freq=frequencymap.get(arr[i]);
                  Freq++;
                frequencymap.put(arr[i],Freq);
            }
            else{

                frequencymap.put(arr[i], 1);
            }
        }
        System.out.println(frequencymap);
    }
}
