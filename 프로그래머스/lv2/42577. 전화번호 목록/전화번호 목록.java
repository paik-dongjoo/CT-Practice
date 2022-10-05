import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            hm.put(phone_book[i], 1);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if(hm.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return answer;
    }
}