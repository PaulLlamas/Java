package multidimensionalArrays;

public class PascalTriangle {

    public static int[][] pascalTriangle(int numberOfRows){
            int[][] pascal = new int[numberOfRows + 1][];
            pascal[0] = new int[1];
            pascal[0][0] = 1;
            if(numberOfRows > 0) {
                pascal[1] = new int[2];
                pascal[1][0] = 1;
                pascal[1][1] = 1;
                if(numberOfRows > 1) {
                    for (int framework = 2; framework <= numberOfRows; framework++) {
                        pascal[framework] = new int[framework + 1];
                        pascal[framework][0] = 1;
                        pascal[framework][framework] = 1;
                        for (int middle = 1; middle < framework; middle++) {
                            pascal[framework][middle] = pascal[framework - 1][middle - 1] + pascal[framework - 1][middle];
                        }
                    }

                }
            }
            return pascal;
    }

    public static void main(String[] args) {
        PrintUtils.printIntMatrix(pascalTriangle(15));
    }
}
