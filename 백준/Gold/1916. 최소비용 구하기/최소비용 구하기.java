import java.io.*;
import java.util.*;
/**
 * 1. 문제 파악
 * N1 ->M(버스)-> Ni(도시)
 * 버스 비용 최소화
 * 
 * 도시의 갯수 1~1000, 버스의 갯수 1~10만, 버스 정보 (출발 도시, 도착 도시, 버스 비용 - 0~10만)
 * 출발 도시, 도착 도시 지정
 * 
 * 최소비용 구하기
 * 
 * 2. 접근 방법
 * 주어진 제한 시간이 매우 짧다... bfs 가능할까??
 * 완전탐색 말고 다른 탐색법으로?? 다익스트라??
 * 
 * 시작부터 끝까지, 최단 경로를 탐색하는 알고리즘
 * 최소 비용, 최단 거리를 탐색하는 것에 최적화된 알고리즘
 * 
 * 버스의 최소 비용이 들기 위해서는 갈 수 있는 방법 중에서 최솟값을 비교해야한다.
 * 
 * 다익스트라
 * - 시작 노드에서 다른 연결된 노드로 가는 거리 또는 시간을 초기화
 * - 방문 배열 초기화(최단 거리 찾을 때마다 초기화)
 * - 
 *
 */
public class Main {
    static List<City>[] list; // 0 : 출발, 1 : 도착
    static boolean[] visited;
    static int[] short_route;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 섬 갯수
        int m = Integer.parseInt(br.readLine()); // 버스 갯수

        short_route = new int[n+1];
        visited = new boolean[n+1];
        list = new ArrayList[n+1];

        for(int i=1; i<=n; i++){
            list[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for(int i=0; i<m; i++){// 도시로 이동 시 비용 초기화
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int fare = Integer.parseInt(st.nextToken());
            list[from].add(new City(to, fare));
        }

        st = new StringTokenizer(br.readLine());
        int fromCity = Integer.parseInt(st.nextToken());
        int toCity = Integer.parseInt(st.nextToken());

        findShortest(fromCity);

        int result = short_route[toCity];

        br.close();

        System.out.println(result);
    }

    static void findShortest(int from){
        Queue<City> pq = new PriorityQueue<>();
        
        Arrays.fill(short_route,Integer.MAX_VALUE);
        short_route[from] = 0;

        pq.offer(new City(from,0));

        while(!pq.isEmpty()){
            City now = pq.poll();
            
            if(!visited[now.to]){
                visited[now.to] = true;

                for(City next : list[now.to]){
                    int stack = next.fare + short_route[now.to];
                    if(short_route[next.to] >= stack){
                        short_route[next.to] = stack;
                        pq.offer(new City(next.to,stack));
                    }
                }
            }
        }
    }

    static class City implements Comparable<City>{
        int to;
        int fare;

        City(int to, int fare){
            this.to = to;
            this.fare = fare;
        }

        @Override
        public int compareTo(City o) {
            return this.fare - o.fare;
        }
    }
}
