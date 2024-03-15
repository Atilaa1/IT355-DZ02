package org.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class BeforeAspect {
    @Before("execution(* org.example.services.*.ispis*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Pre izvrsavanje metode " + joinPoint.toString());
    }


}
