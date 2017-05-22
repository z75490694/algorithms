package com.example.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by WHZ on 2017/4/25.
 */
public class ALGraph {
    int vertexNum;

    class VerTextNode{
        int vertex;
        ArcNode firstarc;
    }

    class ArcNode{
        int adjvex;
        ArcNode nextarc;
    }

    VerTextNode[] adjlist;

    public ALGraph(VerTextNode[] adjlist){
        this.adjlist = adjlist;
    }

    int[] visited = new int[vertexNum];

    void DFS(int v){
        System.out.print(adjlist[v].vertex);
        visited[v]=1;
        ArcNode p = adjlist[v].firstarc;
        while (p!=null){
            int j = p.adjvex;
            if(visited[j]==0)
                DFS(j);
            p = p.nextarc;
        }
    }

    void BFS(int v){
        Queue<Integer> q = new LinkedList<>();
        System.out.print(adjlist[v].vertex);
        visited[v]=1;
        q.add(v);
        while(!q.isEmpty()){
            v = q.poll();
            ArcNode p = adjlist[v].firstarc;
            while (p!=null){
                int j = p.adjvex;
                if(visited[j]==0){
                    System.out.print(adjlist[j].vertex);
                    visited[j] = 1;
                    q.add(j);
                }
                p=p.nextarc;
            }
        }
    }
}
