import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        List<Integer> arr = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        arr.sort((a, b) -> {
            String a1 = String.valueOf(a) + String.valueOf(b);
            String b1 = String.valueOf(b) + String.valueOf(a);
            return b1.compareTo(a1);
        });

        for (int num : arr) {
            answer.append(num);
        }

        return answer.toString().startsWith("0") ? "0" : answer.toString();
    }
}
