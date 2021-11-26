package lab8;

public class EnglishNumber {
    private static final String[] ones = {
            "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
            "ninety"
    };

    private static final String[] groups = {
            "",
            "thousand",
            "million",
            "billion"
    };

    public static String toEnglish(int n) {
        String s = "";

        for(int i=groups.length-1; i>=0; i--) {
            int cutoff = (int)(Math.pow(10.0, (double)(i*3)));

            if(n >= cutoff) {
                int thisPart = n/cutoff;

                if(thisPart >= 100) {
                    s += " " + ones[thisPart/100] + " hundred";
                    thisPart = thisPart % 100;
                }

                if(thisPart >= 20) {
                    s += " " + tens[thisPart/10];
                    thisPart = thisPart % 10;
                }

                if(thisPart >= 1) {
                    s += " " + ones[thisPart];
                }

                if(i>0) {
                    s += " " + groups[i];
                }
                n = n % cutoff;
            }

        }

        if(s.length()==0) {
            s = "zero";
        } else {
            s = s.substring(1);
        }

        System.out.println(s);
        return s;
    }
}