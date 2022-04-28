package day11.task1;

public class Courier implements Worker{

    private int salary; //заработная плата
    private boolean isPayed;  //был выплачен бонус или нет
    private Warehouse warehouse;

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork(){
        this.salary += 100; //выплата ЗП
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {

        if(warehouse.getCountDeliveredOrders()<10000){
            System.out.println("Бонус пока не доступен");
        }
        else if(!isPayed && warehouse.getCountDeliveredOrders()>=10000){
            salary += 50000;
            isPayed = true;
        }else if(isPayed){
            System.out.println("Бонус уже был выплачен");
        }

    }
}
