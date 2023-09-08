package task0203;

import java.util.Comparator;

public class PerimetrComparator implements Comparator<Figura> {

    @Override
    public int compare(Figura o1, Figura o2) {
        return Double.compare(o1.getPerimetr(), o2.getPerimetr());
    }
    
}
