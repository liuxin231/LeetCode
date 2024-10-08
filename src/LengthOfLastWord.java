public class LengthOfLastWord {
    public LengthOfLastWord() {
        String s = "   fly me   to   the moon ";
        lengthOfLastWord(s);
    }
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && result > 0 ) {
                return result;
            }
            if (s.charAt(i) != ' ') {
                result++;
            }
        }
        return result;
    }
}
