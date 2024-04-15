import java.io.*;
import java.util.*;
public class Main {
    static ArrayList<Route> routes[];
    static boolean[] visited;
    static int[] min_fare;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        routes = new ArrayList[n+1];
        visited = new boolean[n+1];
        min_fare = new int[n+1];

        for(int i=1; i<=n; i++){
            routes[i] = new ArrayList<Route>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            routes[a].add(new Route(b,c));
            routes[b].add(new Route(a,c));
        }

        br.close();

        findMinFare(1);

        int result = min_fare[n];

        System.out.println(result);
    }

    static void findMinFare(int from){
        Queue<Route> pq = new PriorityQueue<>();
        Arrays.fill(min_fare, Integer.MAX_VALUE);
        min_fare[from] = 0;
        pq.offer(new Route(from,0));

        while(!pq.isEmpty()){
            Route now = pq.poll();

            if(!visited[now.to]){
                visited[now.to] = true;

                for(Route next : routes[now.to]){
                    int stack = next.fare + min_fare[now.to];
                    if(min_fare[next.to] >= stack){
                        min_fare[next.to] = stack;
                        pq.offer(new Route(next.to,stack));
                    }
                }
            }
        }
    }

    static class Route implements Comparable<Route>{
        int to;
        int fare;

        Route(int to, int fare){
            this.to = to;
            this.fare = fare;
        }

        @Override
        public int compareTo(Route o) {
            return this.fare - o.fare;
        }
    }
}