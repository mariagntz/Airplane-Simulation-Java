package com.company;

abstract public class Employee {
    static int temp=0;
    int id;
    String name;
    public Employee(String employee_name){
        temp++;
        name=employee_name;
        id=temp;
    }
   public abstract void WorkOn(PassengerCompartment passenger_compartment);
   public abstract void WorkOn(CargoBay cargo_bay);
   public abstract void WorkOn(EquipmentCompartment equipment_compartment);
   public abstract void Report(PlaneComponent plane_component);
   public String GetName() {
        return name;
    }

    public int GetId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee e=(Employee)o;
        if (id==e.id)
            return name.equals(e.name);
        else
            return false;
   }
}

