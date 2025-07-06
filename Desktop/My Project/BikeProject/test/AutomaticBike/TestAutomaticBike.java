package AutomaticBike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import AutomaticBike.AutomaticBike;

    public class TestAutomaticBike {
        private AutomaticBike jbike;

        @BeforeEach
        public void setup() {
            this.jbike = new AutomaticBike();
        }

        @Test
        public void testTheBikeCanBeTurnedOn() {
            this.jbike.isBikeOn();
            Assertions.assertTrue(this.jbike.bikeOn());
        }

        @Test
        public void testTheBikeCanBeTurnedOff() {
            this.jbike.isBikeOn();
            this.jbike.isBikeOff();
            Assertions.assertFalse(this.jbike.bikeOn());
        }

        @Test
        public void testAccelerateOnGearOne() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(15);
            this.jbike.accelerate();
            Assertions.assertEquals(16, this.jbike.getSpeed());
            Assertions.assertEquals(1, this.jbike.getGear());
        }

        @Test
        public void testAccelerateOnGearTwo() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(24);
            this.jbike.accelerate();
            Assertions.assertEquals(26, this.jbike.getSpeed());
            Assertions.assertEquals(2, this.jbike.getGear());
        }

        @Test
        public void testAccelerateOnGearThree() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(35);
            this.jbike.accelerate();
            Assertions.assertEquals(38, this.jbike.getSpeed());
            Assertions.assertEquals(3, this.jbike.getGear());
        }

        @Test
        public void testAccelerateOnGearFour() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(44);
            this.jbike.accelerate();
            Assertions.assertEquals(48, this.jbike.getSpeed());
            Assertions.assertEquals(4, this.jbike.getGear());
        }

        @Test
        public void testDecelerateOnGearOne() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(15);
            this.jbike.decelerate();
            Assertions.assertEquals(14, this.jbike.getSpeed());
            Assertions.assertEquals(1, this.jbike.getGear());
        }

        @Test
        public void testDecelerateOnGearTwo() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(24);
            this.jbike.decelerate();
            Assertions.assertEquals(22, this.jbike.getSpeed());
            Assertions.assertEquals(2, this.jbike.getGear());
        }

        @Test
        public void testDecelerateOnGearThree() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(35);
            this.jbike.decelerate();
            Assertions.assertEquals(32, this.jbike.getSpeed());
            Assertions.assertEquals(3, this.jbike.getGear());
        }

        @Test
        public void testDecelerateOnGearFour() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(50);
            this.jbike.decelerate();
            Assertions.assertEquals(46, this.jbike.getSpeed());
            Assertions.assertEquals(4, this.jbike.getGear());
        }

        @Test
        public void testGearShiftsCorrectly() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(0);
            Assertions.assertEquals(1, this.jbike.getGear());
            this.jbike.setSpeed(21);
            Assertions.assertEquals(2, this.jbike.getGear());
            this.jbike.setSpeed(31);
            Assertions.assertEquals(3, this.jbike.getGear());
            this.jbike.setSpeed(45);
            Assertions.assertEquals(4, this.jbike.getGear());
            this.jbike.setSpeed(30);
            Assertions.assertEquals(2, this.jbike.getGear());
            this.jbike.setSpeed(10);
            Assertions.assertEquals(1, this.jbike.getGear());
        }

        @Test
        public void testSpeedDoesNotGoBelowZero() {
            this.jbike.isBikeOn();
            this.jbike.setSpeed(1);
            this.jbike.decelerate();
            Assertions.assertEquals(0, this.jbike.getSpeed());
        }
    }


