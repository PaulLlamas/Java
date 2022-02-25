package week7;

public class IPadBigPro implements IPadInterface {
        private String type;
        private int memorySize; // GigaBytes
        private boolean cellular;

        public IPadBigPro (String type, int memory, String cell){
            this.type = type;
            this.memorySize = memory;
            if (cell.equals("Cellular"))
                cellular = true;
            else
                cellular = false;
        }

        public double computePrice(){
            if (cellular) return ((12 * memorySize) + 160);
            else return (12 * memorySize);
        }

        public String toString() {
            return type + " has " + memorySize + "GB memory, cellular is " + cellular +   " and costs $" + computePrice();
        }

    }

