package com.example.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by WHZ on 2017/4/25.
 */
public class MGraph {

    int vertexNum;
    int[] vertex = new int[vertexNum];
    int[][] arc = new int[vertexNum][vertexNum];

    public MGraph(int vertexNum,int[] vertex,int[][] arc){
        this.vertexNum = vertexNum;
        this.vertex = vertex;
        this.arc = arc;
    }

    int[] visited = new int[vertexNum];

    void DFS(int v){
        System.out.print(vertex[v]);
        visited[v] = 1;
        for(int j=0;j<vertexNum;j++){
            if (arc[v][j]==1&&visited[j]==0)
                DFS(j);
        }
    }

    void BFS(int v){
        Queue<Integer> q = new LinkedList<>();
        System.out.print(vertex[v]);
        visited[v]=1;
        q.add(v);
        while(!q.isEmpty()){
            v = q.poll();
            for(int j=0;j<vertexNum;j++){
                if(arc[v][j]==1&&visited[j]==0){
                    System.out.print(vertex[j]);
                    q.add(j);
                    visited[j]=1;
                }
            }
        }
    }



    int mininum(MGraph G,int[] lowcost){
        int min = Integer.MAX_VALUE;
        int k = 0;
        for(int i=1;i<vertexNum;i++){
            if(lowcost[k]!=0&&lowcost[k]<min){
                min = lowcost[i];
                k = i;
            }
        }
        return k;
    }



    void Prim(MGraph G){
        int[] adjvex = new int[G.vertexNum];
        int[] lowcost = new int[G.vertexNum];
        int k = 0;
        for(int i=0;i<G.vertexNum;i++){
            adjvex[i] = 0;
            lowcost[i] = G.arc[0][i];
        }
        lowcost[k] = 0;
        for(int i=1;i<G.vertexNum;i++){
            k = mininum(G,lowcost);
            System.out.print(k);
            lowcost[k]=0;
            for (int j=0;j<G.vertexNum;j++){
                if(lowcost[j]!=0&&G.arc[k][j]<lowcost[j]){
                    lowcost[j] = G.arc[k][j];
                    adjvex[j] = k;
                }
            }
        }
    }




}
