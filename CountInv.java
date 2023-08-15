public class CountInv {
    static int CountMerge(int a[], int low, int mid, int high) {
        int res = 0;
        int n1Length = mid - low + 1;
        int n2Length = high - mid;
        int n1[] = new int[n1Length];
        int n2[] = new int[n2Length];
        for (int i = 0; i < n1Length; i++) {
            n1[i] = a[low + i];
        }
        for (int i = 0; i < n2Length; i++) {
            n2[i] = a[mid + 1 + i];
        }
        int i = 0, j = 0, k = low;
        while (i < n1Length && j < n2Length) {
            if (n1[i] <= n2[j]) {
                a[k] = n1[i];
                i++;
            } else {
                a[k] = n2[j];
                j++;
                res = res + (n1Length - i);
            }
            k++;
        }
        while (i < n1Length) {
            a[k] = n1[i];
            i++;
            k++;
        }
        while (j < n2Length) {
            a[k] = n2[j];
            j++;
            k++;
        }

        return res;
    }

    static int CountIn(int a[], int l, int r) {
        int res = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            res += CountIn(a, l, m);             
            res += CountIn(a, m + 1, r);
            res += CountMerge(a, l, m, r);
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 1, 3, 5};              //(2,1),(4,1),(4,3),
        int l = 0;
        int r = a.length - 1; 
        System.out.println(CountIn(a, l, r));
    }
}
