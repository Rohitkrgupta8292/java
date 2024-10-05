package method;

public class Methodrecursion {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

    static int sum(int start, int end){
        if (end > start) {
            return start + sum(start + 1, end);
        } else {
            return start;
        }
    }
}
