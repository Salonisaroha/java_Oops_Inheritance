// Single inheritance
class Employee{
    int salary = 4000;
}
class Programmer extends Employee{
    int bonus = 500;
    public static void main(String[] args){
        Programmer p = new Programmer();
        int total = p.salary + p.bonus;
        System.out.println(" salary of an employee is : " + total);
    }
}
// Multi level  inheritance
class Animals{
    void eat(){
        System.out.println("Animal eating");
    }
}
class Dog extends Animals{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Dog{
    void meow(){
        System.out.println("Meow-Meow");
    }
}
class TestInhe{
    public static void main(String[] args)
{
    Cat c = new Cat();
    c.eat();
    c.bark();
    c.meow();
}}
// Hierarchical Inheritance
class Manager{
    void checking(){
        System.out.println(" Work is running in proper way or not.");
    }
}
class Cashier extends Manager{
    void cash(){
        System.out.println("Deposit or withdrawel of ruppess of customer");

    }
}
class Staff extends Manager{
    void work(){
        System.out.println(" Doing work properly");
       
    }
}
class Main{
    public static void main(String[] args){
            Cashier s = new Cashier();
            s.cash();
            s.checking();
        
            
            
        }
}
// Multiple Inheritance is not supported in java because in this two parent classes are there and because of it compiler get confused from which parent class it inheritance the property in sub class.

class Dean{
    void info(){
        System.out.println("Checking");
    }
}
class Head {
    void info(){
        System.out.println("Give updated information to departments");
    }
}
class Professors extends Dean {
    void teaching(){
        System.out.println("Teaching Providers");
    }
}
class Action{
    public static void main(String[] args){
        Professors p = new Professors();
        
        p.info();
        p.teaching();
    }
}

// Hybrid Inheritance :- It is a combination of two or more Inheritances.

class GrandFather{
    void showG(){
        System.out.println("He is my Grandfather");
    }
}
class Father extends GrandFather{
    void showF(){
        System.out.println("He is my Father");
    }
}
class Son extends Father{
    void showS(){
        System.out.println("He is son of Rakesh.");
    }
}
class Daughter extends Father{
    void showD(){
        System.out.println("she is daughter of Rakesh.");
        
          }
}
class Hybrid{
    public static void main(String[] args){
            Son s = new Son();
            s.showG();
            s.showF();
            s.showS();
            Daughter d = new Daughter();
            d.showD();
            d.showG();
            d.showF();
        }  
}


