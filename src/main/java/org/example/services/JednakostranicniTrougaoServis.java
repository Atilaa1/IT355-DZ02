package org.example.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.example.entities.JednakostranicniTrougao;
import org.springframework.stereotype.Service;

@Service
public class JednakostranicniTrougaoServis {
    public static final Log LOG = LogFactory.getLog(JednakostranicniTrougaoServis.class);
    public void ispis(JednakostranicniTrougao jtr){
        LOG.info("Jednakostranicni trougao stranice "+jtr.getStranica()+" ima sledeci obim i povrsinu: \n"+"Obim jednakostranicnog trougla je: "+jtr.getObim()+"\nPovrsina jednakostranicnog trougla je: " +jtr.getPovrsina());
    }
}
