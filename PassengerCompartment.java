package com.company;

public class PassengerCompartment extends PlaneComponent {
    int security_work_done = 0;
    int cleaning_work_done = 0;
    int internal;
    PassengerCompartment internal_passenger_compartment;

    PassengerCompartment(int inter) {
        super();
        internal=inter;
        if (internal==1)
            internal_passenger_compartment=new PassengerCompartment(0);
        else
            internal_passenger_compartment=null;
    }

    public int ReadyCheck() {
        if (security_work_done==0)
            return 0;
        if (cleaning_work_done==0)
            return 0;
        if(internal_passenger_compartment.security_work_done==0)
            return 0;
        if(internal_passenger_compartment.cleaning_work_done==0)
            return 0;
        System.out.println("Equipment Compartment OK!");
        return 1;
    }


    public void Process(com.company.Employee e) {
        if (internal==1)
            e.WorkOn(internal_passenger_compartment);
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
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PassengerCompartment passcomp=(PassengerCompartment) o;
        if (this.GetId()!=passcomp.GetId())
            return false;
        if (this.security_work_done!=passcomp.security_work_done)
            return false;
        if (this.cleaning_work_done!=passcomp.cleaning_work_done)
            return false;
        if (this.internal!=passcomp.internal)
            return false;
        else if (this.internal == 1)
            return this.equals(passcomp.internal_passenger_compartment);
        else return true;
    }
    @Override
    public String toString() {
        String internal_desc;
        if (internal==0)
            internal_desc=" without internal passenger compartment\n";
        else
            internal_desc=" with internal passenger compartment: "+ this.internal_passenger_compartment.toString();
        return "Passenger Compartment with ID: " + this.GetId() +
                ", work done: " + security_work_done + ", cleaning work done: " + cleaning_work_done +
                internal_desc;
    }
}


