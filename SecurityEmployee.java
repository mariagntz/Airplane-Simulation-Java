package com.company;

public class SecurityEmployee extends Employee {


    public SecurityEmployee(String security_name) {
        super(security_name);

    }

    public void WorkOn(PassengerCompartment passenger_compartment){
        this.Report(passenger_compartment);
    }


    public void WorkOn(CargoBay cargo_bay) {
        this.Report(cargo_bay);

    }


    public void WorkOn(EquipmentCompartment equipment_compartment) {
        this.Report(equipment_compartment);
    }

    public void Report(PlaneComponent plane_component) {
        plane_component.SetSecurityWorkDone();
        System.out.println("Security work in "+plane_component.GetId()+" is done");
    }
    @Override
    public String toString() {
        return "Security employee with ID: " + this.GetId() +
                "and name: " + this.GetName()+"\n" ;
    }
}
