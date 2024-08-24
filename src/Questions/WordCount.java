package Questions;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        countNumOfWords();
    }

    public static void countNumOfWords() {
        String s = "I am learning learning java java java";
        String [] arr=s.split(" ");
        HashMap<String, Integer> map=new HashMap<>();
        for(String n:arr){
            if(map.get(n)==null){
                map.put(n,1);
            }else{
                map.put(n,map.get(n)+1);
            }
        }
        System.out.println(map);
    }
}