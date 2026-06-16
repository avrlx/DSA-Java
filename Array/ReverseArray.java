public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 8, 7, 3, 9, 7, 3, 6, 8, 3, 10, 23, 11, 14 };

        for(int ele : a)
            System.out.print(ele + " ");
        System.out.println();
        int n ;
        int j = a.length -1; 
        int i = 0;
        System.out.println("Reverse array : ");
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        // int temp = a[i];
        // a[i] = a[j];
        // a[j] = temp;

        for(int ele : a)
            System.out.print(ele + " ");
    }
    
}
