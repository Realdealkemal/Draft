/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.draftsimulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kemal
 */
public class PutSimulationValues {

    private static final HashMap<Integer, List<String>> simulationValues = new HashMap<>();

    public PutSimulationValues() {
        simulationValuesDoldur8();
        simulationValuesDoldur7();
        simulationValuesDoldur6();
        simulationValuesDoldur5();
        simulationValuesDoldur4();
        simulationValuesDoldur3();
        simulationValuesDoldur2();
        simulationValuesDoldur1();

    }

    private void simulationValuesDoldur8() {
        List<String> sira8 = new ArrayList<>();
        for (int i = 0; i < 929; i++) {
            sira8.add("9");
        }
        for (int i = 0; i < 64; i++) {
            sira8.add("10");
        }
        for (int i = 0; i < 7; i++) {
            sira8.add("11");
        }
        for (int i = 0; i < 1; i++) {
            sira8.add("12");
        }
        Collections.shuffle(sira8);
        simulationValues.put(8, sira8);
    }

    private void simulationValuesDoldur7() {
        List<String> sira7 = new ArrayList<>();
        for (int i = 0; i < 763; i++) {
            sira7.add("10");
        }
        for (int i = 0; i < 196; i++) {
            sira7.add("11");
        }
        for (int i = 0; i < 37; i++) {
            sira7.add("12");
        }
        for (int i = 0; i < 5; i++) {
            sira7.add("13");
        }
        Collections.shuffle(sira7);
        simulationValues.put(7, sira7);
    }

    private void simulationValuesDoldur6() {
        List<String> sira6 = new ArrayList<>();
        for (int i = 0; i < 562; i++) {
            sira6.add("11");
        }
        for (int i = 0; i < 305; i++) {
            sira6.add("12");
        }
        for (int i = 0; i < 104; i++) {
            sira6.add("13");
        }
        for (int i = 0; i < 30; i++) {
            sira6.add("14");
        }
        Collections.shuffle(sira6);
        simulationValues.put(6, sira6);
    }

    private void simulationValuesDoldur5() {
        List<String> sira5 = new ArrayList<>();
        for (int i = 0; i < 333; i++) {
            sira5.add("12");
        }
        for (int i = 0; i < 309; i++) {
            sira5.add("13");
        }
        for (int i = 0; i < 237; i++) {
            sira5.add("14");
        }
        for (int i = 0; i < 121; i++) {
            sira5.add("15");
        }
        Collections.shuffle(sira5);
        simulationValues.put(5, sira5);
    }

    private void simulationValuesDoldur4() {
        List<String> sira4 = new ArrayList<>();
        for (int i = 0; i < 104; i++) {
            sira4.add("13");
        }
        for (int i = 0; i < 212; i++) {
            sira4.add("14");
        }
        for (int i = 0; i < 282; i++) {
            sira4.add("15");
        }
        for (int i = 0; i < 403; i++) {
            sira4.add("16");
        }
        Collections.shuffle(sira4);
        simulationValues.put(4, sira4);
    }

    private void simulationValuesDoldur3() {
        List<String> sira3 = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            sira3.add("9");
        }
        for (int i = 0; i < 67; i++) {
            sira3.add("10");
        }
        for (int i = 0; i < 90; i++) {
            sira3.add("11");
        }
        for (int i = 0; i < 120; i++) {
            sira3.add("12");
        }
        for (int i = 0; i < 162; i++) {
            sira3.add("13");
        }
        for (int i = 0; i < 171; i++) {
            sira3.add("14");
        }
        for (int i = 0; i < 181; i++) {
            sira3.add("15");
        }
        for (int i = 0; i < 181; i++) {
            sira3.add("16");
        }
        Collections.shuffle(sira3);
        simulationValues.put(3, sira3);
    }

    private void simulationValuesDoldur2() {
        List<String> sira2 = new ArrayList<>();
        for (int i = 0; i < 23; i++) {
            sira2.add("9");
        }
        for (int i = 0; i < 57; i++) {
            sira2.add("10");
        }
        for (int i = 0; i < 78; i++) {
            sira2.add("11");
        }
        for (int i = 0; i < 107; i++) {
            sira2.add("12");
        }
        for (int i = 0; i < 160; i++) {
            sira2.add("13");
        }
        for (int i = 0; i < 175; i++) {
            sira2.add("14");
        }
        for (int i = 0; i < 200; i++) {
            sira2.add("15");
        }
        for (int i = 0; i < 200; i++) {
            sira2.add("16");
        }
        Collections.shuffle(sira2);
        simulationValues.put(2, sira2);
    }

    private void simulationValuesDoldur1() {
        List<String> sira1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            sira1.add("9");
        }
        for (int i = 0; i < 49; i++) {
            sira1.add("10");
        }
        for (int i = 0; i < 69; i++) {
            sira1.add("11");
        }
        for (int i = 0; i < 98; i++) {
            sira1.add("12");
        }
        for (int i = 0; i < 157; i++) {
            sira1.add("13");
        }
        for (int i = 0; i < 176; i++) {
            sira1.add("14");
        }
        for (int i = 0; i < 216; i++) {
            sira1.add("15");
        }
        for (int i = 0; i < 216; i++) {
            sira1.add("16");
        }
        Collections.shuffle(sira1);
        simulationValues.put(1, sira1);
    }
    
    public HashMap<Integer,List<String>> giveHashMap(){
        return simulationValues;
    }

}
