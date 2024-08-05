import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeBlindArray {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        for(; i < word1.length() && i < word2.length(); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        while(i < word1.length()) {
            sb.append(word1.charAt(i++));
        }

        while (i < word2.length()) {
            sb.append(word2.charAt(i++));
        }
        return sb.toString();
    }

    public String gcdOfStrings(String str1, String str2) {
        int s1Size = str1.length();
        int s2Size = str2.length();

        int maxLen = s1Size >= s2Size ? (s1Size / 2 >= s2Size ? s2Size : s1Size/2) : (s2Size / 2 >= s1Size ? s1Size : s2Size/2);

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while( i < maxLen) {
            if(str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            }
        }

        return sb.toString();
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxCandies) {
                ans.add(true);
            }
            else ans.add(false);
        }
        return ans;
    }

    public String reverseVowels(String s) {

        ArrayList<Integer> vowelsIndex = new ArrayList<>();

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
                vowelsIndex.add(i);
            }
        }
        int vowelsSize = vowelsIndex.size();
        for(int i = 0; i < vowelsSize / 2; i++) {
            char c1 = sb.charAt(vowelsIndex.get(i));
            char c2 = sb.charAt(vowelsIndex.get(vowelsSize - i - 1));

            sb.setCharAt(vowelsIndex.get(i), c2);
            sb.setCharAt(vowelsIndex.get(vowelsSize - i - 1), c1);
        }
        return sb.toString();
    }

    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < words.length/ 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        for(int i = 0; i < words.length; i++) {
            ans.append(words[i]);
            if(i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] postProduct = new int[n];
        postProduct[n-1] = 1;
        for(int i = n - 2; i >= 0; i--) {
            postProduct[i] = postProduct[i+1] * nums[i];
        }

        int[] product = new int[n];

        int preProduct = 1;

        product[0] = postProduct[0];

        for(int i = 1; i < n; i++) {
            preProduct *= nums[i-1];
            product[i] = preProduct * postProduct[i];
        }
        return product;
    }

    public boolean increasingTriplet(int[] nums) {
        int first  =  Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int n : nums) {
            if(first > n) first = n;
            else if( second > n) second = n;
            else return true;
        }

        return false;
    }

    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();

        char c = chars[0];
        int cnt = 1;
        int j = 0;

        for(int i = 1; i < chars.length; i++) {
            if(chars[i] == c) {
                cnt++;
            }
            else {
                chars[j++] = c;
                chars[j++] = (char) (cnt - '1');
                sb.append(c);
                sb.append(cnt);
                c = chars[i];
                cnt = 1;
            }
        }

        return sb.length();
    }
}
