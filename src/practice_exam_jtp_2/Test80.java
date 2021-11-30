package practice_exam_jtp_2;

import java.util.*;
import java.util.stream.DoubleStream;

public class Test80 {

    public static void main(String[] args) {
        // HashSet クラスの実装クラス生成と Set.of()メソッドを組み合わせることで
        // 変更可能なコレクションとして操作できる。
        Set<Integer> s = new HashSet<>(Set.of(300, 100, 200));
        s.add(400);
        List<Integer> list = new ArrayList<>();
        list.add(500);
        s.addAll(list);
        s.remove(100);
        System.out.println(s.size());
        
    }
}
