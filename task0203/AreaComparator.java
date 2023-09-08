package task0203;

import java.util.Comparator;

public class AreaComparator 
    implements Comparator<Figura>{

    @Override
    public int compare(Figura o1, Figura o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }

}
