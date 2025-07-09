package AutomaticBike;
public class AutomaticBike {
        private boolean BikeOn = false;
        private int Acceleration;
        private int speed = 0;
        private int gear = 1;

        public void isBikeOn() {
            this.BikeOn = true;
        }

        public void isBikeOff() {
            this.BikeOn = false;
        }

        public boolean bikeOn() {
            return this.BikeOn;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
            this.updateGear();
        }

        public int getSpeed() {
            return this.speed;
        }

        public int getGear() {
            return this.gear;
        }

        public void updateGear() {
            if (this.speed >= 0 && this.speed <= 20) {
                this.gear = 1;
            } else if (this.speed > 20 && this.speed <= 30) {
                this.gear = 2;
            } else if (this.speed > 30 && this.speed <= 40) {
                this.gear = 3;
            } else {
                this.gear = 4;
            }

        }

        public void accelerate() {
            if (this.bikeOn()) {
                this.updateGear();
                this.speed += this.gear;
                this.updateGear();
            }
        }

        public void decelerate() {
            if (this.bikeOn()) {
                this.updateGear();
                this.speed -= this.gear;
                this.updateGear();
            }
        }
    }


