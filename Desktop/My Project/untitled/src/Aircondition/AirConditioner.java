package Aircondition;

public class AirConditioner {
        private boolean isOnAirConditioner = false;
        private int temperature = 24;
        private int Max_temperature = 30;
        private int Min_temperature = 16;

        public void setAirConditionerOn() {
            this.isOnAirConditioner = true;
        }

        public void setAirConditionerOff() {
            this.isOnAirConditioner = false;
        }

        public boolean isOnAirConditioner() {
            return this.isOnAirConditioner;
        }

        public void setAirConditionerTemperature() {
            if (this.isOnAirConditioner && this.temperature < this.Max_temperature) {
                ++this.temperature;
            }

        }

        public void setAirConditionerCanDecreaseTemperature() {
            if (this.isOnAirConditioner && this.temperature > this.Min_temperature) {
                --this.temperature;
            }

        }

        public int getTemperature() {
            return this.temperature;
        }
    }


