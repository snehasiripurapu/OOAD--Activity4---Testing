package com.main;

public class Average {
public Float average(int k, int[] list){

        float average=0;
        if (k<=0){
                return null;
        }
        if (list == null||list.length==0){
                return null;
        }
        int n=Math.min(k,list.length);
        if(n>0){
        for(int i=0;i<n; i++){
        average+=list[i];
        }
        average=average/n;
        }
        return average;
        }}