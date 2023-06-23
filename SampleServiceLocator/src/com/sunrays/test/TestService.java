package com.Galaxy.test;

import com.Galaxy.service.MarksheetService;
import com.Galaxy.service.MarksheetServiceHibImpl;
import com.Galaxy.service.MarksheetServiceJDBCImpl;

public class TestService {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) {
		MarksheetService service = getService(2);
		service.add(null);

	}

	public static MarksheetService getService(int i) {
		if (i == 1) {
			return new MarksheetServiceJDBCImpl();
		} else {
			return new MarksheetServiceHibImpl();

		}
	}

}
