package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class non_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int [] arr2=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> non_duplicate_map = new HashMap<>();
        int non;
      
        int remove=0;
        for (int i = 0; i < n; i++){
            if (non_duplicate_map.containsKey(arr[i])) {
                non = non_duplicate_map.get(arr[i]);
                non_duplicate_map.put(arr[i], non);
            } else {

                non_duplicate_map.put(arr[i], 1);
                arr2[remove]=arr[i];
                remove++;
            }
        }
        System.out.println(non_duplicate_map);
        for (int i = 0; i < arr.length; i++) {
             System.out.print( arr2[i]);
                
            
        }
        sc.close();
    }
}
