package ru.geekbrains.java_1.lesson4.online;

public class Employer {
    private String name;
    private double salary;
    private int age;

    Employer(String name, double salary, int age){
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    Employer(Employer e){
        name = e.name;
        salary = e.salary;
        age = e.age;
    }

    public String getName(){
       return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println("\nName:"+this.getName()+"\nSalary:"+this.getSalary()+"\nAge:"+this.getAge());
    }
    Employer myClone() {
        return new Employer(name,salary,age);
    }
    public void addSalary(){ // метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        if (this.getAge()>45){
            this.setSalary(this.getSalary()+5000);
        }
    }
   // Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

//* Подсчитать средние арифметические зарплаты и возраста
}
