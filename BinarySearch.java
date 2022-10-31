public class BinarySearch {
    /**
     * This function return true if element present and false if the element not present in the array.
     * Uses Binary Search. Works only on sorted dataset.
     * Best case O(1). Worst case O(logN)
     * @param element - element needed to be searched
     * @param arr - array of sorted elements
     */
    private static boolean binarySearch(int element, int[] arr){
        int start = 0, end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > element){
                end = mid - 1;
            }else if(arr[mid]<element){
                start = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 67, 45, 97, 102, 145};
        System.out.println(binarySearch(4, arr));
        System.out.println(binarySearch(99, arr));
        System.out.println(binarySearch(-79, arr));
        System.out.println(binarySearch(102, arr));
    }
}
