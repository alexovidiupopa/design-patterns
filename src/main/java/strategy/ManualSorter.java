package strategy;

import java.util.List;

public class ManualSorter implements Sorter{
    @Override
    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; ++i) {
            for (int j = i + 1; j < list.size(); ++j) {
                if (list.get(i) > list.get(j)) {
                    int aux = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, aux);
                }
            }
        }

        return list;
    }
}
