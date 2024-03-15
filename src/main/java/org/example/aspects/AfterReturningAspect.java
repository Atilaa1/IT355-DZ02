package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAspect {
    @AfterReturning("execution(* org.example.services.*.ispis*(..))")
    public void aftrRiturning(JoinPoint joinPoint){
        System.out.println("Posle vracanja " +joinPoint.toString());
    }

}
