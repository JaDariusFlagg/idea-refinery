package com.idearefinery.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.util.calendar.LocalGregorianCalendar.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	
	String title;
	int id;
	String description;
	Boolean completed;
	String createDate;
	String completeDate;

}
