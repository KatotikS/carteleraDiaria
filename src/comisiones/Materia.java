package comisiones;

import java.util.ArrayList;

/**
 * Created by Klincaja on 21/10/16.
 */
public class Materia {

    // Clase contiene un nombre y varios horarios

    private String name;
    private String tag;
    private int codigo;
    private ArrayList<Horarios> horariosArrayList;

    public Materia(String name){
        this.setName(name);
        this.codigo = Integer.parseInt(name.substring(name.indexOf('0'),name.length()));
        this.setName(name.substring(0,name.indexOf('0')));
        horariosArrayList = new ArrayList<Horarios>();
    }


    @Override
    public String toString(){
        String horarios = "";
        for (Horarios h: getHorariosArrayList()) {
            horarios =horarios + h.toString()+"\n";
        }
        return "Materia:"+ getName() +" Codigo:"+ getCodigo() +"\n"+ horarios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Horarios> getHorariosArrayList() {
        return horariosArrayList;
    }

    public void setHorariosArrayList(ArrayList<Horarios> horariosArrayList) {
        this.horariosArrayList = horariosArrayList;
    }

    public int getCodigo() {
        return codigo;
    }
}
