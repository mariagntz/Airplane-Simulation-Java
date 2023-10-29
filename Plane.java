package com.company;
import javax.swing.*;

public class Plane {
    String plane_title;
    String description;
    int plane_capacity;
    int passenger_compartment_number;
    PassengerCompartment[] passenger_compartment;
    EquipmentCompartment[] equipment_compartment;
    CargoBay cargo_bay;

   public  Plane(String p_title, int p_capacity, int passengers_number) {
        super();
        plane_title=p_title;
        plane_capacity=p_capacity;
        equipment_compartment= new EquipmentCompartment[3];
        for(int i=0; i<3; i++)
            equipment_compartment[i] = new EquipmentCompartment();
        cargo_bay= new CargoBay();
        passenger_compartment_number=passengers_number/plane_capacity;
        if((passengers_number%plane_capacity)>0)
            passenger_compartment_number++;
        passenger_compartment=new PassengerCompartment[passenger_compartment_number];
        for (int j=0; j<passenger_compartment_number; j++)
            passenger_compartment[j]= new PassengerCompartment(1);

    }

    public String GetDesc(){
        return description;
    }
    public void setDesc(){
        description=this.toString();
    }

    public String GetTitle() {
        return plane_title;
    }

    public int GetPlaneCapacity() {
        return plane_capacity;
    }

    public int GetPassCompNumber() {
        return passenger_compartment_number;
    }


    public int ReadyCheck() {
        if (cargo_bay.ReadyCheck() == 0)
            return 0;
        for (int i = 0; i < passenger_compartment_number; i++) {
            if (passenger_compartment[i].ReadyCheck() == 0)
            return 0;
        }
        for (int j = 0; j < 3; j++) {
            if (equipment_compartment[j].ReadyCheck() == 0)
            return 0;
        }
        return 1;
    }

    public void Process(Employee e) {
        cargo_bay.Process(e);
        for(int i=0; i<passenger_compartment_number; i++)
            passenger_compartment[i].Process(e);
        for(int j=0; j<3; j++)
            equipment_compartment[j].Process(e);

    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Plane plane=(Plane) o;
        if (plane_title.equals(plane.plane_title)==false)
            return false;
        if (this.plane_capacity != plane.plane_capacity)
            return false;
        if (this.passenger_compartment_number != plane.passenger_compartment_number)
            return false;
        if(this.cargo_bay.equals(plane.cargo_bay)==false)
            return false;
        for (int i = 0; i <3; ++i) {
            if (this.equipment_compartment[i].equals(plane.equipment_compartment[i]) ==false)
            return false;
        }
        for (int j = 0; j <passenger_compartment_number ; ++j) {
            if (this.passenger_compartment[j].equals(plane.passenger_compartment[j])==false)
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String passcomp_desc="";
        String equipment_desc="";
        for (int i=0; i<passenger_compartment_number; i++)
            passcomp_desc+= passenger_compartment[i].toString();
        for(int j=0; j<3; j++)
            equipment_desc+=equipment_compartment[j].toString();
        return "Plane with title: " + this.plane_title +
                ", passenger compartment capacity: " + plane_capacity+ ", cargo bay: \n" + cargo_bay.toString() +
                ", equipment compartments: \n" + equipment_desc+" and passenger compartments:\n" +
                passcomp_desc+"\n";
    }
}
