package class01_introToProblemSolving.homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementsAtleastTwoGreaterElement {


    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        if (A.size() <= 2) {
            return new ArrayList<>();
        }
        ArrayList<Integer> B = new ArrayList<>(A);
        Collections.sort(B);
        ArrayList<Integer> result = new ArrayList<>();
        for (int e : A) {
            if (e < B.get(B.size() - 1) && e < B.get(B.size() - 2)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(11, 17, 100, 5));
        ArrayList<Integer> result = solve(A);
        System.out.println(result);

        A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        result = solve(A);
        System.out.println(result);

        A = new ArrayList<>(Arrays.asList(391, 634, 740, 441, 75, 444, 65, 611, 679, 59, 878, 102, 42, 190, 801, 571, 79, 686, 523, 580, 199, 497, 879, 334, 200, 202, 991, 341, 479, 563, 112, 550, 494, 468, 56, 644, 53, 581, 836, 461, 905, 849, 838, 434, 818, 350, 585, 280, 252, 834, 510, 420, 395, 776, 118, 886, 19, 809, 534, 143, 933, 15, 999, 514, 230, 531, 666, 841, 861, 703, 972, 622, 640, 21, 811, 476, 751, 430, 308, 996, 165, 812, 424, 412, 903, 601, 226, 239, 728, 135));
        result = solve(A);
        System.out.println(result);


    }

}
