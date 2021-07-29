
import java.util.*;

/**
 * @author Solodovnykov M.S.
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        //задание 1
        Map<String, Integer> map = new HashMap<>();

        map.put("Anatoly Trubin Shakhtar",23);
        map.put("Andriy Pyatov Shakhtar", 12);
        map.put("Georgy Buschan Dynamo", 1);
        map.put("Oleksandr inchenko Manchester", 17);
        map.put("Alexander Karavaev Dynamo", 21);
        map.put("Alexander Tymchik Dynamo", 24);
        map.put("Vitaly Mikolenko Dynamo", 16);
        map.put("Denis Popov Dynamo", 22);
        map.put("Ilya Zabarny Dynamo", 13);
        map.put("Mykola Matvienko Shakhtar", 22);
        map.put("Serhiy Krivtsov Shakhtar", 4);
        map.put("Eduard Sobol", 2);
        map.put("Alexander Zubkov", 20);
        map.put("Andriy Yarmolenko West Ham", 7);
        map.put("Viktor Tsygankov Dynamo", 15);

        exercise1(map);

        //задание 2
        List<String> listStr = new ArrayList<>();

        Scanner(listStr);

        exercise2(listStr);

    }
    static void exercise1 (Map <String, Integer> map) {
        Map<Integer, String> revMap = new HashMap<>();

        for(Map.Entry<String, Integer> result: map.entrySet()){
            revMap.put(result.getValue(), result.getKey());
        }

        for(Map.Entry<Integer, String> res: revMap.entrySet()){
            System.out.println(res.getKey() + " " + res.getValue());

        }
    }

    static void exercise2 (List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : list) {
            if (map.containsKey(str)) {
                map.replace(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        String world = null;
        int cout = 0;

        for (String w : map.keySet()) {
            if (cout < map.get(w)) {
                cout = map.get(w);
                world = w;
            }
        }
        System.out.println("Самая повторяющееся строка:\n "
                + world + " (встречается " + cout + " раз)");

    }
    static void Scanner (List<String> listStr){

        Scanner scan = new Scanner(System.in);
        System.out.println("Вводите строки: ");

        while (true) {
            String str = scan.nextLine();
            if (str.isEmpty()){
                break;
            }
            listStr.add(str);
        }

    }
}
