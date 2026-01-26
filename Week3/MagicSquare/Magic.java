public class Magic {
    public static void printArr(int[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.printf("%3d", arr[x][y]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ax, ay;
        ax = ay = 5;
        int[][] arr = new int[ax][ay];
        printArr(arr);
        int y = ay - 1;
        int x = (int) ax / 2;
        for (int a = 1; true; a++) {
            int jumps = 0;
            System.out.println("Overwriting : " + arr[y % ax][x % ay]);
            boolean end = false;
            while (true) {
                if (arr[y % ay][x % ax] != 0) {
                    jumps += 1;
                    y += 2;
                    x -= 1;
                    if (jumps > 2) {
                        System.out.println("Exiting");
                        end = true;
                        break;
                    }
                } else {
                    arr[y % ay][x % ax] = a;
                    break;
                }
            }
            if (end)
                break;
            System.out.println("y : " + y + " x : " + x);
            System.out.println("y : " + y % ay + " x : " + x % ax);
            printArr(arr);
            y++;
            x++;
        }
    }
}