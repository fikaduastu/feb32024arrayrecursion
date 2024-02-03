class CheckArraySorted{

    static boolean checkArray(int arr[],int index){
        if (index == arr.length - 1)
        return true;
        return arr[index] < arr[index + 1] && checkArray(arr, index + 1); 
    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,0};
        System.out.println(checkArray(arr, 0));
    }
}

// breaking to the smallest problem 
// thinking the base case or final end point 