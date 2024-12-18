
public class Problema {
    public class CheckoutHanlder {
        // ...
   
        public double convertToCurrency(double price, String currencyTo) {
            if (currencyTo.equalsIgnoreCase("EUR")) {
                return price * 0.9;
            } else if (currencyTo.equalsIgnoreCase("CAD")) {
                return price * 1.35;
            } else {
                throw new IllegalArgumentException("Unrecognized currency: " + currencyTo);
            }
        }
    }
   
    public class SimpleCurrencyConverter {
        private String currencyTo;
   
        public SimpleCurrencyConverter(String currencyTo) {
            this.currencyTo = currencyTo;
        }
   
        public double convert(double price) {
            if (currencyTo.equalsIgnoreCase("EUR")) {
                return price * 0.9;
            } else if (currencyTo.equalsIgnoreCase("CAD")) {
                return price * 1.35;
            } else {
                throw new IllegalArgumentException("Unrecognized currency: " + currencyTo);
            }
        }
    }

}
