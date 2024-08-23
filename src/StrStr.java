public class StrStr {

    public StrStr() {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() || needle.isEmpty() || needle.length() > haystack.length()) {
            return -1;
        }
        int checkNum = needle.length();
        for (int i = 0; i + checkNum - 1 < haystack.length(); i++) {
            if (needle.equals(haystack.substring(i, checkNum + i))) {
                return i;
            }
        }
        return -1;
    }
}
