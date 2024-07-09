package afternoon.collection.map;

import java.util.HashMap;

public class ExMain {
    public static void main(String[] args) {
        int[] arr = new int[10];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 10) +1;
            arr[i] = a;
            hashMap.put(i+1, 0);
        }

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
        }
        System.out.println(hashMap);
    }
}
