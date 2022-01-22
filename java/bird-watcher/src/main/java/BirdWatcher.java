class BirdWatcher {
    private final int BUSY_DAY_THRESHOLD = 5;
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay.length == 0 ? 0 : this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdsCount : this.birdsPerDay) {
            if (birdsCount == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int upToDays = numberOfDays <= 7 ? numberOfDays : 7;

        for (int i = 0; i < upToDays; i++) {
            count += this.birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int birdsCount : this.birdsPerDay) {
            if (birdsCount >= BUSY_DAY_THRESHOLD) {
                busyDays++;
            }
        }

        return busyDays;
    }
}
