package com.ey.training.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		
		LocalDate date1= date.minusDays(1);
		System.out.println(date1);
		
		LocalDate date2= date.plusDays(1);
		System.out.println(date2);
		
		System.out.println(date.minusMonths(2));
		System.out.println(date.minusYears(1));

		String pattern="MM-dd-yyyy";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String datee=sdf.format(new Date());
		System.out.println(datee);
		
		String pattern1="MM-dd-yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat sdf1=new SimpleDateFormat(pattern1);
		String datee1=sdf1.format(new Date());
		System.out.println(datee1);
		
		System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(new Date()));
		System.out.println(new SimpleDateFormat("dd MMMM yyyy").format(new Date()));
	
		String pattern2="EEEE MMMMM yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat sdf2=new SimpleDateFormat(pattern2,new Locale("fr","FR"));
		System.out.println(sdf2.format(new Date()));
		
		LocalDate dt=LocalDate.of(2019, 10, 19);
		LocalDateTime dateTime=dt.atTime(1, 20, 30);
		System.out.println(dateTime);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println(time.minusHours(2));
		
		ZoneId kol=ZoneId.of("Asia/Kolkata");
		ZoneId syd=ZoneId.of("Australia/Sydney");

		System.out.println(LocalTime.now(kol));
		System.out.println(LocalTime.now(syd));
		
		LocalDateTime ldt=LocalDateTime.of(2019, 10, 19, 9, 54);
		System.out.println(ldt);
		
		Date dt1=new Date();
		System.out.println(dt1);
		
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date(System.currentTimeMillis()));


	}

}
