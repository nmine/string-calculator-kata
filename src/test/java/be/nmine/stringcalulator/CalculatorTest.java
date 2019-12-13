package be.nmine.stringcalulator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    
    @Test
    void empty_string_should_return_zero() {
        Calculator calculator = new Calculator();

        assertThat(calculator.calculate("")).isEqualTo(0);
    }
    
    @Test
    void string_number_should_return_value() {
        Calculator calculator = new Calculator();

        assertThat(calculator.calculate("1")).isEqualTo(1);
    }
    
    @Test
    void two_value_comma_separated_should_return_sum() {
        assertThat().isEqualTo();
        
    }
}
