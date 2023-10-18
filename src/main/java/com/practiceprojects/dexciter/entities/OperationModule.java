package com.practiceprojects.dexciter.entities;

import java.util.Scanner;

public class OperationModule {

    public OperationModule() {
        super();
    }

//    public void OperationModuleExecute(double fieldCurrent, double terminalVoltage) {
//
//        Exciter test = new Exciter();
//
//        //Scanner in = new Scanner(System.in);
//
//        //System.out.print("Enter field current value: ");
//        //double fieldI = in.nextDouble();
//        test.fieldCurrent = fieldCurrent;
//
//        //System.out.print("Enter terminal voltage value: ");
//        //double terminalV = in.nextDouble();
//        test.exciterVT = terminalVoltage;
//
//        test.exciterCheck();
//        System.out.println(test.exciterFreqValue() + " Hz");
//
//        if (!test.freqIs50Hz()) {
//            double correction = test.abnormalFreq();
//            System.out.println(correction + " Hz");
//            System.out.println(test.RPMCorrection(correction) + " A");
//
//        }
//        System.out.println("Power generated = " + test.finalPowerGenerated() + " W");
//    }

    public String executeBusinessLogic() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter field current value: ");
        double fieldCurrent = in.nextDouble();

        System.out.print("Enter terminal voltage value: ");
        double terminalVoltage = in.nextDouble();

        Exciter test = new Exciter();
        test.fieldCurrent = fieldCurrent;
        test.exciterVT = terminalVoltage;

        test.exciterCheck();
        String output = "System Stability: " + (test.fieldCurrent > test.criticalCurrent && (test.exciterVT > 210 || test.exciterVT < 240) ? "Stable" : "Critical");
        output += "\nExciter Frequency: " + test.exciterFreqValue() + " Hz";

        if (!test.freqIs50Hz()) {
            double correction = test.abnormalFreq();
            output += "\nFrequency Correction: " + correction + " Hz";
            output += "\nUpdated armature current: " + test.RPMCorrection(correction) + " A";
        }

        output += "\nPower generated: " + test.finalPowerGenerated() + " W";

        return output;
    }
}


//    public static void main(String[] args) {
//        Exciter test = new Exciter();
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter field current value: ");
//        double fieldCurrent = in.nextDouble();
//        test.fieldCurrent = fieldCurrent;
//
//        System.out.print("Enter terminal voltage value: ");
//        double terminalVoltage = in.nextDouble();
//        test.exciterVT = terminalVoltage;
//
//        test.exciterCheck();
//        System.out.println(test.exciterFreqValue() + " Hz");
//
//        if (!test.freqIs50Hz()) {
//            double correction = test.abnormalFreq();
//            System.out.println(correction + " Hz");
//            System.out.println(test.RPMCorrection(correction) + " A");
//
//        }
//        System.out.println("Power generated = " + test.finalPowerGenerated() + " W");
//    }
//
//}
