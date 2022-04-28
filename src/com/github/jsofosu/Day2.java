package com.github.jsofosu;

import java.util.ArrayList;
import java.util.List;

public class Day2 {

    public ArrayList<Integer> intCode(ArrayList<Integer> listOfCodes){
        ArrayList<Integer> newCodes = new ArrayList<>();
//        int firsInteger = 0;
//        for(int i =0; i<listOfCodes.size(); i++){
            if (listOfCodes.get(0)== 1){
              listOfCodes.set(listOfCodes.get(3), listOfCodes.get(1)+ listOfCodes.get(2));
            }

//            else if(listOfCodes.get(0)== 99){
//                break;
//            }
//        }


        return  listOfCodes;
    }
}
