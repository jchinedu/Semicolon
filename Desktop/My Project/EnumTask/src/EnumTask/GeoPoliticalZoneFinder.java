package EnumTask;

public class GeoPoliticalZoneFinder {

    public String findZoneForState(String state) {
        if (state == null || state.trim().isEmpty()) return null;

        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            if (zone.containsState(state)) {
                return zone.getZoneName();
            }
        }

        return null;
    }
}
