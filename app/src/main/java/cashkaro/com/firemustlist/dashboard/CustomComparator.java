package cashkaro.com.firemustlist.dashboard;

import java.util.Comparator;

import cashkaro.com.firemustlist.dashboard.model.DataSet;


/**
 * Created by yasar on 30/8/17.
 */

public class CustomComparator implements Comparator<DataSet> {
    @Override
    public int compare(DataSet o1, DataSet o2) {
        return Utils.convertStringToDate(o1.getCheckIn()).compareTo(Utils.convertStringToDate(o2.getCheckIn()));
    }
}