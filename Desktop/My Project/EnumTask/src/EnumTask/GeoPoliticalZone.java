package EnumTask;

public enum GeoPoliticalZone {
    NORTH_CENTRAL("North Central", new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST("North East", new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_WEST("North West", new String[]{"Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_EAST("South East", new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH("South South", new String[]{"Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"}),
    SOUTH_WEST("South West", new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"});

    private final String zoneName;
    private final String[] states;

    GeoPoliticalZone(String zoneName, String[] states) {
        this.zoneName = zoneName;
        this.states = states;
    }

    public String getZoneName() {
        return zoneName;
    }

    public boolean containsState(String state) {
        if (state == null || state.trim().isEmpty()) return false;
        for (String s : states) {
            if (s.equalsIgnoreCase(state.trim())) {
                return true;
            }
        }
        return false;
    }
}
