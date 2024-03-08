package org.example.entities;

import org.example.interfejs.Oblik;

public class JednakostranicniTrougao implements Oblik {
   private double stranica,obim,povrsina;

    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    public JednakostranicniTrougao() {
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

    public JednakostranicniTrougao(double stranica) {
        this.stranica = stranica;

    }

    @Override
    public double obim() {
        obim=3*stranica;
        return obim;
    }

    @Override
    public double povrsina() {
        povrsina= (Math.sqrt(3) / 4) * Math.pow(stranica, 2);
        return povrsina;
    }
}
