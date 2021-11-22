package com.luxoft.strings;


import java.util.*;

public class StrArr {


    public static void main(String[] args) {
        String str = new String();
        char[] chars = {'a', 'b', 'c'};
        String str1 = new String(chars);
        byte[] bytes = {10, 15, 20, 52};
        String str2 = new String(bytes);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = "somestring";
        System.out.println(str3.charAt(2));

        str3.length();

        String str4 = str3.replace('o', '1');
        System.out.println(str4);

        String str5 = "ABCJH-$%^$$$@@#$%$%#%$^#$^ssf43535#$^#^#$^#szdgsgsd";
        String str6 = str5.substring(0, str5.length() / 2);
        System.out.println(str5.codePointCount(5, 15));
        System.out.println(str5.replaceAll("[^A-Za-z0-9]+", ""));

        String[] arr2 = str5.split("[^A-Za-z0-9]+");
        System.out.println(arr2.toString());

        String aaa = "Aaa_bbb_ccc";
        String ccc = "_ccc";
        String bbb = "aaa_bbB" + ccc;
        ccc.toUpperCase(Locale.ENGLISH);
        System.out.println(aaa.equalsIgnoreCase(bbb));

        StringBuilder builder = new StringBuilder();
        builder.append(str2);
        builder.append("_dddd");
        builder.append(10);
        builder.deleteCharAt(6);
        System.out.println(builder);

        StringBuffer builder1 = new StringBuffer();
        builder1.append(str2);
        builder1.append("_dddd");
        builder1.append(10);
        builder1.deleteCharAt(6);
        System.out.println(builder1);

        int[] arr4 = new int[3];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;

        int[] arr5 = {5, 6, 8};

        for (int j = 0; j < arr5.length; j++) {
            System.out.println(arr5[j]);
        }

        int[][] arr7 = {arr4, arr5};
        System.out.println(arr7[1][2]);

        String[] stringArray = {"T1000", "T600", "LiquidMeTal"};
        String[] stringArray2 = {"T1000", "T600", "LiquidMeTal"};


        String[] copy = Arrays.copyOf(stringArray, 5);
        for (String item : copy) {
            System.out.println(item);
        }

        System.out.println(Arrays.deepEquals(stringArray, stringArray2));
        Arrays.sort(stringArray);
        for (String item : stringArray) {
            System.out.println(item);
        }
    }

}
