package com.company;

public class CargoBay extends PlaneComponent{
    int security_work_done=0;
    int maintenance_work_done=0;
    int cleaning_work_done=0;
    EquipmentCompartment equipment_compartment;
    public CargoBay(){
        super();
        equipment_compartment= new EquipmentCompartment();
    }


    public int ReadyCheck() {
        if (security_work_done==0)
            return 0;
        if (cleaning_work_done==0)
            return 0;
        if(maintenance_work_done==0)
            return 0;
        if(equipment_compartment.ReadyCheck()==0)
            return 0;
        System.out.println("Cargo Bay ok!");
        return 1;

    }


    public void Process(Employee e) {
        e.WorkOn(equipment_compartment);
        e.WorkOn(this);

    }
    @Override
    public void SetCleaningWorkDone() {
        cleaning_work_done = 1;
    }
    @Override
    public void SetSecurityWorkDone() {
        security_work_done = 1;
    }
    @Override
    public void SetMaintenanceWorkDone() {
        maintenance_work_done = 1;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
            CargoBay cargo=(CargoBay) o;
        if (this.GetId()!=cargo.GetId())
            return false;
        if (this.GetDescription()!=cargo.GetDescription())
        if (this.security_work_done!=cargo.security_work_done)
            return false;
        if (this.maintenance_work_done!=cargo.maintenance_work_done)
            return false;
        if (this.cleaning_work_done!=cargo.cleaning_work_done)
            return false;
        return (this.equipment_compartment.equals(cargo.equipment_compartment));
    }

    @Override
    public String toString() {
        return "Cargo Bay with ID: " + this.GetId() +
                ", security work done: " + security_work_done
                + ", maintenance work done: " + maintenance_work_done +
                ", cleaning work done: " + cleaning_work_done + " and equipment compartment: " +
                equipment_compartment.toString() ;
    }
}
