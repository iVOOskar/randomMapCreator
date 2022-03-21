package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        File RandomGameMap = new File("RandomGameMap.txt");


            Random random = new Random();
            int mapX = random.nextInt(30)+20;
            int mapY = random.nextInt(30)+20;

            try{
                FileWriter myWriter = new FileWriter(RandomGameMap.getName(),true);
                for (int i = 0; i < mapY; i++) {
                    myWriter.write("5 ");
                    for (int j = 0; j < mapX; j++) {
                        int platformChance = random.nextInt(15);
                        if (platformChance == 1 && j < mapX-3){
                            myWriter.write("1 0 2 ");
                           j++;
                           j++;

                        }else{
                            myWriter.write("4 ");
                        }
                    }
                    myWriter.write("5 \n");

                }
                myWriter.close();
            }catch(Exception e){
                System.out.println("error:"+e);
            }


    }
}
