package testCynlinder;
import Cynlinder.Cylinder;


import Cynlinder.CylinderNotLessThaNZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CylinderTest {
    Cylinder myCylinder = new Cylinder(20, 30);

    @Test
    public void testthatthemethodcalculatestheaccuratevolumeofcylinder() {
        double Volumn = myCylinder.calculateVolume(2, 3, 3.142);
        assertEquals(37.704, Volumn);

    }
    @Test
    public void testthatwecansetvolumnandgetvolumn(){
        myCylinder.setHeight(23);
        myCylinder.setRadius(30);
        assertEquals(30, myCylinder.getRadius());
        assertEquals(23, myCylinder.getHeight());
    }
    @Test
    public void testthatradiudlessthatzerothrowerror(){
        assertThrows(CylinderNotLessThaNZero.class, () -> myCylinder.setRadius(-1));
    }
    @Test
    public void testthatheightlessthatzerothrowerror(){
        assertThrows(CylinderNotLessThaNZero.class, () -> myCylinder.setHeight(-1));
    }
}
