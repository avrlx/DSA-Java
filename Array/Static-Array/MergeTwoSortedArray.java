public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2 ,4 ,5,6};
        int[] b = {0 ,1,3,7,8,9,10};
        System.out.print("a : ");
        for(int ele : a ) System.out.print(ele + " ");
        System.out.println();
        System.out.print("b : ");
        for(int ele : b ) System.out.print(ele + " ");
        System.out.println();
        System.out.println("After merge : ");
        int i =0,j =0,k=0;
        int[] c = new int[a.length + b.length];
        while( i <a.length && j < b.length){
            if(a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while (j <b.length) c[k++] = b[j++];
        for (int l = 0; l < c.length; l++) {
            System.out.print(c[l] + " ");
        }

    }
    
}
