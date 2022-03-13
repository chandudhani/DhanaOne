package com.dhana.news;

public class reverse {
    public static void main (String[] args) {
       
        String str= "madam", nstr="";
        
       
      System.out.print("Original word: ");
      System.out.println("madam"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
    	  char ch= str.charAt(i); //extracts each character
          nstr= nstr+ch; //adds each character in front of the existing string

      }
      System.out.println("Reversed word: "+ nstr);
      if(str==nstr) {
    	  System.out.println("Its plyndrome");
      }
      else {
    	  System.out.println("Not a plyndrome");

      }
    }
}