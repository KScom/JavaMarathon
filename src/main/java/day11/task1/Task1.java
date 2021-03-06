package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);

        System.out.println("Количество собранных заказов: " + warehouse.getCountPickedOrders());
        System.out.println("Количество доставленных заказов: " + warehouse.getCountDeliveredOrders());
        System.out.println("Зарплата сборщика: " + picker.getSalary());
        System.out.println("Зарплата курьера: " + courier.getSalary());

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        picker2.doWork();
        courier2.doWork();

    }

    static void businessProcess(Worker worker){

        for (int i = 0; i < 10000; i++) worker.doWork();

        worker.bonus();
    }
}