package com.karthik.subset_string_subseq;

public class que1_remove_a {
    public static void main(String[] args) {
        String up = "baccad";
        System.out.println(skip(up));

    }
    public static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        StringBuilder resultBuilder = new StringBuilder();

        if (ch != 'a') {
            resultBuilder.append(ch);
        }

        resultBuilder.append(skip(up.substring(1)));

        return resultBuilder.toString();
    }


}
