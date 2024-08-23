public class LengthOfLongestSubstring {
    public LengthOfLongestSubstring() {
        String s = "bcacccc";
        int _result = lengthOfLongestSubstring(s);
    }
    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.isEmpty()) {
            return 0;
        }
        int max = 0, length = 0, left = 0;
        for(int right = 0; right < s.length(); right++) {
            for(int k = left; k < right; k++) {
                if(s.charAt(k) == s.charAt(right)) {
                    left = k + 1;
                    length = right - left;
                    break;
                }
            }
            length++;
            if (max < length) max = length;
        }
        return max;














//        for(int right = 0; right < s.length(); right++) {
//            for(int k = left; k < right; k++) {
//                System.out.println("left: " + left + ",k[" + k + "]: " + s.charAt(k) + ",right[" + right + "]: " + s.charAt(right));
//                if(s.charAt(k) == s.charAt(right)) {
//                    left = k + 1;
//                    length = right - left;
//                    break;
//                }
//            }
//            length++;
//            if (max < length) max = length;
//        }
//
//        return max;

//        for (int subLength = s.length(); subLength > 0; subLength--) {
//            int beginIndex = 0;
//            int endIndex = subLength;
//            while (endIndex <= s.length()) {
//                boolean hasChar = false;
//                String subStringResult = s.substring(beginIndex, endIndex);
//                for(int i = 0; i < subStringResult.length(); i++) {
//                    int lastIndexOf = subStringResult.lastIndexOf(subStringResult.split("")[i]);
//                    if (lastIndexOf != i) {
//                        hasChar = true;
//                        break;
//                    }
//                }
//                if (!hasChar) {
//                    return subLength;
//                }
//                beginIndex++;
//                endIndex++;
//            }
//        }
    }
}
