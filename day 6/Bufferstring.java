import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
public class Bufferstring {
    public static void main(String[] args) {
    StringBuffer sb= new StringBuffer("Hello");
    System.out.println(sb);
    StringBuilder sb1 = new StringBuilder( "World");
    
    // append()
    sb1.append("Hello");
    
    // convert StringBuilder -> String
    String s1=new String("s1");
    System.out.println();

    // insert
    StringBuilder sb2=new StringBuilder("Welcome");
    sb2.insert(0,"hello");
    System.out.println(sb2);

    // reverse
    StringBuilder sb3=new StringBuilder("Hello");
    System.out.println(sb3.reverse());

    // deletecharAt(index)
     System.out.println(sb3.deleteCharAt(0));

    //  replace()
    System.out.println(sb3.replace(0,2,"hii"));

    // hashCode
    System.out.println(sb3.hashCode());



}
}