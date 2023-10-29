package com.company;

public class MaintenanceEmployee extends Employee {
    public MaintenanceEmployee(String maintenance_name){
        super(maintenance_name);

    }


    public void WorkOn(PassengerCompartment passenger_compartment) {

    }

    public void WorkOn(CargoBay cargo_bay) {
        this.Report(cargo_bay);

    }


    public void WorkOn(EquipmentCompartment equipment_compartment) {
        this.Report(equipment_compartment);

    }

    public void Report(PlaneComponent plane_component) {
        plane_component.SetMaintenanceWorkDone();
        System.out.println("Maintenance work in "+plane_component.GetId()+" is done");
    }
    @Override
    public String toString() {
        return "Maintenance employee with ID: " + this.GetId() +
                "and name: " + this.GetName()+"\n" ;
    }
}
