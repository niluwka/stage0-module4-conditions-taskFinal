package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String season;
        switch (monthNumber){
            case (1):
            case (2):
            case (12):
                season = "winter";
                break;
            case (3):
            case (4):
            case (5):
                season = "spring";
                break;
            case (6):
            case (7):
            case (8):
                season = "summer";
                break;
            case (9):
            case (10):
            case (11):
                season = "autumn";
                break;
            case (0):
                season = "Wrong month number!";
                break;
            default:
                season = "Wrong month number!";
                break;
        }
    }
}
