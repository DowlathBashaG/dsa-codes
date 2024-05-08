package io.dowlath.java8.mapToList;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Map: {1=Geeks, 2=forGeeks, 3=A computer Portal}
Stream: [1=Geeks, 2=forGeeks, 3=A computer Portal]
 */
public class ConvertMapToList {

       /* Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        System.out.println(list);*/

    // Generic function to convert List of
    // String to List of Integer

    public static void main(String args[])
    {

        // Create a Map
        Map<Integer, String> map = new HashMap<>();

        // Add entries to the Map
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");

        // Print the Map
        System.out.println("Map: " + map);

        // Convert the Map to Stream
        List<Map.Entry<Integer, String> > list =
                convertMapToList(map);

        // Print the TreeMap
        System.out.println("List: "
                + Arrays.toString(list.toArray()));
    }
    public static <K, V> List<Map.Entry<K, V> > convertMapToList(Map<K, V> map)
    {

        // Return the obtained Stream
        return map

                // Convert the Map to Set
                .entrySet()

                // Convert the Set to Stream
                .stream().toList();
    }

    // }

}

