/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.draftsimulation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.*;

/**
 *
 * @author kemal
 */
public class DraftSimulation {

    private static final Map<Integer, String> teamNames = new HashMap<>();
    private static final Map<Integer, String> teamLotteryStatus = new HashMap<>();
    private static List<String> resultList = new ArrayList<>();
    private static List<Integer> randomList = new ArrayList<>();
  
    static Scanner scanner = new Scanner(System.in);

    private static Random rand = new Random();

    public static void main(String[] args) {
      
        
            

                takımAdiveStatusDoldur();
                kombinasyonDoldur();
                ilk3SiraDraft();
                fillOtherOrders();
                returnResults();
            
        

        // Frame'in boyutunun ayarlanması
        // Frame'in görünür yapılması
    }

    private static void kombinasyonDoldur() {
        for (int i = 1; i < 221; i++) {
            randomList.add(16);
        }
        for (int i = 221; i < 441; i++) {
            randomList.add(15);
        }
        for (int i = 441; i < 621; i++) {
            randomList.add(14);
        }
        for (int i = 621; i < 781; i++) {
            randomList.add(13);
        }
        for (int i = 781; i < 881; i++) {
            randomList.add(12);
        }
        for (int i = 881; i < 951; i++) {
            randomList.add(11);
        }
        for (int i = 951; i < 1001; i++) {
            randomList.add(10);
        }
        for (int i = 1001; i < 1021; i++) {
            randomList.add(9);
        }
        Collections.shuffle(randomList);

    }

    private static void ilk3SiraDraft() {
        for (int i = 1; i < 4; i++) {

            // System.out.println(i + "." + " pick goes to...");
            int randomNum = rand.nextInt(1020);

            for (int j = 9; j < 17; j++) {
                if (randomList.get(randomNum) == j && teamLotteryStatus.get(j).equalsIgnoreCase("active")) {
                    //   System.out.println(teamNames.get(j));
                    teamLotteryStatus.put(j, "deactive");
                    resultList.add(teamNames.get(j));

                    break;
                } else if (randomList.get(randomNum) == j) {
                    randomNum = rand.nextInt(1020);
                    j = 8;
                }
            }

        }

    }

    private static void takımAdiveStatusDoldur() {
        teamNames.put(9, "Fener");
        teamNames.put(10, "Gs");
        teamNames.put(11, "Bjk");
        teamNames.put(12, "Ts");
        teamNames.put(13, "Başak");
        teamNames.put(14, "Adana");
        teamNames.put(15, "Konya");
        teamNames.put(16, "Karagümrük");
        for (int i = 9; i < 17; i++) {
            teamLotteryStatus.put(i, "active");
        }

    }

    private static void fillOtherOrders() {
        for (int i = 16; i > 8; i--) {
            if (teamLotteryStatus.get(i).equals("active")) {
                resultList.add(teamNames.get(i));
                teamLotteryStatus.put(i, "deactive");
            }
        }
    }

    private static void returnResults() {
   ;
        for (int i = resultList.size(); i > 0; i--) {
            
            try {
                if (i != 1) {
                    
                    Thread.sleep(3000);
                    System.out.println(i + ". PICK GOES TO ...");

                    Thread.sleep(5000);

                    System.out.println(resultList.get(i - 1));

                } else {
                    Thread.sleep(100);
                    System.out.println(i + ". PICK GOES TO ...");

                    Thread.sleep(100);

                    System.out.println(resultList.get(i - 1));

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(DraftSimulation.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
