package strategy;

import java.util.Collections;
import java.util.List;

public class AutomaticSorter implements Sorter{
    @Override
    public List<Integer> sort(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
