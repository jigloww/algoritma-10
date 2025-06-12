package Praktikum14;

import java.util.ArrayList;
public class DemoArrayList09 {
    public static void main(String[] args) {
        ArrayList<Customer09> customers = new ArrayList<>(2);

        Customer09 customer1 = new Customer09(1, "Zakia");
        Customer09 customer2 = new Customer09(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer09(4, "Cica"));

        customers.add(2, new Customer09(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer09 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer09> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer09(201, "Della"));
        newCustomers.add(new Customer09(202, "Viktor"));
        newCustomers.add(new Customer09(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer09 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}
