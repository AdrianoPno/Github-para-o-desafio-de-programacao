


import java.util.HashMap;
import java.util.Scanner;

public class questaoTres {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("Verifique se palavras sao anagramas");

        System.out.println("Digite a primeira palavra: ");

        String s1 = in.next();

    
        String s2 = s1;

        HashMap<Character, Integer> map1 = createMaps(s1);
        HashMap<Character, Integer> map2 = createMaps(s2);

        System.out.println(map1);
        System.out.println(map2);
        
        System.out.println(map1.equals(map2) ? "E um anagrama" : "Nao e um anagrama");
        
        
    }

    private static HashMap<Character, Integer> createMaps(String s1){
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char c : s1.toCharArray()){
            if (!map1.containsKey(c)){
                map1.put(c, 1);
            }else{
                Integer value = map1.get(c);
                map1.put (c, ++value);
            }
        }

        return map1;
    }
}
