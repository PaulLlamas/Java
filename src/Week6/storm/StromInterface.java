package Week6.storm;

public interface StromInterface {
    public final static double PREDICTED_DAMAGE_LEVEL_0 = 1000;
    public final static double PREDICTED_DAMAGE_LEVEL_1 = 5000;
    public final static double PREDICTED_DAMAGE_LEVEL_2 = 100000;
    public final static double PREDICTED_DAMAGE_LEVEL_3 = 500000;
    public final static double PREDICTED_DAMAGE_LEVEL_4 = 1000000;
    public final static int BAD_HURRICANE_CUTOFF = 130;
    public final static int BAD_TORNADO_CUTOFF = 157;
    public final static int BAD_THUNDERSTORM_CUTOFF = 60;

    double predictDamageInDollars();
}
