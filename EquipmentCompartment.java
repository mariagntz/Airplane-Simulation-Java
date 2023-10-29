package com.company;

public class EquipmentCompartment extends PlaneComponent {
    int security_work_done=0;
    int maintenance_work_done=0;

    public EquipmentCompartment(){
        super();
    }


    public int ReadyCheck() {
        if (security_work_done==0)
            return 0;
        if (maintenance_work_done == 0)
            return 0;
        System.out.println("Equipment Compartment OK!");
        return 1;
    }


    public void Process(Employee e) {
        e.WorkOn(this);
    }

    @Override
    public void SetMaintenanceWorkDone() {
        maintenance_work_done = 1;
    }
    @Override
    public void SetSecurityWorkDone() {
        security_work_done = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EquipmentCompartment equipment=(EquipmentCompartment) o;
        if (this.GetId() != equipment.GetId())
        return false;
        if (this.security_work_done != equipment.security_work_done)
        return false;
        return (this.maintenance_work_done != equipment.maintenance_work_done);
    }

    @Override
    public String toString() {
        return "Equipment Compartment with ID: " + this.GetId() +
                " security work done: " + security_work_done +
                " and maintenance work done: " + maintenance_work_done + "\n";
    }
}
