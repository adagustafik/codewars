public class WhatCentury {
    public static void main(String[] args) {
//        Return the century of the input year. The input will always be a 4 digit string, so there is no need for validation.
        System.out.println(whatCentury(1199));
        System.out.println(whatCentury(2150));
        System.out.println(whatCentury(2254));
    }

    private static String whatCentury(int year) {
        StringBuilder sb = new StringBuilder();
        int century = year % 100 == 0 ? year / 100 : (year /100) + 1;
        return sb.append(century).append(century % 10 == 1  && century % 100 != 11 ? "st" : century % 10 == 2 && century % 100 != 12 ? "nd" : century % 10 == 3 ? "rd" : "th").toString();
    }
}
