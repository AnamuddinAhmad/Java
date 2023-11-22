public class Rec_occurence {

    public static void main(String[] args) {
        int [] arr={1,3,5,8,6,1,5,8,5,6,78};
        int key=1;
        System.out.println(Occurence1(arr, key, 0));
        Occurence(arr,key,0);
    }
    // Apna College
    public static int Occurence1(int []arr,int key,int i){
        if (i==arr.length-1) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return Occurence1(arr, key, i+1);
    }
    // mine Concept
    public static int Occurence(int[] arr, int key,int i) {
        if (i==arr.length) {
            return 1;
        }
        if (arr[i]==key) {
            System.out.print(i+" ");
        }
        return Occurence(arr, key, i+1);
    }
}