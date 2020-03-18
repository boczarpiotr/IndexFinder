import java.util.Arrays;

public class IndexFinder {


    public int[] twoSum(int[] tabOfInt, int target) {


        for (int i = 0; i < tabOfInt.length; i++) {

            for (int j = i + 1; j < tabOfInt.length; j++) {
                if (tabOfInt[i] + tabOfInt[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        IndexFinder indexFinder = new IndexFinder();
        int[] tabOfInt = {1, 2, 3, 5};
        int target = 8;
        System.out.println(Arrays.toString(indexFinder.twoSum(tabOfInt, target)));
    }


}
