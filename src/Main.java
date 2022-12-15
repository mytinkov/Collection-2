import HW.Product.Product;
import HW.Product.ProductAlreadyExistsException;
import HW.Product.ProductList;

import HW.Race.ExceptionPassword.Data;
import HW.Race.transport.*;
import HW.Race.driver.Driver;
import HW.Race.driver.DriverB;
import HW.Race.driver.DriverC;
import HW.Race.driver.DriverD;
import HW.Race.ExceptionPassword.Data;

import java.util.*;

public class Main {
    public static void main(String[] args) throws ProductAlreadyExistsException {

        Product tomato = new Product("Томат", 125.5d, 1.2d);
        Product pineapple = new Product("Ананас", 100.5d, 3.6d);
        Product apple = new Product("Яблоко", 90.5d, 2.5d);
        Product banana = new Product("Банан", 50.5d, 0.2d);

        ProductList productList = new ProductList();
        productList.addProduct(tomato);
        productList.addProduct(apple);
        productList.addProduct(pineapple);
        productList.addProduct(banana);
        System.out.println(productList);

        numbersSetRemoveEven();
//        MultiplicationTable multiplicationTable = new MultiplicationTable();
//        System.out.println(multiplicationTable);
//        Task task = new Task(3, 4);
//        Task task2 = new Task(3, 4);
//        Set<Task> set = new HashSet<>();
//        set.add(task);
//        set.add(task2);
//        System.out.println(set);

        Mechanic<Car> mrMax = new Mechanic<>("Максим","Тиньков", "Газром");

    }

    private static void numbersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(0, 1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);


    }
}