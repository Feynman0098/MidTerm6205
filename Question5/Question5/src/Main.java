public class Main {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11};
        int[] values = {1,4,5,10};
        int[] res = getStartOfEachValues(arr, values);
        for (int i:res) {
            System.out.println(i);
        }
    }

    // arr = [0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11]
    // values = [1,4,5,10]
    // output = [5, -1, 11, 16]
    private static int[] getStartOfEachValues(int[] arr, int[] values){
        int[] indexes = new int[values.length];

        int point = 0;

        for (int i = 0; i < values.length; i++) {
            int position = -1;
            // assume arr and values are sorted
            while (point < arr.length) {
                if (values[i] == arr[point]) {
                    position = point;
                    point++;
                    break;
                }
                if (values[i] < arr[point]) {
                    break;
                }
                if (values[i] > arr[point]) {
                    point++;
                }
            }
            indexes[i] = position;
        }

        return indexes;
    }
}