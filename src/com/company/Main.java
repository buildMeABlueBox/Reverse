package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseWords("s'teL ekat edoCteeL tsetnoc"));
    }

    public static String reverseWords(String s) {
        char[] sentence = s.toCharArray();
        int ptr1 = 0, ptr2 = sentence.length-1;
        boolean switching = true;
        char temp;
        do{
            temp = sentence[ptr1];
            sentence[ptr1] = sentence[ptr2];
            sentence[ptr2] = temp;
            ptr1++;
            ptr2--;
            if(ptr1 >= ptr2)
                switching = false;
        }while(switching);
        return new String(sentence);
    }
}
