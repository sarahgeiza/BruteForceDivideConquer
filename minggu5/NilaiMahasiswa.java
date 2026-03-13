package minggu5;

public class NilaiMahasiswa {
    int uts[] = {78,85,90,76,92,88,80,82};
    int uas[] = {82,88,87,79,95,85,83,84};

    int maxUTS(int arr[], int l, int r) {
        if(l==r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        int left = maxUTS(arr, l, mid);
        int rigth = maxUTS(arr, mid+1, r);

        if (left > rigth) {
            return left;
        }else{
            return rigth;
        }
    }
    int minUTS(int arr[], int l, int r) {
        if (l==r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        int left = minUTS(arr, l, mid);
        int right = minUTS(arr, mid+1, r);

        if (left < right) {
            return left;
        } else {
            return right;
        }
    }

    double rataUAS() {
        double total = 0;

        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }

        return total / uas.length;
    }
}
