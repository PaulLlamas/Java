package week7;

public class Product {
        private IPadInterface type;


        public Product(IPadInterface type) {
            this.type = type;
        }
        public double computePrice() {
            return type.computePrice();
        }

        public String toString() {
            return "The " + type;
        }
}
