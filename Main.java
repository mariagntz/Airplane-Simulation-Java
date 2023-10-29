package com.company;

public class Main {

    public static void main(String[] args) {
        Plane plane;
        CleaningEmployee cleaning_employee;
        MaintenanceEmployee maintenance_employee;
        SecurityEmployee security_employee;

        plane=new Plane("PLANE TITLE",50,201);
        cleaning_employee=new CleaningEmployee("CLEANING");
        maintenance_employee=new MaintenanceEmployee("MAINTENANCE");
        security_employee=new SecurityEmployee("SECURITY");

        plane.Process(cleaning_employee);
        plane.Process(maintenance_employee);
        plane.Process(security_employee);

        if (plane.ReadyCheck()==1)
            System.out.println("Airplane ready to take off!");

    }
}
