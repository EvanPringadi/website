package College.Algoritma.Sorting;

public class InsertionSort {
  public static void main(String[] args) {
    int[] data = {2, 3, 7, 6, 1, 7, 8, 3, 2, 1, 7, 5};
    int n = data.length;
    System.out.println("data length: " + n);


    //insertion ascending dari depan
    for (int i = 1; i < n; i++) {
      int key = data[i];
      int j = i-1;
      while(j >=0 && data[j] > key) {
        data[j+1] = data[j];
        j--;
      }
      data[j+1] = key;
    }

    System.out.print(data[0]);
    for (int i = 1; i < n; i++) {
      System.out.print(", " + data[i]);
    }
    System.out.println();


    //insertion ascending dari belakang
    for (int i = n-2; i >= 0; i--) {
      int key = data[i];
      int j = i+1;
      while(j <= n-1 && data[j] > key) {
        data[j-1] = data[j];
        j++;
      }
      data[j-1] = key;
    }
    System.out.print(data[0]);
    for (int i = 1; i < n; i++) {
      System.out.print(", " + data[i]);
    }
    System.out.println();
  }
}
