import java.text.NumberFormat;
public class Equations {
    
    public static double indexOfRefraction (double v, int n) {
        NumberFormat res = NumberFormat.getNumberInstance();
        final double c = 299792458;
        res.setMaximumFractionDigits(n);
        double index = c/v;
        res.format(index);
        return index;
    }
}
