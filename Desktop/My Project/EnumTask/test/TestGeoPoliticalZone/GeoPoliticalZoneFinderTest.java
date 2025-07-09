package TestGeoPoliticalZone;

import EnumTask.GeoPoliticalZoneFinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeoPoliticalZoneFinderTest {

    @Test
    public void testFindZoneForValidStates() {
        GeoPoliticalZoneFinder finder = new GeoPoliticalZoneFinder();

        assertEquals("South West", finder.findZoneForState("Lagos"));
        assertEquals("South South", finder.findZoneForState("Delta"));
        assertEquals("North Central", finder.findZoneForState("Benue"));
        assertEquals("North East", finder.findZoneForState("Borno"));
        assertEquals("North West", finder.findZoneForState("Kano"));
        assertEquals("South East", finder.findZoneForState("Imo"));
    }

    @Test
    public void testFindZoneIsCaseInsensitive() {
        GeoPoliticalZoneFinder finder = new GeoPoliticalZoneFinder();

        assertEquals("South West", finder.findZoneForState("lagos"));
        assertEquals("South West", finder.findZoneForState("LaGoS"));
        assertEquals("North East", finder.findZoneForState("borno"));
    }

    @Test
    public void testFindZoneForInvalidState() {
        GeoPoliticalZoneFinder finder = new GeoPoliticalZoneFinder();

        assertNull(finder.findZoneForState("Atlantis"));
        assertNull(finder.findZoneForState(""));
        assertNull(finder.findZoneForState("   "));
        assertNull(finder.findZoneForState(null));
    }
}
