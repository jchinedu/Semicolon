package AirCondition;

import Aircondition.AirConditioner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class AirConditionAppTest {
        AirConditioner johnny = new AirConditioner();
        @Test
        public void testThatOnAirConditioner() {
            this.johnny.setAirConditionerOn();
            Assertions.assertTrue(this.johnny.isOnAirConditioner());
        }

        @Test
        public void testThatOffAirConditioner() {
            this.johnny.setAirConditionerOn();
            this.johnny.setAirConditionerOff();
            Assertions.assertFalse(this.johnny.isOnAirConditioner());
        }

        @Test
        public void testThatICanIncreaseTemperature() {
            this.johnny.setAirConditionerOn();
            int initialtemperature = this.johnny.getTemperature();
            this.johnny.setAirConditionerTemperature();
            Assertions.assertEquals(initialtemperature + 1, this.johnny.getTemperature());
        }

        @Test
        public void testThatICanDecreaseTemperature() {
            this.johnny.setAirConditionerOn();
            int initialtemperature = this.johnny.getTemperature();
            this.johnny.setAirConditionerCanDecreaseTemperature();
            Assertions.assertEquals(initialtemperature - 1, this.johnny.getTemperature());
        }

        @Test
        public void testthaticanincreasetemperatureto30() {
            this.johnny.setAirConditionerOn();

            for(int i = 0; i < 50; ++i) {
                this.johnny.setAirConditionerTemperature();
            }
            Assertions.assertEquals(30, this.johnny.getTemperature());
        }

        @Test
        public void testthaticandecreasetemperatureto16() {
            this.johnny.setAirConditionerOn();

            for(int i = 0; i < 31; ++i) {
                this.johnny.setAirConditionerCanDecreaseTemperature();
            }

            Assertions.assertEquals(16, this.johnny.getTemperature());
        }

        @Test
        public void testAcCanNotBeNegative() {
            this.johnny.setAirConditionerOn();

            for(int i = 0; i < 50; ++i) {
                this.johnny.setAirConditionerCanDecreaseTemperature();
            }

            Assertions.assertEquals(16, this.johnny.getTemperature());
        }
    }


