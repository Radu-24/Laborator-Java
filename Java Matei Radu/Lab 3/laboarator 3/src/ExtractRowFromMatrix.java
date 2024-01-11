public class ExtractRowFromMatrix {
    public static void main(String[] args){
        int[][]matrix = {
                {1, 1, 2},
                {5, 0, 0},
                {2, 3, 3}
        };
        int[]row0fSums = extractRow(matrix);

        System.out.println("{");
        for(int i = 0; i< row0fSums.length; i++) {
            System.out.println(row0fSums[i]);
            if (i < row0fSums.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] extractRow(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row0fSums = new int[cols];

        for (int j = 0; j< cols; j++) {
            int columnSum = 0;
            for (int i = 0; i<rows; i++){
                columnSum +=matrix[i][j];

            }

            row0fSums[j] = columnSum;
        }
        return row0fSums;
    }
}
