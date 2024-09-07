package com.adalbertosn1982.courseteluskounittests;

public class ReverseString {
    public String reverse2(String string) {
        char[] sb = string.toCharArray();
        int left = 0, right = sb.length - 1;
        while (left < right) {
            char temp = sb[left];
            sb[left] = sb[right];
            sb[right] = temp;
            left++;
            right--;
        }
        return new String(sb);
    }
}
