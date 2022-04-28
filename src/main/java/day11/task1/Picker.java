package day11.task1;

public class Picker implements Worker {

    private int salary; //заработная плата
    private boolean isPayed; //был выплачен бонус или нет
    private Warehouse warehouse;

    public Picker(Warehouse warehouse){
    this.warehouse = warehouse;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork(){
        salary += 80; //выплата ЗП
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {

       if(warehouse.getCountPickedOrders()<10000){
           System.out.println("Бонус пока не доступен");
       }
       else if(!isPayed && warehouse.getCountPickedOrders()>=10000){
           salary += 70000;
           isPayed = true;
       }else if(isPayed){
           System.out.println("Бонус уже был выплачен");
       }

    }
}
