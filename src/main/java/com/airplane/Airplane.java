/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airplane;

public class Airplane{
    //attributes
    boolean motorState;
    boolean landingMode;
    boolean explodedState;
    int altitude ;
    
   public Airplane(){
       motorState =false;
       landingMode = false;
       explodedState = false;
       altitude=0;
       
   }

    public void setMotorState(boolean motorState) {
        this.motorState = motorState;
    }

    public void setLandingMode(boolean landingMode) {
        this.landingMode = landingMode;
    }

    public void setExplodedState(boolean explodedState) {
        this.explodedState = explodedState;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isMotorState() {
        return motorState;
    }

    public boolean isLandingMode() {
        return landingMode;
    }

    public boolean isExplodedState() {
        return explodedState;
    }

    public int getAltitude() {
        return altitude;
    }

   public void startPlane(){
       
   }
    public void stopPlane(){
       
   }
    public void planeTakeoff(){
        
    }
    public void incAltitude(int alt){
        
    }
    public void decAltitude(int alt){
        
    }

    @Override
    public String toString() {
        return "Airplane{altitude = " + altitude+" motor "+isMotorState()+"}";
    }
   
}