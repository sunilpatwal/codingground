import java.io.*;
public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    
    public Employee(String name){
        this.name = name;
    }
    public void getAge(int empAge){
        age = empAge;
    }
    public void getDesig(String desig){
        desig = designation;
    }
    public void getSal(double sal){
        salary = sal;
    }
    public void printEmp(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Deisgnation:" + designation);
        System.out.println("Salary:" + salary);
    }
}
