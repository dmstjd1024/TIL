package programmers;

public class Programmers {

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        int answer = 0;
        answer = dfs(numbers, 0, 0, target);

        System.out.println(answer);

    }

    private static int dfs(int[] numbers, int node, int sum, int target){

        System.out.println("node : "+ node + ", sum : " + sum + ", target : " +target);

        if(node == numbers.length){ // 주어진 노드가 숫자의 길이와 같을 때
            System.out.println("node == numbers.length");
            if(sum == target){ //총 합이 target(3) 이랑 같으면
                System.out.println("sum == target");
                return 1;
            }
            else{
                System.out.println("sum != target");
                return 0;
            }
        }

        System.out.println("+ dfs  : " + dfs(numbers, node+1, sum + numbers[node], target) );
        System.out.println("- dfs  : " + dfs(numbers, node+1, sum - numbers[node], target) );

        return dfs(numbers, node+1, sum + numbers[node], target) // 재귀로
                + dfs(numbers, node+1, sum - numbers[node], target);
    }

}

