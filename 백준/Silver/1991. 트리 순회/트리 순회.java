import java.io.*;
import java.util.*;
public class Main {
    static Map<String,ArrayList<String>> tree;
    static StringBuilder answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        tree = new HashMap<>(26); // A - [B,C] , B - [D], C - [E,F], F - [G]

        // tree 초기화
        StringTokenizer st;
        while(n-- > 0){
            st = new StringTokenizer(br.readLine());

            String root = st.nextToken();

            String left = st.nextToken();

            String right = st.nextToken();

            tree.put(root,new ArrayList<>(2));

            ArrayList<String> children = tree.get(root);

            if(!(".".equals(left))) {
                children.add(0,left);
            }
            else{
                children.add(0," ");
            }

            if(!(".".equals(right))) {
                tree.get(root).add(1,right);
            }else{
                children.add(1," ");
            }
        }

        // 1. 전위 순회 root -> 왼 자식 -> 오른 자식
        preSearch("A");
        answer.append("\n");
        // 2. 중위 순회 왼 자식 -> root -> 오른 자식
        middleSearch("A");
        answer.append("\n");
        // 3. 후위 순회 왼 자식 ->  오른 자식 -> root
        postSearch("A");
        br.close();

        System.out.println(answer);
    }

    static void preSearch(String v){
        if(" ".equals(v))
            return;
        answer.append(v);
        preSearch(tree.get(v).get(0));
        preSearch(tree.get(v).get(1));
    }

    static void middleSearch(String v){
        if(" ".equals(v))
            return;
        middleSearch(tree.get(v).get(0));
        answer.append(v);
        middleSearch(tree.get(v).get(1));
    }

    static void postSearch(String v){
        if(" ".equals(v))
            return;
        postSearch(tree.get(v).get(0));
        postSearch(tree.get(v).get(1));
        answer.append(v);
    }

}