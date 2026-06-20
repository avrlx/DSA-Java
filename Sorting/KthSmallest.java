public class KthSmallest {
    public static void main(String[] args) {
        int[] arr  = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        for (int i = 0 ; i<k ; i++) {
			int min = Integer.MAX_VALUE;
			int mind = -1;
			for (int j = i; j<arr.length; j++) {
				if (arr[j]<min) {
					min = arr[j];
					mind = j ;
				}
			}
			arr[mind] = arr[i];
			arr[i] = min;
		}
        System.out.println(arr[k-1]);
    }
}
