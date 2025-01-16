
//Turning matrix by 90 degree

public class RotateMatrix {

    public static void main(String[] args) {
        
        int arr [] [] = { {1,2,3} , {4,5,6} , {7,8,9}}; 

        //Transposing matrix

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;
            }
            
        }
//prinintng
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("\t" +  arr[i][j]);
            }
            System.err.println();
        }

        //Rotating the matrix

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <= arr[i].length/2; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;
            }
            System.err.println();
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("\t" +  arr[i][j]);
            }
            System.err.println();
        }

    }
}
