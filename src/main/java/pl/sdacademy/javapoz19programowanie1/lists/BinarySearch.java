package pl.sdacademy.javapoz19programowanie1.lists;

public class BinarySearch {

public static void main(String[] args) {

    BinarySearch binarySearch = new BinarySearch();

    System.out.println(binarySearch.binarySearch(6, new int[]{0, 1, 3, 5, 6, 8, 9}));
    System.out.println(binarySearch.binarySearch(7, new int[]{0, 1, 3, 5, 6, 8, 9}));
    System.out.println(binarySearch.binarySearch(8, new int[]{1, 2, 3, 6, 7, 9}));


}
    public int binarySearch(int value, int[] numbers){

        int left = 0;
        int right = numbers.length -1;

        while (left < right){
            int center = (left + right)/2;
            int centerValue = numbers[center];
            if(centerValue < value){
                left = center + 1;
            }
            else if (centerValue > value){
                right = center -1;
            }else {
                left = right = center;
            }
        }

        /*if (value ==numbers[left]){
            return left;
        }else {
            return -1;
        }*/

        return value == numbers[left] ? left : -1;
    }
}
