package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAspect {
    @After("execution(* org.example.services.*.ispis*(..))")
    public void aftr(JoinPoint joinPoint){
        System.out.println("Posle izvrsavanje metode " +joinPoint.toString());
    }
}
