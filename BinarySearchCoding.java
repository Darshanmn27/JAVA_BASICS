public class BinarySearchCoding {

    public static int binarysearch() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = arr.length - 1; // Fix end value
        int tar = 8;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (tar == arr[mid]) {
                return mid;
            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int ceiling() {
        System.out.println("Ceiling of a number in a given array:");
        int arr[] = {10, 20, 30, 40, 50, 60};
        int start = 0;
        int end = arr.length - 1; // Fix end value
        int tar = 17;
        if (tar > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (tar == arr[mid]) {
                return arr[mid];
            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }

    public static int floor() {
        System.out.println("Floor of a number in a given array:");
        int arr[] = {10, 20, 30, 40, 50, 60};
        int start = 0;
        int end = arr.length - 1; // Fix end value
        int tar = 35;
        if (tar < arr[0]) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (tar == arr[mid]) {
                return arr[mid];
            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }

    public static int orderagnostic() {
        int arr[] = {9, 180, 270};
        int tar = 180;
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (isAsc) {
                if (tar < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (tar > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static char ceilingcharacter() {
        char ch[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int start = 0;
        int end = ch.length - 1;
        char tar = 'b';
        while (start <= end) {
            int mid = (start + end) / 2;
            if (ch[mid] == tar) {
                return ch[mid];
            } else if (tar < ch[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ch[start];
    }

    public static char smallestletter() {
        char letter[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        int start = 0;
        int end = letter.length - 1;
        char tar = 'b';
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (tar < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }

    public static void main(String[] args) {
        System.out.println(binarysearch());         // Output: 7
        System.out.println(ceiling());             // Output: 20
        System.out.println(floor());               // Output: 30
        System.out.println(orderagnostic());       // Output: 1
        System.out.println(smallestletter());      // Output: c
    }
}
