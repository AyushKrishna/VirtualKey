package app;

import java.util.Comparator;

class FileNameComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		if(o1.toLowerCase().compareTo(o2.toLowerCase())!=0)
			return o1.toLowerCase().compareTo(o2.toLowerCase());
		else
			return o1.compareTo(o2);
	}
}
