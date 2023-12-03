public enum State {
    COMPLETELY_AWAKE("совершенно проснувшийся"), NOT_AWAKE("не проснувшийся"), PARTIALLY_AWAKE("частично проснувшийся");

    private String stateName;

    State(String s) {
        this.stateName = s;
    }

    @Override
    public String toString() {
        return this.stateName;
    }
}
