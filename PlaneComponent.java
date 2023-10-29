package com.company;

abstract  public class PlaneComponent {
    int id;
    static int i=0;
    String description;
    public PlaneComponent(){
        i++;
        id=i;
    }


    abstract public int ReadyCheck();
    abstract public void Process(Employee e);
     public void SetMaintenanceWorkDone(){}
     public void SetCleaningWorkDone(){}
     public void SetSecurityWorkDone(){}
    int GetId(){
        return id;
    }
    public void SetDescription(){
        description=this.toString();
    }
    public String GetDescription(){
        return this.toString();
    }
}
