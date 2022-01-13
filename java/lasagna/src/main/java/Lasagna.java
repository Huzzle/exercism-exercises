public class Lasagna {
  private final int EXPECTED_MINUTES = 40;
  private final int MINUTES_FOR_ONE_LAYER = 2;

  public int expectedMinutesInOven() {
    return EXPECTED_MINUTES;
  }

  public int remainingMinutesInOven(int actualMinutes) {
    int remainingMinutes = this.expectedMinutesInOven() - actualMinutes;

    if (remainingMinutes < 0) {
      return 0;
    }

    return remainingMinutes;
  }

  public int preparationTimeInMinutes(int layersCount) {
    return MINUTES_FOR_ONE_LAYER * layersCount;
  }

  public int totalTimeInMinutes(int layersCount, int minutesInOven) {
    return this.preparationTimeInMinutes(layersCount) + minutesInOven;
  }
}
