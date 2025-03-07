## bubble sorting

```java
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 60, 35, 2, 45, 320, 5 };

        for (int i = 0; i < arr.length; i++) { // left
            for (int j = i + 1; j < arr.length; j++) { // right
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
```
