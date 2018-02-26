package java;


public class Main {
    public static void main(String[] args) {
        int [] array = {1, 5, 8, 6};
        for (int i =0; i<array.length; i++){
            for (int j =0; i<array.length; j++){
                if(j+1 == array.length){break;}
                int a = array[j];
                int b = array[j+1];
                if(array[j]>array[j+1]){
                    array[j] = b;
                    array[j+1] = a;
                }
            }

        }
    }
}
