package College.Algoritma.Sorting;

public class SelectionSort {
  public static void main(String[] args) {
    int[] num = {3, 8, 9, 2, 1, 5, 6, 7, 0, 4};

    //ascending dari depan
    for (int i = 0; i < 9; i++) {
      int lowestIndex = i;
      for (int j = i+1; j < 10; j++) {
        if(num[j] < num[lowestIndex]) {
          lowestIndex = j;
        }
      }
      if(i != lowestIndex) {
        int temp = num[lowestIndex];
        num[lowestIndex] = num[i];
        num[i] = temp;
      }
    }
    System.out.print(num[0]);
    for (int o = 1; o < 10; o++) {
      System.out.print(", " + num[o]);
    }

    System.out.println();

    //ascending dari belakang
    for (int i = 0; i < 9; i++) {
      int highestIndex = i;
      for (int j = i+1; j < 10; j++) {
        if(num[j] > num[highestIndex]) {
          highestIndex = j;
        }
      }
      if(i != highestIndex) {
        int temp = num[highestIndex];
        num[highestIndex] = num[i];
        num[i] = temp;
      }
    }
    System.out.print(num[0]);
    for (int o = 1; o < 10; o++) {
      System.out.print(", " + num[o]);
    }
  }
}
