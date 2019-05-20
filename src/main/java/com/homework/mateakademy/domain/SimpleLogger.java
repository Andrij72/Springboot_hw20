package com.homework.mateakademy.domain;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import javax.interceptor.AroundInvoke;
        import javax.interceptor.InvocationContext;

public class SimpleLogger
{
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @AroundInvoke
    public Object addLog(InvocationContext context){
        LOGGER.info("-----Interceptor  called");
        return context.proceed();
    }
}
