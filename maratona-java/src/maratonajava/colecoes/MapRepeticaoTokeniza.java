package maratonajava.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class MapRepeticaoTokeniza {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        createMap(map);
        displayMap(map);
    }

    private static void createMap(Map<String, Integer> map) {
        System.out.print("Entre com a frase: ");
        String input = new Scanner(System.in).nextLine();

        String[] tokens = input.split(" ");
        for (String token : tokens) {
            String s = token.toLowerCase();

            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                map.put(s, 1);
            }
        }
    }

    private static void displayMap(Map<String, Integer> map) {
        Map<String, Integer> map2 = new TreeMap<>(map);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (Map.Entry<String, Integer> ma : map2.entrySet()) {
            System.out.printf("%s\t\t%s%n", ma.getKey(), ma.getValue());
        }

    }

}
