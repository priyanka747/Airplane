/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airplane;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Airplane airplane = new Airplane();
        System.out.println(airplane.toString());
        int func_selection = 0, altitude;
        while (func_selection != 8) {
            System.out.println("Choices For Airplane1 ");
            System.out.println("Enter 1 For Stat Plane::");
            System.out.println("Enter 2 For Stop Plane::");
            System.out.println("Enter 3 For Takeoff::");
            System.out.println("Enter 4 For Increase Altitude::");
            System.out.println("Enter 5 For Decrease Altitude::");
            System.out.println("Enter 6 Enter Landing Mode::");
             System.out.println("Enter 7 Enter Landing Mode::");
            System.out.println("Enter 8 For Exit::");
            // variable input for switch case 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A Number According To Your Choice:: ");
            func_selection = sc.nextInt();
            //for (func_selection fxn:)
            switch (func_selection) {
                case 1:
                    if (!airplane.isMotorState()) {
                        airplane.setMotorState(!airplane.isMotorState());
                        System.out.println("plane start with altitude 0");
                    }
                    break;
                case 2:
                    if (airplane.isMotorState()) {
                        airplane.setMotorState(!airplane.isMotorState());
                        System.out.println("plane stopped");
                    }
                    break;
                case 3:
                    if (airplane.isMotorState()) {
                        if (airplane.getAltitude() <= 0) {
                            airplane.setAltitude(1000);
                            System.out.println("airplane took off");
                            System.out.println(airplane.toString());
                        } else {
                            System.out.println("Airplane already taken off" + airplane.toString());
                        }
                    } else {
                        System.out.println("you need to start plane first");
                    }
                    break;
                case 4:
                    System.out.println(airplane.toString());
                    if (airplane.isMotorState()) {
                        if (airplane.getAltitude() > 0 && !airplane.isLandingMode()) {
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("Enter Value For Altitude:: ");
                            altitude = sc1.nextInt();
                            airplane.setAltitude(airplane.getAltitude() + altitude);
                            if (airplane.getAltitude() >= 12000) {
                                System.out.println("exploded");
                                airplane.setExplodedState(true);
                                System.exit(0);
                            } else if (airplane.getAltitude() > 10000) {
                                System.out.println("plane dangereous");
                            }
                        } else {
                            System.out.println("Airplane must taken off" + airplane.toString()+ "& not in landing mode");
                        }
                    } else {
                        System.out.println("you need to start plane first");
                    }

                    break;
                case 5:
                    if (airplane.isMotorState()) {
                        if (airplane.getAltitude() > 0) {
                            if ((airplane.getAltitude() <= 1000) && !airplane.isLandingMode()) {
                                System.out.println("Enter landing Mode first");
                            } else {
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Enter Value For Altitude:: ");
                                altitude = sc1.nextInt();
                                if(airplane.getAltitude() - altitude<=1000){
                                   if(!airplane.isLandingMode()){
                                       System.out.println("Enter landing Mode first");
                                       break;
                                   } 
                                }
                                airplane.setAltitude(airplane.getAltitude() - altitude);
                             
                                if (airplane.getAltitude() < 0) {
                                    System.out.println("plane crashed");
                                    System.exit(0);
                                } else if (airplane.getAltitude() == 0) {

                                    System.out.println("plane landed");
                                }
                            }
                        } else {
                            System.out.println("take off first");
                        }
                    } else {
                        System.out.println("you need to start plane first");
                    }
                    break;
                case 6:
                    if (!airplane.isLandingMode()) {
                        airplane.setLandingMode(!airplane.isLandingMode());
                        System.out.println("plane entered to landing mode");
                    }
                    break;
                    case 7:
                    if (airplane.isLandingMode()) {
                        airplane.setLandingMode(!airplane.isLandingMode());
                        System.out.println("plane exit to landing mode");
                    }
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Selection");
                    break;
            }
        }
    }
}
