package com.company;
//package com.myRoughWork;
import java.util.HashSet;
//class Customer {

  // package com.myRoughWork;

    public class Tester{
        public static void main(String[] args) {
            int[] policemoney = {1,3,4,5,10,20};
            int lostmoney = 15; int s = 0; int e = policemoney.length-1;
            HashSet<Integer> set = new HashSet<Integer>();
            for(int i=0; i<policemoney.length;i++){
                set.add(policemoney[i]);
            }
            if(set.contains(lostmoney)){
                //algo for searcch the note itself
                while(s<=e){
                    int mid = (s+e)/2;
                    if(lostmoney>policemoney[mid]){
                        s=mid+1;
                    }else if(lostmoney<policemoney[mid]){
                        e=mid-1;
                    }else{
                        System.out.println("note is " +policemoney[mid]);
                        break;
                    }
                }
             }
            else{
                while(s<e){
                    if(policemoney[s]+policemoney[e] > lostmoney){
                        e--;
                    }else if (policemoney[s]+policemoney[e] < lostmoney){
                        s++;
                    }else{
                        System.out.println("lost notes are of " +policemoney[s]+" "+policemoney[e]);
                        break;
                    }
                }
            }
        }
    }