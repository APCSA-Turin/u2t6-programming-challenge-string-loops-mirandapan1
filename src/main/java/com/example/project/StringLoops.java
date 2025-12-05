package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
        String sub = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("a")) {
            } else {
                sub += str.substring(i, i + 1);
            }
        }
        return sub;
   }


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
        int i = 0;
        String sub = "";
        while (i < str.length()) {
            if (str.substring(i, i + 1).equals("a")) {
            } else {
                sub += str.substring(i, i + 1);
            }
            i++;

        }
        
       return sub;
   }


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
        String newStr = "";
        for (int i = str.length(); i > 0; i--) {
            newStr += str.substring(i - 1,i);
        }

       return newStr;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.substring(str.length() - i - 1,str.length() - i);
        }
       return newStr;
   }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        String newString = "";
        for (int i = 0; i < origStr.length(); i++) {
            if (origStr.substring(i, i + 1).equals(searchChar)) {
                newString += replaceChar;
            } else {
                newString += origStr.substring(i, i + 1);
            }
        }
        
        return newString;
   }


   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
        int i = 0;
        String newString = "";
        while (i < origStr.length()) {
            if (origStr.substring(i, i + 1).equals(searchChar)) {
                newString += replaceChar;
            } else {
                newString += origStr.substring(i, i + 1);
            }
            i++;

        }
       return newString;
   }

   public int countString(String searchString, String origString) {
        int count = 0;
        for (int i = 0; i <= origString.length() - searchString.length(); i++) {
            int check = 0;
            for (int e = 0; e < searchString.length(); e++) {
                if (origString.substring(i + e, i+ e + 1).equals(searchString.substring(e, e+  1))) {
                    check++;
                }
                
            }
            if (check == searchString.length()) {
                    count++;
            }
            
        }
        return count;
   }

   public String removeString(String searchString, String origString) {
        String result = origString;
        int index = origString.indexOf(searchString);
        while (index != -1) {
            result = result.substring(0, index) + result.substring(index + searchString.length());
            index = result.indexOf(searchString);

        }
        return result;
            
   }


   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
        String result = "";
        if (fromNum > toNum) {
            for(int i = fromNum; i >= toNum; i--) {
                if (i != toNum) {
                    result += i + ", ";
                } else {
                    result += i;
                }
            }
        } else {
            for(int i = fromNum; i <= toNum; i++) {
                if (i != toNum) {
                    result += i + ", ";
                } else {
                    result += i;
                }
            }
        }
        System.out.println(result);
   }



   public boolean isPalindrome(String myString) {
        String reversed = replaceCharacterV1(" ", reverseString(myString), "");
        String noSpace = replaceCharacterV1(" ", myString, "");
	    if (noSpace.equals(reversed)) {
	        return true;
        } else {
            return false;
        }


   }


    public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
        String result = "[";
            while (num > 0) {
                result += toPrint; 
                num--;
                if (num > 0) {
                    result += " ";
                }
            }
            result += "]";
            System.out.println(result);
        
        

    }
}
