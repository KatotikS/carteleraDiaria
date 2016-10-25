package com.kaotiks.cartelera.sendObject;

import java.io.Serializable;

/**
 * Created by Klincaja on 22/10/16.
 */
public class MateriaCarrera implements Serializable {
    private static final long serialVersionUID = -6374678792440967465L;


    private String nameID;
    private String name;

    public MateriaCarrera(String name,String nameID){
        this.name = name;
        this.nameID = nameID;
    }
    public String toString(){
        return name;
    }
}
