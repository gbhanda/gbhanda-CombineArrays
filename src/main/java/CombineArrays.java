
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int secondArrayIndex = arr1.length;
        int sizeOfArray = arr2.length + secondArrayIndex;
        int[] combinedArr = new int[sizeOfArray];     
        for(int i = 0; i < arr1.length; i++){
            combinedArr[i] = arr1[i];
        }
        for(int i = secondArrayIndex; i < sizeOfArray; i++){
            combinedArr[i] = arr2[i - secondArrayIndex];
        }
        return combinedArr;
    }
}
