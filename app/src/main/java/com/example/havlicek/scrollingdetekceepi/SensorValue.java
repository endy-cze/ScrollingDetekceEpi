package com.example.havlicek.scrollingdetekceepi;

import java.text.DecimalFormat;

/**
 * Created by Ondra on 1. 5. 2015.
 * SensorValue, reprezentuje hodnotu naměřenou ze senzoru.
 */
public class SensorValue {
    private long timeStamp;
    private float fX;
    private float fY;
    private float fZ;
    private String x;
    private String y;
    private String z;


    public SensorValue(long timeStamp, float fX, float fY, float fZ, DecimalFormat decimalFormat) {
        this.timeStamp = timeStamp;
        this.fX = fX;
        this.fY = fY;
        this.fZ = fZ;
        x = decimalFormat.format(fX);
        y = decimalFormat.format(fY);
        z = decimalFormat.format(fZ);
    }

    public SensorValue(long timeStamp, float fX, float fY, float fZ) {
        this.timeStamp = timeStamp;
        this.fX = fX;
        this.fY = fY;
        this.fZ = fZ;
        x = null;
        y = null;
        z = null;
    }
    public long getTimeStamp() {
        return timeStamp;
    }
    public String getX(){
        return x;
    }
    public String getY(){
        return y;
    }
    public String getZ(){
        return z;
    }

    public float getfX() {
        return fX;
    }
    public float getfY() {
        return fY;
    }
    public float getfZ() {
        return fZ;
    }

    @Override
    public String toString() {
        return "Hodnota: "+x+" "+ y+" "+z+" "+Long.toString(timeStamp);
    }
}

