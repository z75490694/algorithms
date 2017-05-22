package com.example.datastructure;

/**
 * Created by WHZ on 2017/4/25.
 */
public class Dijkstra {



    static void ShortPath(MGraph G, int v){
        int[] Disk = new int[G.vertexNum];
        String[] Path = new String[G.vertexNum];
        boolean[] S = new boolean[G.vertexNum];
        for(int i=0;i<G.vertexNum;i++){
            S[i] = false;
            Disk[i] = G.arc[v][i];
            if(Disk[i]!=200)
                Path[i] = v+"";
            else
                Path[i] = v+"";
        }
        S[v] = true;
        Disk[v] = 0;
        for(int i=0;i<G.vertexNum;i++){
            if((v=FindMin(Disk,S,G.vertexNum))==-1)
                break;
            S[v] = true;
            for(int j=0;j<G.vertexNum;j++){
                if(!S[j]&&Disk[j]>G.arc[v][j]+Disk[v]){
                    Disk[j] = G.arc[v][j]+Disk[v];
                    Path[j] = Path[v] + v;

                }
            }
        }
        Print(Disk,Path,G.vertexNum);

    }

    static private void Print(int[] disk, String[] path, int vertexNum) {

        for(int i=0;i<vertexNum;i++){
            if (disk[i]==200){
                System.out.println(path[i]+i+":no route");
            }else{
                System.out.println(path[i]+i+":"+disk[i]);
            }

            /*int pre = p[i];
            while (pre!=-1){
                System.out.print('V'+pre);
                pre = p[pre];
            }
            System.out.println("}");*/
        }
    }

    static private int FindMin(int[] Disk, boolean[] S, int vertexNum) {
        int k=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<vertexNum;i++){
            if(!S[i]&&min>Disk[i]){
                min = Disk[i];
                k=i;
            }
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        return k;
    }

    public static void main(String[] args){
        int vertexNum = 6;
        int[] vertex ={0,1,2,3,4,5};
        int[][] arc = {{0,200,10,200,30,100},
                {200,0,5,200,200,200},
                {200,200,0,50,200,200},
                {200,200,200,0,200,10},
                {200,200,200,20,0,60},
                {200,200,200,200,200,0}};
        MGraph G = new MGraph(vertexNum,vertex,arc);
        ShortPath(G,0);
    }
}
