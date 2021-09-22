import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> answer = solution.fizzBuzz(100);
        for (String i : answer){
            System.out.println(i);
        }
    }
}
