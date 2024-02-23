import java.util.*;
public class Strings{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String path){
        int x = 0,y = 0;

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si ,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
//STRINGS ARE IMMUTABLE SO FOR MODIFYING IT WE HAVE TO COPY IT
//BUT STRINGBUILDERS CAN BE MODIFIED WITHOUT COPYING

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
       }
       return sb.toString();
    }

    public static String compress(String str){
        String newstr = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

   
      
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // char arr[] = { 'a' , 'b', 'c' , 'd'};
        // String str =  " abcd ";
        // String str2 = new String("xyz");

        //Strings are IMMUTABLE

        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullname = "Andrew Garfield";
        // System.out.println(fullname.length());

        // //CONCATENATION
        // String firstname = "Shweta";
        // String lastname = "Dhote";
        // String Fullname = firstname + " " +  lastname;
        // System.out.println(Fullname);
        // System.out.println(Fullname.length());
        // System.out.println(Fullname.charAt(0));
        // printletters(Fullname);
        // // System.out.println(isPalindrome(firstname));
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1 == s3){
        // if(s1.equals(s3)){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // String str = "Helloworld";
        // System.out.println(substring(str,0,4));
        
        // String fruits[] = {"apple","mango","orange","pineapple"};
        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        // System.out.println(sb.length());
        
    //     String str = "hi , i am shweta";
    //     System.out.println(toUpperCase(str));

    // String str = "aaabbcccdd";
    // System.out.println(compress(str));

    // String str = new Scanner(System.in).next();
    //  int count = 0;
    //     for(int i=0;i<str.length();i++){
    //         char ch = str.charAt(i);
    //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    //             count ++;
    //         }
    //     }
    //     System.out.println("count of the vowels is:" + count);

    // String str = "Shwetadhote";
    // String str1 = "AndrewGarfield";
    // String str2 = "Shwetadhote";
    // System.out.println(str.equals(str1) + " " + str.equals(str2));

    // String str = "ApnaCollege".replace("l","");
    // System.out.println(str);

    //ANAGRAMS
    String str1 = "earth";
    String str2 = "heart";
    //convert the strings in lowercase so that we don't have to check uppercase and lowercase
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    //check if strings are equal in length or not
    if(str1.length() == str2.length()){
        //convert strings into char array
        char[] str1charArray = str1.toCharArray();
        char[] str2charArray = str2.toCharArray();
        //sort the char arrays
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);
        //if sorted arrays are identical then the strings are anagrams
        boolean result = Arrays.equals(str1charArray,str2charArray);
        if (result){
            System.out.println("Strings are anagrams of each other");
        }else{
            System.out.println("strings are not anagrams of each other");
        }
    }else{
         System.out.println("strings are not anagrams of each other");
    }

       
sc.close();
    }
}