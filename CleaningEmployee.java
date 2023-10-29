package com.company;

public class CleaningEmployee extends Employee {
    public CleaningEmployee(String cleaning_name){
        super(cleaning_name);
    }


    public void WorkOn(PassengerCompartment passenger_compartment) {
            this.Report(passenger_compartment);
    }


    public void WorkOn(CargoBay cargo_bay) {
            this.Report(cargo_bay);
    }


    public void WorkOn(EquipmentCompartment equipment_compartment) { }

    public void Report(PlaneComponent plane_component) {
        plane_component.SetCleaningWorkDone();
        System.out.println("Cleaning work in "+plane_component.GetId() +" is done");
    }
    @Override
    public String toString() {
        return "Cleaning employee with ID: " + this.GetId() +
                "and name: " + this.GetName()+"\n" ;
    }
}
