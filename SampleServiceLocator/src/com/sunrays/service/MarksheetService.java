package com.Galaxy.service;
import java.util.ArrayList;

import com.Galaxy.dto.MarksheetDTO;

public interface MarksheetService {

	public MarksheetDTO add(MarksheetDTO dto);

	public MarksheetDTO update(MarksheetDTO dto);

	public MarksheetDTO delete(MarksheetDTO dto);

	public MarksheetDTO get(String rollNo);

	public ArrayList list();

}
