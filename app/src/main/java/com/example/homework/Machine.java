package com.example.homework;

public class Machine {

    public static void main(String[] args) {
        RealizationDrive button = new RealizationDrive(new Drive());
        button.drive();
    }
}

interface IDrive {
    void spinTheWheels();
}

class Drive implements IDrive{

    @Override
    public void spinTheWheels() {
        System.out.println("Колёса крутятся");
    }
}

class RealizationDrive{
    IDrive iDrive;
    RealizationDrive(IDrive action){
        this.iDrive = action;
    }
    public void drive(){
        iDrive.spinTheWheels();
    }

}