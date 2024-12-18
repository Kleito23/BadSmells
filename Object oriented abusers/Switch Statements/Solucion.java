public class Solucion {

    public class Order {
        // ...
   
        public boolean addWithCheck2(Item item) {
            if (item.isAgeRestrictedBeverage()) {
                if (this.customer.getAge() < getLegalAgeFor(this.customer))
            }
   
            return items.add(item);
        }
   
        private int getLegalAgeFor(Customer customer) {
            Country country = customer.getAddress().getCountry();
            if (country instanceof Canada) {
                Canada canada = (Canada) country;
                return canada.getLegalDrinkingAge(customer.getAddress().getProvince());
            }
   
            return country.getMinimumLegalDrinkingAge();
        }
   
    }
   
    public class Spain extends Country {
        @Override
        public int getMinimumLegalDrinkingAge() {
            return 18;
        }
    }
   
    public class France extends Country {
        @Override
        public int getMinimumLegalDrinkingAge() {
            return 18;
        }
    }
   
    public class US extends Country {
        @Override
        public int getMinimumLegalDrinkingAge() {
            return 21;
        }
    }
   
    public class Canada extends Country {
        @Override
        public int getMinimumLegalDrinkingAge() {
            return 18;
        }
   
        public int getLegalDrinkingAge(String province) {
            if (liberalProvince(province)) {
                return getMinimumLegalDrinkingAge();
            }
   
            return 19;
        }
   
        private static boolean liberalProvince(String province) {
            return "Quebec".equalsIgnoreCase(province) ||
                   "Alberta".equalsIgnoreCase(province);
        }
    }
}
