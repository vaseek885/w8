package com.vsaf.common;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * Created by kover on 25.05.17.
 */
public class Input implements Serializable {
    // @PostConstruct
    // private void postinit(){
    //     r[0]=true;
    // }

    private int x;
    private float y;
    private float r = 1;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
