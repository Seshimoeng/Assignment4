package ru.geekbrains.java_1.lesson4.online;

public class Main {
    public static void main(String[] args){
    Employer e0 = new Employer("Ivan",30000,26);
    Employer e1 = new Employer("Elena",15000,45);
    Employer e2 = new Employer("Igor",10000,30);
    Employer e3 = new Employer("John",42000,50);
    Employer e4 = new Employer("Tara",81300,21);


    Employer[] arr ={e0,e1,e2,e3,e4} ;
    int i;
    for ( i =0;i<5;i++){
        arr[i].addSalary();
        if (arr[i].getAge()>40) {
            arr[i].printInfo();
        }
    }

    }
}
