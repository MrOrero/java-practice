//package collections;
//
//import java.util.Comparator;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Collections;
//
//import time.Time2;
//
//public class TimeComparatorSort implements Comparator {
//	@Override
//	public int compare(Time2 time1, Time2 time2) {
//		int hourDifference = time1.getHour() - time2.getHour();
//		
//		if (hourDifference != 0) { // test the hour first
//			return hourDifference;
//		}
//		
//		int minuteDifference = time1.getMinute() - time2.getMinute();
//		
//		if (minuteDifference != 0) { // then test the minute
//			return minuteDifference;
//		}
//		
//		int secondDifference = time1.getSecond() - time2.getSecond();
//			return secondDifference;
//	}
//
//@Override
//public int compare(Time2 o1, Object o2) {
//	// TODO Auto-generated method stub
//	return 0;
//}
//}
//
