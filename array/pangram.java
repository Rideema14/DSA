package array; 
public class pangram {
    public boolean checkIfPangram(String sentence) {
         Boolean ispangram =false;
        sentence=sentence.toLowerCase();
        for(char c = 'a'; c <= 'z'; c++){
        if (sentence.indexOf(c) == -1)
        return ispangram=false;
            
        }
        return ispangram=true;
    }
}