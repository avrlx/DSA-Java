public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] a  = {1,0, 3 ,5,0 ,6, 7,0, 8,7,3,0,9,7,0,3,6,8,3};
        System.out.print("Array before : ");
        print(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                a[count++] = a[i];
        }
        while (count < a.length)
            a[count++] = 0;
        System.out.print("\nArray after Moving all Zero to yhe end : ");
        print(a);
    }

    public static void print(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
