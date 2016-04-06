package com.allyourcode.p01_06_01;

/**
 * Created by SKYNET on 11/29/2015.
 */

public class Test {
    private static Test mInstance = null;

    private String mString;
    private String PerfectPair;
    private String PerfectPair2;
    private String GoodPair1;

    private Test(){
        PerfectPair = "Test Test Test";
        PerfectPair2 = "Test2 Test2 Test2";
        GoodPair1 = "Test3 Test3 Test3";
    }

    public static Test getInstance(){
        if(mInstance == null)
        {
            mInstance = new Test();
        }
        return mInstance;
    }

    public String getPerfectPair(){
        return this.PerfectPair;
    }

    public String getPerfectPair2(){
        return this.PerfectPair2;
    }

    public String getGoodPair1(){
        return this.GoodPair1;
    }

    public void setString(String value){
        mString = value;
    }

    public void setPerfectPair(String value){
        PerfectPair = value;
    }

    public void setPerfectPair2(String value){
        PerfectPair2 = value;
    }

    public void setGoodPair1(String value){
        GoodPair1 = value;
    }
}