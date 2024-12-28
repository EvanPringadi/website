package College.Algoritma.Sorting;

public class BubbleSort {
  public static void main(String[] args) {
    int[] data = {2, 3, 7, 6, 1, 7};

    //ascending dari depan
    for (int i = 5; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if(data[j] > data[j+1]) {
          int temp = data[j];
          data[j] = data[j+1];
          data[j+1] = temp;
        }
      }
    }
    System.out.print(data[0]);
    for (int i = 1; i < 6; i++) {
      System.out.print(", " + data[i]);
    }
    System.out.println();


    //ascending dari belakang
    for (int i = 1; i < 6; i++) {
      for (int j = 6-1; j >= i; j--) {
        if(data[j] > data[j-1]) {
          int temp = data[j];
          data[j] = data[j-1];
          data[j-1] = temp;
        }
      }
    }
    System.out.print(data[0]);
    for (int i = 1; i < 6; i++) {
      System.out.print(", " + data[i]);
    }  
    System.out.println();


    //descending dari belakang
    for (int i = 1; i < 6; i++) {
      for (int j = 6-1; j >= i; j--) {
        if(data[j] < data[j-1]) {
          int temp = data[j];
          data[j] = data[j-1];
          data[j-1] = temp;
        }
      }
    }
    System.out.print(data[0]);
    for (int i = 1; i < 6; i++) {
      System.out.print(", " + data[i]);
    }
    System.out.println();


    //descending dari depan
    for (int i = 5; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if(data[j] < data[j+1]) {
          int temp = data[j];
          data[j] = data[j+1];
          data[j+1] = temp;
        }
      }
    }
    System.out.print(data[0]);
    for (int i = 1; i < 6; i++) {
      System.out.print(", " + data[i]);
    }
    System.out.println();

  }
}
