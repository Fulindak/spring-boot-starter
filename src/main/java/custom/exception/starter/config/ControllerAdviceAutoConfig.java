package custom.exception.starter.config;

import custom.exception.starter.controller.ControllerAdvice;
import org.springframework.context.annotation.Bean;

public class ControllerAdviceAutoConfig {
    @Bean
    public ControllerAdvice controllerAdvice() {
        return new ControllerAdvice();
    }
}
