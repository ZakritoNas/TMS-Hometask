package hometask.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("@annotation(hometask.utils.MyAnnotation)")
      public void myPointcut(){
      }

@Around("myPointcut()")
public void doAspect(ProceedingJoinPoint joinPoint) throws Throwable {
    long start = System.nanoTime();
    joinPoint.proceed();
    long end = System.nanoTime();
    System.out.println("Затраченное время: " + (end-start));
}
}
