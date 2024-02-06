
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsuktakhatri
 */
//public class demo {
//    public String Details(String name, String level){
//        return name +level;
//    }
//    public int Details(int age){
//        return age;
//        
//    }
//    public static void main(String args[]){
//        demo d= new demo();
//        System.out.println(d.Details(20));
//        
//        
//    }
//   
//
//    
//}
//
//
//// Parent class
//class Animal {
//    String name;
//
//    Animal(String name) {
//        this.name = name;
//    }
//
//    void eat() {
//        System.out.println(name + " is eating");
//    }
//
//    void sleep() {
//        System.out.println(name + " is sleeping");
//    }
//}
//
//// Child class inheriting from Animal
//class Dog extends Animal {
//    Dog(String name) {
//        super(name);
//    }
//
//    void bark() {
//        System.out.println(name + " is barking");
//    }
//}
//
//public class InheritanceExample {
//    public static void main(String[] args) {
//        // Creating an instance of the parent class
//        Animal animal = new Animal("Generic Animal");
//        animal.eat();
//        animal.sleep();
//
//        System.out.println();
//
//        // Creating an instance of the child class
//        Dog dog = new Dog("Buddy");
//        dog.eat(); // Inherited method from the parent class
//        dog.sleep(); // Inherited method from the parent class
//        dog.bark(); // Method specific to the Dog class
//    }
////}
//
//class Employee{
//    String name;
//    public void Details(){
//      
//        Scanner sc= new Scanner(System.in);
//        name=sc.next();
//    }
//    public void ShowData(){
//        System.out.println(name+"is permanent employee");
//    }
//}
//
//
//class Programmer extends Employee{
//    
//    public void SHowData(){
//        super.Details();
//        
//        super.ShowData();
//        System.out.print("Programmin department");
//    }
//}
//
//public class InheritanceExample{
//    public static void main(String []args){
//        
//        Programmer p= new Programmer();
//        p.SHowData();
//    }
//}
//      
//
//class A{
//    A(){
//        System.out.print("This is A");
//    }
//}
//class B extends A{
//    B(){
//        System.out.print("This is B");
//    }
//}
//class C extends B{
//    C(){
//        System.out.print("This is C");
//    }
//}
//
//public class InheritanceExample{
//    public static void main(String []args){
//        
//       C c= new C();
//       
//    }
//}


//
//public class InheritanceExample{
//    public static void main(String []args){
//        Programmer p= new Programmer();
//        p.Total();
//        p.getData();
//        
//       
//       
//    }
//}
//
//interface People{
//    int Numberofpeople=5;
//    void Total();
//}
//
//class Employee{
//    String name;
//    String department;
//    public void getData(){
//        System.out.println("Enter the details\n");
//        Scanner sc= new Scanner(System.in);
//        name=sc.next();
//        department=sc.next();
//        System.out.println(name+"works in "+department+"department");
//    }
//    
//}
//
// class Programmer extends Employee implements People{
//    
//    public void Total(){
//        System.out.println("Total number of employye is "+Numberofpeople);
//        
//    }
//    @Override
//    public void getData(){
//        
//        super.getData();
//        System.out.print("Thank you");
//        
//    }
//    
//    
////}
//class throwsexample{
//     void throwsexampleofage(int age) 
//    {
//        try{
//             if(age<18){
//            throw new Exception("Error has occured");
////            System.out.println("Invalid");
//        }
//        else{
//            System.out.println("valid");
//            
//        }
//        }
//        catch(Exception e){
//            System.out.print(e.getMessage());
//            
//            
//        }
//       
//        
//    }
//}
//public class InheritanceExample{
//   
//    public static void main(String []args)     {
//        throwsexample t= new throwsexample();
//        t.throwsexampleofage(12);
//        
//        
//    }
//    
//    }

class CustomException extends Exception{
    CustomException(String m){
        super(m);
        
        
    }
}

class Test{
    
    void Testage(int age)throws Exception
    {
        
    if(age<18){
        throw new CustomException("exceptionnnnn");
    }
    
}

  }
    
public class InheritanceExample{
   
    public static void main(String []args)  throws Exception
    {
        try{
            Test t= new Test();
        t.Testage(14);
            
        }
        catch(Exception m){
            System.out.print("Error has ocured"+m);
            
        }
        
        
        
    }
    
    }

