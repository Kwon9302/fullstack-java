package afternoon.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSerExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //중복데이터 추가 시도
        boolean isAdded = set.add(50);
        System.out.println("추가시도 결과 " + isAdded);
        System.out.println(set);

        boolean contains20 = set.contains(20);
        System.out.println("contains20 = " + contains20);

        boolean isRemoved = set.remove(10);
        boolean isRemoved2 = set.remove(20);
        System.out.println("삭제시도결과" + isRemoved);
        System.out.println(set);
    }
}
