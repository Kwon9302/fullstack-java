package afternoon.collection.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("사과", 10000);
        hashMap.put("바나나", 2000);
        hashMap.put("토마토", 500);
        hashMap.put("수박", 20000);

        System.out.println("hashMap: " + hashMap);
        int applePrice = hashMap.get("사과");
        System.out.println("applePrice: " + applePrice);

        boolean hasBanana = hashMap.containsKey("바나나");
        System.out.println("hasBanana: " + hasBanana);

        //값이 존재하는지
        boolean hasValue20000 = hashMap.containsValue(20000);
        System.out.println(hasValue20000);

        //삭제
        int removedValue = hashMap.remove("수박");
        System.out.println("removedValue: " + removedValue);

        System.out.println(hashMap);
    }
}
