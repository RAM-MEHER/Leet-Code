class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        boolean negative = num < 0;
        num = Math.abs(num);

        StringBuilder s = new StringBuilder();

        while (num > 0) {
            s.append(num % 7);
            num /= 7;
        }

        if (negative) {
            s.append('-');
        }

        return s.reverse().toString();
    }
}