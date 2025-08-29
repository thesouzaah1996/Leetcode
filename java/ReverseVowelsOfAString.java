class Solution {
    public String reverseVowels(String s) {
        
        if (s == null || s.length() <= 1) {
            return s;
        }

        StringBuilder result = new StringBuilder(s);

        Set<Character> vowels = new HashSet<>();

        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = result.charAt(left);
            char rightChar = result.charAt(right);

            if (!vowels.contains(leftChar)) {
                left++;
                continue;
            }

            if (!vowels.contains(rightChar)) {
                right--;
                continue;
            }

            result.setCharAt(left, rightChar);
            result.setCharAt(right, leftChar);

            left++;
            right--;
        }

        return result.toString();
    }
}