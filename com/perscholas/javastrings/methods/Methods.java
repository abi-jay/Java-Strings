package com.perscholas.javastrings.methods;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "";
        System.out.println("str1 length:\t"+str1.length());  // 4
        System.out.println("Empty length:\t"+str2.length());  // 0
        System.out.println("Java length:\t"+"Java".length());  // 4
        System.out.println("Java\\n length:\t"+"Java\n".length()); // 5
        System.out.println("Learn Java length:\t"+"Learn Java".length()); // 10
        String s1="";
        String s2="hello";
        System.out.println("s1 empty:\t"+s1.isEmpty());      // true
        System.out.println("s2 empty:\t"+s2.isEmpty());      // false
        String s3="  hello   ";
        System.out.println("Before Trim:\t"+s3+"how are you");        // without trim()
        System.out.println("After Trim:\t"+s3.trim()+"how are you"); // with trim()
        String s4="HELLO HOW Are You?";
        String s4lower=s4.toLowerCase();
        System.out.println("str lower:\t"+s4lower);
        String s5="hello how are you";
        String s5upper=s5.toUpperCase();
        System.out.println("str upper:\t"+s5upper);
        //------By using concat method----
        String st1 = "Learn ";
        String st2 = "Java";
        // concatenate st1 and st2
        System.out.println("Concat Learn Java:\t"+st1.concat(st2)); // "Learn Java"
        // concatenate st2 and st11
        System.out.println("Concat JavaLearn:\t"+st2.concat(st1)); // "JavaLearn "
        //--- By using + operator---
        String st3 =  "hello";
        String st4 = "Learners";
        //  String st5 = st3.concat(st4); or
        String st5 = st3 + st4;
        System.out.println("Concat helloLearners:\t"+st5); // "helloLearners "
        //both of the above statement will give you the same result
        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";
        System.out.println(message); //"Welcome to Java"
        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2
        System.out.println(s); //"Chapter2"
        // String Supplement is concatenated with character B
        String ss = "Supplement" + 'B'; // s1 becomes SupplementB
        System.out.println(ss); //"SupplementB"
        String vowels = "a::b::c::d:e";
        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");
        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
        String message1 = "Welcome to Java";
        System.out.println("The first character in the message is " + message1.charAt(0));
        String ss1="hello";
        String ss2="hello";
        String ss3="hemlo";
        String ss4="flag";
        System.out.println("Equal:\t"+ss1.compareTo(ss2)); // 0 because both are equal
        System.out.println("Lower:\t"+ss1.compareTo(ss3)); //-1 because "l" is only one time lower than "m"
        System.out.println("Greater:\t"+ss1.compareTo(ss4)); // 2 because "h" is 2 times greater than "f"
        String ss5 = "java is fun";
        // extract substring from index 0 to 3
        System.out.println("Substring:\t"+ss5.substring(0, 4));
        String ss6 = "Java is fun";
        int result1;
        // getting index of character 's'
        result1 = ss6.indexOf('s');
        System.out.println("Index of s:\t"+result1); // 6
        // getting index of character 'J'
        result1 = ss6.lastIndexOf('J');
        System.out.println("Index of J:\t"+result1); // 0
        // the last occurrence of 'a' is returned
        result1 = ss6.lastIndexOf('a');
        System.out.println("Last occurrence of a:\t"+result1); // 3
        // character not in the string
        result1 = ss6.lastIndexOf('j');
        System.out.println("Not in String:\t"+result1); // -1
        // getting the last occurrence of "ava"
        result1 = ss6.lastIndexOf("ava");
        System.out.println("Last occurrence of ava:\t"+result1); // 1
        // substring not in the string
        result1 = ss6.lastIndexOf("java");
        System.out.println("Not in String:\t"+result1); // -1
        String ss7 = "Learn Java";
        Boolean result2;
        // check if ss7 contains "Java"
        result2 = ss7.contains("Java");
        System.out.println("Learn Java contains Java:\t"+result2);  // true
        // check if ss7 contains "Python"
        result2 = ss7.contains("Python");
        System.out.println("Learn Java contains Python:\t"+result2);  // false
        // check if ss7 contains ""
        result2 = ss7.contains("");
        System.out.println("Learn Java contains \"\":\t"+result2);  // true
        String st6 = "abc cba";
        // all occurrences of 'a' is replaced with 'z'
        System.out.println("Replace a by z:\t"+st6.replace('a', 'z'));
        // all occurences of 'L' is replaced with 'J'
        System.out.println("Replace L by J:\t"+"Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Replace 4 by J:\t"+"Hello".replace('4', 'J'));
        // all occurrences of "C++" is replaced with "Java"
        System.out.println("Replace C++ by Java in abc cba:\t"+st6.replace("C++", "Java"));
        // all occurences of "aa" is replaced with "zz"
        System.out.println("Replace aa by zz in aa bb aa zz:\t"+"aa bb aa zz".replace("aa", "zz"));
        // substring not in the string
        System.out.println("Replace C++ by C in Java:\t"+"Java".replace("C++", "C"));
        String ts1="PerScholas";
        String ts2="PerScholas";
        String ts3=new String("PerScholas");
        String ts4="Teksystem";
        System.out.println("PerScholas equals PerScholas:\t"+ts1.equals(ts2));//true
        System.out.println("PerScholas equals PerScholas:\t"+ts1.equals(ts3));//true
        System.out.println("PerScholas equals Teksystem:\t"+ts1.equals(ts4));//false
        String sp1="Perscholas";
        String sp2="Perscholas";
        String sp3=new String("Perscholas");
        System.out.println("Perscholas equals same instance Perscholas:\t"+(sp1==sp2));//true (because both refer to same instance)
        System.out.println("Perscholas equals nonpool instance Perscholas:\t"+(sp1==sp3));//false(because s3 refers to instance created in nonpool)
        String sq1="Perscholas";
        String sq2="Perscholas";
        String sq3="Perscholas";
        System.out.println("Compare Perscholas and Perscholas\t"+sq1.compareTo(sq2));//0
        System.out.println("Compare Perscholas and Perscholas\t"+sq1.compareTo(sq3));//0
        System.out.println("Compare Perscholas and Perscholas\t"+sq3.compareTo(sq1));//0
    }
}
