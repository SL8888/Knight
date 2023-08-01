package Catalog;

import Ammunation.Ammunation;
import Ammunation.SortType;

import java.util.Comparator;

public class ComparableByParametres implements Comparator<Ammunation> {
        SortType sortType;

        public ComparableByParametres()
        {
            sortType = SortType.COST;
        }

        public ComparableByParametres(SortType _sortType)
        {
            sortType = _sortType;
        }

        public int compare(Ammunation o1, Ammunation o2) {

            if (o1.getSortableValue(sortType) > o2.getSortableValue(sortType))
                return 1;
            if (o1.getSortableValue(sortType) < o2.getSortableValue(sortType))
                return -1;

                if (o1.getSortableValue(SortType.COST) > o2.getSortableValue(SortType.COST))
                    return -1;
                if (o1.getSortableValue(SortType.COST) < o2.getSortableValue(SortType.COST))
                    return 1;

            return  0;
        }
}
