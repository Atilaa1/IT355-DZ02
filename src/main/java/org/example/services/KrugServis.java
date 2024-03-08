package org.example.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.entities.Krug;
import org.springframework.stereotype.Service;

@Service

public class KrugServis {
    public static final Log LOG = LogFactory.getLog(KrugServis.class);
    public void ispis(Krug krug){
        LOG.info("\nKrug poluprecnika "+krug.getPoluprecnik()+" ima sledeci obim i povrsinu: \n"+"Obim kruga je: "+krug.getObim()+"\nPovrsina kruga je: " +krug.getPovrsina());
    }
}
