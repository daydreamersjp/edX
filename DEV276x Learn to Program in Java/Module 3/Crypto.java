public class Crypto {
    public static void main (String[] args) {
       System.out.println(encryptString("This is some \"really\" great. (Text)!?", 2, 3));
       System.out.println(decycriptString(encryptString("This is some \"really\" great. (Text)!?", 2, 3), 3));
    }

    // Part 1 - Normalize Text
    public static String normalizeText(String str) {
        str = str.replaceAll(" ", "");
        str = str.replaceAll("[\\p{Punct}&&[^0-9]&&[^,]]", ""); //Remove punctuations
        str = str.toUpperCase();
        return str;
    }


    // Part 2 - Caesar Cipher
    public static String caesarify (String str, int shift) {
        String res_str = "";
        for (int i = 0; i < str.length(); i++) {
            int ind;
            ind = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(str.charAt(i));
            res_str += shiftAlphabet(shift).substring(ind,ind+1);
        }
        return res_str;

    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }


    // Part 3 - Codegroups
    public static String groupify(String str, int group_size) {
        int group_num;
        String res_str = "";

        if (str.length() % group_size == 0) {
            group_num = str.length() / group_size;
        } else {
            group_num = str.length() / group_size + 1;
        }

        for (int i = 0; i < group_num; i++) {
            if (i != group_num - 1) {
                res_str += str.substring(i * group_size, (i + 1) * group_size) + " ";
            } else {
                res_str += str.substring(i * group_size) + repeatstr("x", (group_num * group_size - str.length()));
            }
        }

        return res_str;

    }

    public static String repeatstr(String str, int n) {
        if (n==1) {
            return str;
        } else {
            return repeatstr(str, n - 1) + str;
        }
    }


    // Part 4 - Putting it all together
    public static String encryptString(String str, int shift, int group_size) {
        String res_str = "";
        res_str = normalizeText(str);
        res_str = caesarify(res_str, shift);
        res_str = groupify(res_str, group_size);

        return res_str;
    }


    // Part 5 - Hacker Problem - Decrypt
    public static String ungroupify(String str) {
        String res_str="";
        res_str = str.replaceAll(" ", "");
        res_str = res_str.replace("x", "");
        return res_str;
    }

    public static String decycriptString(String str, int shift) {
        String res_str="";
        res_str = ungroupify(str);
        res_str = caesarify(res_str, -shift);
        return res_str;
    }    
}
