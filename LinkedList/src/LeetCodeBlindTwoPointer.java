import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class LeetCodeBlindTwoPointer {

    public void moveZeroes(int[] nums) {
        int n  = nums.length;

        int i = 0;
        while(true) {
            while( i < n && nums[i] != 0) {
                i++;
            }
            int j = i + 1;
            while (j < n && nums[j] == 0) {
                j++;
            }

            nums[i] = nums[j];
            nums[j] = 0;

            i++;

            if(i == n-1) break;
        }
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            else{
                j++;
            }
        }
        return i == s.length();
    }

    public int maxArea(int[] height) {
        int n = height.length - 1;

        int left = 0, right = n-1;

        int maxArea = 0;

        while(left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[right],height[left]));

            if(height[left] < height [right]) {
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }

    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int ans = 0;

        for(int x : nums) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int currentVal = entry.getKey();
            int currentFreq = entry.getValue();

            int corresponding = k - currentVal;

            if (currentVal == corresponding) {
                ans += currentFreq / 2;
            }
            else {
                int correspondingFreq = hashMap.getOrDefault(corresponding, 0);
                int pairs = Math.min(currentFreq, correspondingFreq);
                ans += pairs;
                // Update frequencies
                hashMap.put(currentVal, currentFreq - pairs);
                hashMap.put(corresponding, correspondingFreq - pairs);
            }
        }

        return ans;

    }
}
