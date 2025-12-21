// public class Sixthday {
    
// }
// String 
// String methods
// length()
// isBlank()
// isEmpty()
public class Sixthday{
    public static void main(String[] args) {
        String str1= new String("Hello");
        String str2="World";
        System.out.println(str1+" "+str2);  
        // length
        System.out.println(str1.length()); 
        // isBlank
        // returns true if the string is empty or contains only white space codepoints
        // otherwise flase
        String str3=" t";
    System.out.println(str3.isBlank()); 
    
        // isEmpty
        // it returns true when the length of the string is 0 otherwise false
        // to check the spaces
        String s2="";
        System.out.println(s2.isEmpty());

        // compare
        String s1= new String("ABC");
        String s3=new String("ABC");
        if(s1==s3){
            System.out.println("s1 and s3 are equal");
        }else{
            System.out.println("s1 and s3 are not equal");
        }
        String str5="abc";
        String str6="abc";
        if(str5==str6){
            System.out.println("It is equal");
        }else{
            System.out.println("It is not equal");
        }

        //equals()
        String ss1="abc";
        String ss2="abc";
        System.out.println(ss1.equals(ss2)); //true

        // equalsIgnorecase()
        String st1 = "abc";
        String st2 = "ABC";
        System.out.println(st1.equalsIgnoreCase(st2));
        
        // compareTo()
        String string1="ABC";
        String string2="abc";
        System.out.println(string1.compareTo(string2));

        // compareToIgnoreCase()
        String stt1="ABC";
        String stt2="abc";
        System.out.println(stt1.compareToIgnoreCase(stt2));

        // startswith()
        String a="Hello World";
        System.out.println(a.startsWith("ello"));
        System.out.println(a.startsWith("H"));

        // endsWith()
        String b="Programming";
        System.out.println(b.endsWith("ing"));

        // contentEquals()
        String c="Hello";
        System.out.println(c.contentEquals("Hello"));

        // contains()
        String d="Welcome to Java Programming";
        System.out.println(d.contains("Java"));

        // indexOf()
        String e="My World My Life";
        System.out.println(e.indexOf("M"));

        // indexOf(start,FromIndex)
        System.out.println(e.indexOf("M",5));
         
        // lastIndex()
        System.out.println(e.lastIndexOf("y"));
    
        // substring(starting index,end index-1)
        String f="My World";
        System.out.println(f.substring(0));
        System.out.println(f.substring(1,0));
        System.out.println(f.substring(2,5));

        // no negative index
        // System/out.println(0,-1)

        // charAt()
        String g="My programming World";
        System.out.println(g.charAt(7));

        // subsequence()
        String h="Hello World";
        System.out.println(h.subSequence(0,5));
 }
}   