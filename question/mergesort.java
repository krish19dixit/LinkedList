import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {

    }

    public int[] merget(int[] arr, int n) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merget(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merget(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        // adiding other element
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;

        }
        while (j < right.length) {
            ans[k] = left[j];
            j++;
            k++;

        }
    }
}
