import java.util.ArrayList;

public class FindElements {

    static ArrayList<Integer> findElements(int[] arr, int target,int index){
        ArrayList<Integer> al = new ArrayList<>();
        if (index == arr.length)
        return al;

        else if (target == arr[index])
        al.add(index);
        ArrayList<Integer> futureList = findElements(arr,target,index + 1);
        al.addAll(futureList);
        return al;


    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,8,5,6,7,8,8,12};
        System.out.println(findElements(arr,8,0));
    }
}
