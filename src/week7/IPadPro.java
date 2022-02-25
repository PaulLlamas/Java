package week7;

public class IPadPro implements IPadInterface{
        private String type;
        private int memorySize; // GigaBytes
        private boolean cellular;

        public IPadPro (String type, int memory, String cell){
            this.type = type;
            this.memorySize = memory;
            if (cell.equals("Cellular"))
                cellular = true;
            else
                cellular = false;
        }

        public double computePrice(){
            if (cellular) return ((11 * memorySize) + 150);
            else return (11 * memorySize);
        }

        public String toString() {
            return type + " has " + memorySize + "GB memory, cellular is " + cellular +   " and costs $" + computePrice();
        }

    }

