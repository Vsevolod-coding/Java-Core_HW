package homework_4;

import homework_4.my_exceptions.AmountException;
import homework_4.my_exceptions.CustomerException;
import homework_4.my_exceptions.ProductException;

/*
1. написать классы покупатель, товар и заказ;
2. создать массив покупателей, массив товаров и массив заказов;
3. создать статический метод “совершить покупку” со строковыми параметрами, соответствующими полям объекта заказа.
   Метод должен вернуть объект заказа
4. Если в метод передан несуществующий покупатель, товар или
   отрицательное количество, метод должен выбросить соответствующее исключение;
5. Вызвать метод совершения покупки несколько раз таким образом,
   чтобы заполнить массив покупок возвращаемыми значениями.
   Обработать исключения.
6. Вывести в консоль итоговое количество совершённых покупок после выполнения приложения.
*/
public class Main {
    static Customer[] customers = {
            new Customer("Kuznetsova","Angela", "Sergeevna", Gender.FEMALE, "Angela@example.com"),
            new Customer("Shalapo","Robert", "Alexandrovich", Gender.MALE,"Robert@example.com"),
            new Customer("Smirnov","Bob", "Petrovich", Gender.MALE,"Bob@example.com"),
    };

    static Product[] products = {
            new Product("Laptop ASUS TUF Gaming", 2499.0),
            new Product("iPhone 16", 1999.0),
            new Product("SAMSUNG Monitor", 250.0),
            new Product("Apple Watch Series 10", 499.0),
            new Product("GoPro HERO12", 499.0),
            new Product("LG UltraFine 4K", 699.0)
    };

    static Order[] orders = new Order[6];
    static int orderCnt = 0;

    public static void main(String[] args) {
        try {
            orders[orderCnt++] = makePurchase("Angela", "Angela@example.com", "Apple Watch Series 10", 1);
            orders[orderCnt++] = makePurchase("Bob", "Bob@example.com", "iPhone 16", 2);
            orders[orderCnt++] = makePurchase("Bob", "Bob@example.com", "GoPro HERO12", 1);
            orders[orderCnt++] = makePurchase("Robert", "Robert@example.com", "SAMSUNG Monitor", 2);
            orders[orderCnt++] = makePurchase("Max", "MaxMax@example.com", "iPhone 16", 1); // Exception (Error! A non-existent customer (Max) was passed to the method.)
            orders[orderCnt++] = makePurchase("Bob", "Bob@example.com", "SAMSUNG Monitor", 3);
        } catch (CustomerException | ProductException | AmountException e) {
            orderCnt--;
            e.printStackTrace();
        }
        System.out.println("Total successful orders: " + orderCnt);
    }

    // Make Purchase
    public static Order makePurchase(String customerName, String email, String productName, int quantity) throws CustomerException, ProductException, AmountException {
        Customer customer = findCustomerByNameAndEmail(customerName, email);
        Product product = findProductByName(productName);

        if (customer == null) {
            throw new CustomerException(customerName);
        }
        if (product == null) {
            throw new ProductException(productName);
        }
        if (quantity <= 0 || quantity > 100) {
            throw new AmountException(quantity);
        }

        Order order = new Order(customer, product, quantity);
        return order;
    }

    // Checking in customer exists
    private static Customer findCustomerByNameAndEmail(String name, String email) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name) && customer.getEmail().equals(email)) {
                return customer;
            }
        }
        return null;
    }

    // Checking in product exists
    private static Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
