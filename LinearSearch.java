public class LinearSearch {
    /**
     * This function return true if element present and false if the element not present in the array.
     * Uses Linear Search.
     * Best case O(1). Worst case O(N)
     * @param element - element needed to be searched
     * @param arr - array of elements
     */
    private static boolean linearSearch(int element, int[] arr){
        for (int j : arr) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 67, 45, 97, 23, 55};
        System.out.println(linearSearch(4, arr));
        System.out.println(linearSearch(99, arr));
    }
}
