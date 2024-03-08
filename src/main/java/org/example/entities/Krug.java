package org.example.entities;

import org.example.interfejs.Oblik;

public class Krug implements Oblik {
    private double poluprecnik,obim,povrsina;

    public Krug() {
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
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

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;

    }

    @Override
    public double obim() {
        obim= 2 * Math.PI * poluprecnik;
        return obim;
    }

    @Override
    public double povrsina() {
        povrsina= Math.PI * Math.pow(poluprecnik, 2);
        return  povrsina;
    }
}
