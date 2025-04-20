package hashmap;
import java.util.HashMap;
public class most_frequent {
    
    public int mostFreqEle(int[] arr) {
        HashMap<Integer, Integer> most = new HashMap<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (most.containsKey(arr[i])) {
                int Freq = most.get(arr[i]);
                Freq++;
                most.put(arr[i], Freq);
                if (Freq > max) {
                    max = Freq;
                }
            } else {
                most.put(arr[i], 1);  // handle first appearance
                if (1 > max) {
                    max = 1;
                }
            }
        }

        return max;
    }
}
