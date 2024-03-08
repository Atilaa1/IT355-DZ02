package org.example.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.entities.Kvadrat;
import org.springframework.stereotype.Service;

@Service
public class KvadratServis {
public static final Log LOG = LogFactory.getLog(KvadratServis.class);
public void ispis(Kvadrat kvadrat){
    LOG.info("Kvadrat stranice "+kvadrat.getStranica()+" ima sledeci obim i povrsinu: \n"+"Obim kvadrata je: "+kvadrat.getObim()+"\nPovrsina kvadrata je: " +kvadrat.getPovrsina());
}
}
