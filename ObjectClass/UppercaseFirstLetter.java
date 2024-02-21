package com.arun.string;

public class UppercaseFirstLetter {

  public static void main(String[] args) {

      System.out.println(capitalize("mkyong"));   // Mkyong
      System.out.println(capitalize("a"));        // A
      System.out.println(capitalize("@mkyong"));  // @mkyong

      //String capitalize = StringUtils.capitalize(str);
      //System.out.println(capitalize);

  }

  // with some null and length checking
  public static final String capitalize(String str) {

      if (str == null || str.length() == 0) return str;

      return str.substring(0, 1).toUpperCase() + str.substring(1);

  }

}