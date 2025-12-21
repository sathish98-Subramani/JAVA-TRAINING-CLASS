public class Demo{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // 1. Comments and its types
             //Single line
             /*  multi line
                  comments */

        // 2.Variable 
            // int a = 10
           // int ab = 20
           //! int 1abc = 20 error number used at start
           // int _abc=20;
           //int a_b_c c = 10
           // int \$ c = 10
           //int a$ b = 20 ; error space
           //int a b = 40
        //3.Datatypes
          //byte, short, int, long, float, double, char, boolean

          byte a = (byte) 128; //Narrow Type Casting
          System.out.println(a);

          char c= 'a';//ANSCI
          int b=c;   //Widining Type casting
          System.out.println(b);

          float f = 3.14f;   // in java for float we need to mention that as 'f' at the end of the number as given
          double d = 3.14;   // there is no need for decleration but 'd' can be used
        //   operators
        ////4.Operators
                /*Unary Operator, ---> ++,--

                int a=10;
                a=a+1; --> Normal
                a++; --> unary ,

                pre: ++a
                post: a++

                ex:
                  int a = 10
                  System.out.println(a++);//post increment
                  System.out.println(a);
                  System.out.println(++a);//pre increment

                  Arithmetic Operator, --> +,-,*,/,%

                  int a = 1% * 5
                  System.out.println(a);

                  if you know you know

                  Shift Operator,(Bitwise Operator,)
                  Relational Operator,
                  Bitwise Operator, --> &,|,^(XOR),~(not)

                  //4.bitwise operator-> &,|,^,, <<, >>

                  int a=2&10;
                  System.out.println(a);

                  1.decimal -base-10
                  2.binary base-2
                  3.octal base-8
                  4. hexedecimal base-16 (10-15,A-F)

                  & - if both 1 then true
                  | - if any one 1 then true(1)
                  ^ - if different(opposite) like 0 and 1 then true
                  << - move left , if 2= 0010 then 2<<1 will be 0100
                  >> - same as left but right
                  ~ - write the inverse and also the msb and lsb

                  Logical Operator, --> && ,|| ,!

                  Ternary Operator and
                  Assignment Operator. */
        // 1. unary operators
        //int a= 10;
        // a=a+1;
        //a++:
        int A = 10;
        System.out.println(A++);//Post increment
        System.out.println(A);
        System.out.println(++A);//Pre increment

        // 2. Arithmetic operators
        // %,/ , * , + , -
        int x=1%5;
        System.out.println(x);

        // Flow control statements
        int age=18;
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }
}