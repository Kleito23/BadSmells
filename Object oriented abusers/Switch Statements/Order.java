import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
     private Customer customer;
     private List<Item> items;
     private String voucher;

     public Order(Customer customer) {
         this.items = new ArrayList<>();
         this.customer = customer;
     }

     public Order(List<Item> items, String voucher) {
         this.items = items;
         this.voucher = voucher;
     }

     public boolean add(Item item) {
         if (item.isAgeRestrictedBeverage()) {
             if (customer.getAge() < 21) {
                 System.out.println("Cannot add age restricted item to order");
                 return false;
             }
         }
         return true;
     }
     public boolean addWithCheck(Item item) {
         Objects.requireNonNull(customer);
         Country country = customer.getAddress().getCountry();

         if (item.isAgeRestrictedBeverage()) {
             int age = customer.getAge();

             if (age < 21 && country.toString().equals("US")) {
                 System.out.println("Cannot add age restricted item to order");
                 return false;
             }

             if (customer.getAge() < 18 && country.toString().equals("France") ||
                 customer.getAge() < 18 && country.toString().equals("Spain")) {
                 System.out.println("Cannot add age restricted item to order");
                 return false;
             }

             if (country.toString().equals("Canada")) {
                 String province = customer.getAddress().getProvince();

                 if (age >= 18 && "Quebec".equalsIgnoreCase(province) || "Alberta".equalsIgnoreCase(province)) {
                     return items.add(item);
                 } else if (age >= 19) {
                     return items.add(item);
                 } else {
                     System.out.println("Sorry, you're under age");
                     return false;
                 }
             }
         }

         return items.add(item);
        }
    }
     
 


