class Solution {
    
    public int[] turnRight(int[] numbers){
        int answer[] = new int[numbers.length];
        answer[0] = numbers[numbers.length-1];
        for(int i=1; i < numbers.length; i++){
            answer[i] = numbers[i-1];
        }
        return answer;
    }
    
    public int[] turnLeft(int[] numbers){
        int answer[] = new int[numbers.length];
        answer[numbers.length-1] = numbers[0];
        for(int i=0; i < numbers.length-1; i++){
            answer[i] = numbers[i+1];
        }
        return answer;
    }
    
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        if(direction.equals("right")) answer = turnRight(numbers);
        else answer = turnLeft(numbers);
        return answer;
    }
}