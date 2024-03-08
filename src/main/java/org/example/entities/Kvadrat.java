package org.example.entities;

import org.example.interfejs.Oblik;

public class Kvadrat implements Oblik {

    private double stranica,obim, povrsina;

    public Kvadrat() {
    }

    public Kvadrat(double stranica) {
        this.stranica = stranica;

    }

    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    public double getObim() {
        return obim;
    }

    public void setObim(double obim) {
        this.obim = obim;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    @Override
    public double obim() {
         obim=4 * stranica;
         return obim;
    }

    @Override
    public double povrsina() {
              povrsina=  stranica * stranica;
              return  povrsina;
    }
}
