public class Floyd {
    private int[][] data; // 경로 가중치를 저장하는 배열
    private int[][] p; // 최단 경로 중간 경유지를 저장하는 배열, -1이 아니면 최단 경로의 중간 경유지가 됨
    public String[] name; // 지점의 이름
    public Floyd(){
        init();
    }
    public void init(){
        //p1~p5 경로, 1000 충분히 큰 수
        data = new int[][] {{0,2,3,1000,7},
                            {5,0,1000,1000,4},
                            {2,1000,0,6,1000},
                            {1000,1000,3,0,4},
                            {6,1,6,2,0}};
        p = new int[data.length][data.length]; // 최단 경로 중간 경유지를 저장하는 배열, 정방형
        name = new String[]{"P1", "P2", "P3", "P4", "P5"};
    }
    // Floyd 알고리즘 이용하여 최단 경로의 배용과 함께 최단 경로를 구하는 함수
    public void distance(){
        for (int i=0; i< data.length; i++){
            for (int j=0; j< data.length; j++){
                p[i][j] = -1; // 최단 경로 중간 경유지를 -1로 초기화, 경유하면 0 이상의 경우 인덱스(0~4)가 대입
            }
        }
        for (int k=0; k< data.length; k++){
            for (int i=0; i< data.length; i++){
                for (int j=0; j< data.length; j++){
                    if (data[i][j]>data[i][k] + data[k][j]){
                        p[i][j] = k;
                        data[i][j] = data[i][k] + data[k][j];
                    }
                }
            }
        }
    }
    // 최단 경로 중간 경유지 출력, q 출발지, r 도착지
    public void Path(int q, int r){
        if (p[q][r] != -1){
            System.out.printf("%s->", name[p[q][r]]);
            Path(p[q][r], r);
        }
    }
    // 모든 경로를 출력해주는 함수
    public void printPath(){
        int count = data.length;
        for (int i=0; i<count; i++){
            for (int j=0; j<count; j++){
                System.out.printf("%d\t", data[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Floyd floy = new Floyd();
        floy.printPath();
        System.out.println("-----------------------");
        floy.distance();
        floy.printPath();
        int start = 0; //1
        int goal = 4; // P5
        System.out.printf("%s->", floy.name[start]);
        floy.Path(start, goal);
        System.out.printf("%s", floy.name[goal]);
        System.out.println();
    }
}
