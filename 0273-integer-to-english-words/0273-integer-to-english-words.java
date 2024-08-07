class Solution {
    private final static String[] units = {"", "One", "Two","Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final static String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        int i = 0;
        String words = "";
        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + " " + thousands[i] + " " + words;
            }
            num /= 1000;
            i++;
        }
        return words.trim();
    }
    private static String helper(int num) {
        if (num == 0) {
            return "";
        }
        if (num < 20) {
            return units[num];
        }
        if (num < 100) {
            return tens[num / 10] + (num % 10 == 0 ? "" : " " + units[num % 10]);
        }
        return units[num / 100] + " Hundred" + (num % 100 == 0 ? "" : " " + helper(num % 100));
    }
}