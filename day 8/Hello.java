/*
        Inheritance :

        Inheritance is a process in whch one object accquires all the properties and behaviors of a parent object
        actomatically.In such a way,you can reuse the code functionality of the existing class when you create a new class.

        Types :

        1. Single Inheritance : When one class inherits another class, it is known as single inheritance.
        2. Hierarchial Inheritance : Hierarchial Inheritance is defined as the process of deriving more than one class from a base class
        3. Multilevel Inheritance : When a class is derived from a class which is also derived from another class, it is known as multilevel inheritance.
        4. Hybrid Inheritance : It is a combination of single, multiple inheritance and hierarchial inheritance.
        5. Multiple Inheritance : When a class is derived from more than one base class, it is known as multiple inheritance.
        
        Abstraction :

        Hiding the Unnecesary details & showing only the essential parts\functional to the user.


    1)    package com.abstraction;
        public abstract class Parent {
        parent()
        {
        System.out.println("no -args constructor");
        }
        
        public static void main(String[] args)
        {
        // Parent P= new Parent();
        // p.cooking();
        // p.study();
        }
        
        void cooking()
        {
        System.out.prinln("cooking");
        }
        abstract void study()
        }

    2)  package com.abstraction;
        public class child ectends Parent {
        child()
        {
        System.out.println("Child Constructon");
        }
        public static void main(String[] args){
        child c = new child();
        c.study();
        c.cooking();
        }
        @override
        void study() {
        System.out.println("Studying Java");
        }
        }    

     3)  package com.abstraction;
         public class Child1 extends Parent1{
                Parent1()
                {
                        System.out.println("No-args Parent Constructor");
                }
                protected void work()
                {
                        System.out.println("Working in Home");
                }
                void watch_Tv()
                {
                        System.out.println("Watching Tv");
                }


        
     4)  package com.abstraction;
         public class Child1 extends Parent1{
        Parent1()
        {
        System.out.println("No-args Parent Constructor");
        }
         public static void main(String[] args);
         Child1=new Child1();
         c.work();
         }

        // Method overriding (RunTime polymorphism)
        // Do not change the visibility of the method
        
        protected void work()
        {
        System.out.println("Working in Office");
        }
        @override
        void study() {
        System.out.println("Studying AWS");
        }
        }
        

        Data Binding :

        It is a process of binding the application ui & bussiness logic.

        Abstraction is achieved in two ways :

        * Abstract Class
        * Interface
        
        1)Abstract class

        * An abstract class must be cleared with an abstract keyword.
        * It can have abstract and non abstract methods.
        * It cannot be interface.
        * It can be construtors and static method also.
        * It can have final methods which wil force interface to not change the body.
        
        2)Interface

        * All the fields in interface are public,static and final by default.
        * All methods are public & abstract by default.
        * All class that implements an nterfae must implement all the methods declared.
        
        Final Keyword :

    1)  package com.abstraction;
        public abstract class Parent {
                final int pocket_money=10;
                static int cash=100;
                
        final void work()
        {
        System.out.println("Working in home");
        }
        abstract void Study ();
        }

     2) package com.abstraction;
        public class child extends Parent {
        child()
        {
        System.out.println("Child Constructors");
        }
        public static void main(String[] args) {
        Child c=new Child();
        c.study();
        }
        @override
        void study(){
        System.out.println("Studying Java"); 
        }
        }
        }


        Interface:

        Set of rules or contract

         * By default methods in the interface are abstract.
         * By Default all methods in the interface are public.
         * do not reduce visibility of the method.
         * Private access modifier is not allowed in the interface. 


        package com.interface;
        public interface OfficeRules {
                public final int salary = 25000;
                public final int no_of_Leaves = 10;
                abstract void work_8_hours();
                abstract void wear_formulas();
                default void work() {
                        System.out.println("Working in zoho");
                }
                default void work() {
                        System.out.println("Food is good in canteen");
                }
                public static void main(String[] args) {
                        System.out.println("Office Interface");
                        }
                static void company {
                System.out.prinln("Working in a company");
                }
                }


        


*/