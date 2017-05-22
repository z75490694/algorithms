package com.example.SG;

/**
 * Created by WHZ on 2017/4/15.
 */
public class SG {

    public static void SG(){

        double total = 0;

        double[] inst_bw_estimates_excursion={149.73079,
                137.29109,
                164.22842,
                104.64038,
                114.69782,
                133.98114,
                175.44348,
                135.14832,
                157.61216,
                91.68089,
                139.99807,
                136.79471
        };
        for(int i=0;i<12;i++){
            total+= inst_bw_estimates_excursion[i];
        }
        System.out.println(total/12);
        total = 0;
        int j = 0;
        for(int i=2;i<10;i++){
            double a1 = (-3*inst_bw_estimates_excursion[i-2]+12*inst_bw_estimates_excursion[i-1]+
                    17*inst_bw_estimates_excursion[i]+12*inst_bw_estimates_excursion[i+1]-
                    3*inst_bw_estimates_excursion[i+2])/35;
            double a2 = (inst_bw_estimates_excursion[i-2]-8*inst_bw_estimates_excursion[i-1]+
                    8*inst_bw_estimates_excursion[i+1]-inst_bw_estimates_excursion[i+2])/12;
            double a3 = (2*inst_bw_estimates_excursion[i-2]-inst_bw_estimates_excursion[i-1]-
                    2*inst_bw_estimates_excursion[i]-inst_bw_estimates_excursion[i+1]+
                    2*inst_bw_estimates_excursion[i+2])/14;
            double a4 = (-inst_bw_estimates_excursion[i-2]+2*inst_bw_estimates_excursion[i-1]-
                    2*inst_bw_estimates_excursion[i+1]+inst_bw_estimates_excursion[i+2])/12;
            if(i==2) {
                j = i - 4;
                System.out.println(a1 + a2 * j + a3 * j * j + a4 * j * j * j);
                total+=a1 + a2 * j + a3 * j * j + a4 * j * j * j;
                j = i - 3;
                System.out.println(a1 + a2 * j + a3 * j * j + a4 * j * j * j);
                total+=a1 + a2 * j + a3 * j * j + a4 * j * j * j;
                j = i - 2;
                System.out.println(a1 + a2 * j + a3 * j * j + a4 * j * j * j);
                total+=a1 + a2 * j + a3 * j * j + a4 * j * j * j;

            }
            else{
                j = 0;
                System.out.println(a1+a2*j+a3*j*j+a4*j*j*j);
                total+=a1 + a2 * j + a3 * j * j + a4 * j * j * j;
            }


        }
        System.out.println(total/10);

    }
}
