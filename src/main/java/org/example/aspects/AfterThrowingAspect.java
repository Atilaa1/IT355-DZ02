package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingAspect {
    @AfterThrowing("within(org.example.services.JednakostranicniTrougaoServis)")
    public void aftrTrouing(JoinPoint joinPoint){
        System.out.println("Posle izbacivanja greske " +joinPoint.toString());
    }
}
