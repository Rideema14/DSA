
package hashmap;
import java.util.HashMap;
import java.util.Scanner;
public class nonrepeating {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemts in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();}
HashMap<Integer ,Integer> IndexMap=new HashMap<>();
        int flag=-1;
        for(int i=0;i<arr.length;i++){
            if (IndexMap.containsKey(arr[i])) {
                int repeating=IndexMap.get(arr[i]);
                IndexMap.put(arr[i],flag);
            }
        else{
           
            IndexMap.put(arr[i],i);
        }}
        if (flag!=-1){
            System.out.println(IndexMap);
            
        }
    
    
}
}
//     int min=Integer.MAX_VALUE;
//     int finalKey=0;
//     for(int i=0;i<arr.length;i++) {
//         if(IndexMap.containsKey(arr[i])) {
//             int key = IndexMap.get(arr[i]);
//             key--;
//             IndexMap.put(arr[i], key);
//         }
//         else {
//             IndexMap.put(arr[i], i);
//         }
//     }
//     for (Integer key : IndexMap.keySet()) {
//         if(IndexMap.get(key)>0 && IndexMap.get(key)<min) {
//             min=IndexMap.get(key);
//             finalKey=key;
//         }
        
//         System.out.println("Element: " + key + ", Index: " + IndexMap.get(key));
       
//     }
//      System.out.println("First Non - repeating element is:"+finalKey); 
// }
// }