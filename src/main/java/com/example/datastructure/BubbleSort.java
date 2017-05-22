package com.example.datastructure;

/**
 * Created by WHZ on 2017/4/23.
 */
public class BubbleSort {

    static void BubbleSort(int[] r){
        int pos = r.length;
        while(pos!=0){
            int bound = pos;
            pos = 0;
            for(int i=0;i<bound-1;i++){
                if(r[i]>r[i+1]){
                    int temp = r[i];
                    r[i] = r[i+1];
                    r[i+1] = temp;
                    pos = i+1;
                }
            }
        }
    }
    static void order(double unord_arr[], double ord_arr[], int no_elems)
    {
        int i,j;
        double temp;
        for (i=0; i<no_elems; i++)
        {
            ord_arr[i]=unord_arr[i];
        }
        for (i=no_elems-1; i>0; i--)
        {
            //for (j=i-1; j>=0; j--)
            for (j=0; j<i; j++)
            {
                if (ord_arr[j+1]<ord_arr[j])
                {
                    temp=ord_arr[j];
                    ord_arr[j]=ord_arr[j+1];
                    ord_arr[j+1]=temp;
                }
                //else break;
            }
        }
    }

    static double get_max(double data[], int no_values)
    {
        long i;
        int k;
        double max;
        max = 0;
        double[] temp = new double[5];
        int j;
	/*for(j=0;j<5;j++){
		for (i=0; i<no_values; i++)
	{
		if(data[i]>max){
			max = data[i];
			k = i;
		}
	}
	temp[j] = max;
	data[k] = 0;
		max = 0;
	}*/
        double sum=0;
        for(j=0;j<5;j++){
            sum+=data[no_values-j-1];
            System.out.printf("\n temp is %f \n",data[no_values-j-1]);
        }


        return sum/5.0;
    }


    public static void main(String[] args){
        int[] data = {12,1431,12312,543,534,52,3,12343,34,234};
        BubbleSort(data);
        for(Integer i:data){
            System.out.print(i+" ");
        }
        System.out.println();
        double[] data2 = {12.0,1431,12312,543,534,52,3,12343,34,234};
        order(data2,data2,data2.length);
        for(Double i:data2){
            System.out.print(i+" ");
        }
        get_max(data2,data2.length);
    }
}
