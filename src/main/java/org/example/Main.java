package org.example;

import org.example.entities.JednakostranicniTrougao;
import org.example.entities.Krug;
import org.example.entities.Kvadrat;
import org.example.services.JednakostranicniTrougaoServis;
import org.example.services.KrugServis;
import org.example.services.KvadratServis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        KrugServis krugServis = (KrugServis) context.getBean("krugServis");
        KvadratServis kvadratServis = (KvadratServis) context.getBean("kvadratServis");
        JednakostranicniTrougaoServis jednakostranicniTrougaoServis = (JednakostranicniTrougaoServis) context.getBean("jednakostranicniTrougaoServis");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Izaberite oblik: 1 - Krug, 2 - Kvadrat, 3 - Jednakostranični trougao, 4 - Izlaz");
        int izbor = scanner.nextInt();

        switch (izbor) {
            case 1:
                Krug kg= new Krug();
                System.out.println("Unesite poluprecnik: ");
                double stranica = scanner.nextDouble();
                kg.setPoluprecnik(stranica);
                kg.obim();
                kg.povrsina();
                krugServis.ispis(kg);
break;
            case 2:
                Kvadrat k=new Kvadrat();
                System.out.println("Unesite stranicu: ");
                double s = scanner.nextDouble();
                k.setStranica(s);
                k.obim();
                k.povrsina();
                kvadratServis.ispis(k);
break;
            case 3:
                JednakostranicniTrougao jtr=new JednakostranicniTrougao();
                System.out.println("Unesite stranicu: ");
                double s1 = scanner.nextDouble();
                jtr.setStranica(s1);
                jtr.obim();
                jtr.povrsina();
                jednakostranicniTrougaoServis.ispis(jtr);
                break;
            case 4:
                break;

            default:
                System.out.println("Nevažeći izbor.");
                break;
        }
    }
}
