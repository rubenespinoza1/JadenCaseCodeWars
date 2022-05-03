package five_kyu.dir;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        boolean thereAreOpposites = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != null) {
                if (areOposites(arr[i], arr[i + 1])) {
                    thereAreOpposites = true;
                    arr[i] = null;
                    arr[i + 1] = null;
                }
            }
        }
        if (thereAreOpposites) {

            return dirReduc(reduceArray(arr));
        }
        return reduceArray(arr);
    }

    private static String[] reduceArray(String[] arr) {
        String[] reducedArray = new String[getNonEmptySpaces(arr)];
        int j = 0;
        for (int i = 0; i < reducedArray.length; i++) {
            while (arr[j] == null || arr[j].isEmpty()) {
                j++;
            }
            reducedArray[i] = arr[j];
            j++;
        }
        return reducedArray;
    }

    private static int getNonEmptySpaces(String[] arr) {
        int nes = 0;//non empty spaces
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && !arr[i].isEmpty()) {
                nes++;
            }
        }
        return nes;
    }

    public static boolean areOposites(String dir1, String dir2) {
        if (dir1 == null || dir2 == null || dir1.isEmpty() || dir2.isEmpty()) {
            return false;
        }
        return (dir1.equals("NORTH") && dir2.equals("SOUTH")) || (dir1.equals("SOUTH") && dir2.equals("NORTH"))
                || (dir1.equals("EAST") && dir2.equals("WEST")) || (dir1.equals("WEST") && dir2.equals("EAST"));
    }
}

