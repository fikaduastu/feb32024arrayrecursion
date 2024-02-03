public class LinearSearchRecursion {

    static boolean search(int arr[],int value, int index){
        if (index > arr.length - 1)
        return false;
        
        return arr[index] == value || search(arr,value, index + 1);
    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7,8,12};
        System.out.println(search(arr, 1, 0));
    }
}
