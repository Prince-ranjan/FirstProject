import java.util.*;

public class SlidingWindowApproach {

    public static Set<String> findRepeatedSequences(String dna, int k) {

        Set<String> ans = new HashSet<>();

        Set<String> allStr = new HashSet<>();
        for(int i = 0; i < dna.length() - k + 1; i++) {
            String str = dna.substring(i, i+k);
            if(allStr.contains(str)) {
                ans.add(str);
            }
            allStr.add(str);
        }
        return ans;
    }

    private static Deque<Integer> clean(int i, Deque<Integer> deque, int[] nums) {
        while (deque.size() > 0 && nums[i] >= nums[deque.getLast()]) {
            deque.removeLast();
        }
        return deque;
    }

    public static int[] findMaxSlidingWindow(int[] nums, int w) {

        if(nums.length == 1) return  nums;

        int[] ans = new int[nums.length - w + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < w; i++) {
            deque = clean(i,deque,nums);
            deque.add(i);
        }

        ans[0] = nums[deque.getFirst()];
        for (int i = w; i < nums.length; i++) {
            clean(i, deque, nums);
            if(!deque.isEmpty() && deque.getFirst() <= (i - w)) {
                deque.removeFirst();
            }
            deque.add(i);
            ans[i-w+1] = nums[deque.getFirst()];
        }
        return ans;
    }

    public static String minWindow(String s, String t) {
        int sIndex = 0;
        int tindex = 0;

        int start = 0;
        int end = 0;
        int ansLen = Integer.MAX_VALUE;
        String ans = "";
        while (sIndex < s.length()) {
            if(s.charAt(sIndex) == t.charAt(tindex)) {
                if (tindex == 0) start = sIndex;

                tindex++;

                if (tindex == t.length()) {
                    end = sIndex;

                    if ((end - start + 1) < ansLen) {
                        ansLen = end - start + 1;
                        ans = s.substring(start, end + 1);
                    }
                    sIndex = start;
                    tindex = 0;
                }

            }
            sIndex++;
        }
        return ans;
    }

    public static int longestRepeatingCharacterReplacement(String s, int k) {
        int start = 0;
        int end = 0;

        int mostFrequentCharLength = 0;

        Map<Character,Integer> charFreq = new HashMap<>();

        int ans = 0;

        while(end  < s.length()) {
            char currentChar = s.charAt(end);

            charFreq.put(currentChar, charFreq.getOrDefault(currentChar, 0) + 1);

            mostFrequentCharLength = Math.max(mostFrequentCharLength, charFreq.get(currentChar));

            if (end - start + 1 - mostFrequentCharLength > k) {
                charFreq.put(s.charAt(start), charFreq.get(s.charAt(start++)) - 1);
            }
            ans = Math.max(ans, end - start + 1);
            end++;
        }
        return ans;
    }


}
