package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rakesh on 7/8/17.
 */

public class commondirphotochoreo extends CommontoAll {

    boolean isintersested,iscomposed,istrained,isperformed;
    int maxgroup;
    String trained_desc[],performance_desc[];

    public boolean isintersested() {
        return isintersested;
    }

    public void setIsintersested(boolean isintersested) {
        this.isintersested = isintersested;
    }

    public boolean iscomposed() {
        return iscomposed;
    }

    public void setIscomposed(boolean iscomposed) {
        this.iscomposed = iscomposed;
    }

    public boolean istrained() {
        return istrained;
    }

    public void setIstrained(boolean istrained) {
        this.istrained = istrained;
    }

    public boolean isperformed() {
        return isperformed;
    }

    public void setIsperformed(boolean isperformed) {
        this.isperformed = isperformed;
    }

    public int getMaxgroup() {
        return maxgroup;
    }

    public void setMaxgroup(int maxgroup) {
        this.maxgroup = maxgroup;
    }

    public String[] getTrained_desc() {
        return trained_desc;
    }

    public void setTrained_desc(String[] trained_desc) {
        this.trained_desc = trained_desc;
    }

    public String[] getPerformance_desc() {
        return performance_desc;
    }

    public void setPerformance_desc(String[] performance_desc) {
        this.performance_desc = performance_desc;
    }

    commondirphotochoreo()
    {
        iscomposed = false;
        isintersested = false;
        istrained = false;
        isperformed = false;
        maxgroup = 0;
        trained_desc = null;
        performance_desc = null;
    }
}
