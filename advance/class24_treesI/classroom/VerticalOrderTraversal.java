package advance.class24_treesI.classroom;



import java.util.*;


class Pair<U, V> {
    public final U first;       // first field of a pair
    public final V second;      // second field of a pair


    private Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }


    public static <U, V> Pair<U, V> of(U a, V b) {
        return new Pair<>(a, b);
    }
}

public class VerticalOrderTraversal {


    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {

        if (A == null) {
            return null;
        }
        Deque<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> verticalMap = new HashMap<>();
        queue.addFirst(Pair.of(A, 0));


        while (!queue.isEmpty()) {

            Pair<TreeNode, Integer> headerPair = queue.poll();
            TreeNode header = headerPair.first;
            Integer level = headerPair.second;
            verticalMap.putIfAbsent(level, new ArrayList<>());
            verticalMap.get(level).add(header.val);

            if (header.left != null) {
                queue.addLast(Pair.of(header.left, level-1));
            }
            if (header.right != null) {
                queue.addLast(Pair.of(header.right, level+1));
            }
        }

        int min = Collections.min(verticalMap.keySet());
        int max = Collections.max(verticalMap.keySet());

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            res.add(verticalMap.get(i));

        }
        return res;
    }

    public static void main(String[] args) {


        TreeNode six = new TreeNode(6);
        TreeNode three = new TreeNode(3);
        TreeNode seven = new TreeNode(7);
        TreeNode two = new TreeNode(2);
        TreeNode five = new TreeNode(5);
        TreeNode nine = new TreeNode(9);

        six.left = three;
        six.right = seven;
        three.left = two;
        three.right = five;
        seven.right = nine;


        final ArrayList<ArrayList<Integer>> res = new VerticalOrderTraversal().verticalOrderTraversal(six);
        System.out.println(res);


    }
}
