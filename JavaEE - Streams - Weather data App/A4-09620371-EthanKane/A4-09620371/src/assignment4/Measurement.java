package assignment4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Measurement {
	
	//public LocalDateTime date;
	private LocalDateTime date;
	private double rain;
	private double temp;
	private double wetb;
	private double dewpt;
	private double vappr;
	private double rhum;
	private double msl;
	private double wdsp;
	private double wddir;
	private double sun;
	

	
	
	
	public LocalDateTime getDate() {
		return date;
	}

	public double getRain() {
		return rain;
	}

	public double getTemp() {
		return temp;
	}

	public double getWetb() {
		return wetb;
	}

	public double getDewpt() {
		return dewpt;
	}

	public double getVappr() {
		return vappr;
	}

	public double getRhum() {
		return rhum;
	}

	public double getMsl() {
		return msl;
	}

	public double getWdsp() {
		return wdsp;
	}

	public double getWddir() {
		return wddir;
	}

	public double getSun() {
		return sun;
	}

	@Override
	public String toString() {
		return "Measurement, date= [" + date +"]";
	}

	public Measurement(LocalDateTime date, double rain, double temp, double wetb, double dewpt, double vappr, double rhum,
			double msl, double wdsp, double wddir, double sun) {
		super();
		this.date = date;
		this.rain = rain;
		this.temp = temp;
		this.wetb = wetb;
		this.dewpt = dewpt;
		this.vappr = vappr;
		this.rhum = rhum;
		this.msl = msl;
		this.wdsp = wdsp;
		this.wddir = wddir;
		this.sun = sun;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public void setRain(double rain) {
		this.rain = rain;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public void setWetb(double wetb) {
		this.wetb = wetb;
	}

	public void setDewpt(double dewpt) {
		this.dewpt = dewpt;
	}

	public void setVappr(double vappr) {
		this.vappr = vappr;
	}

	public void setRhum(double rhum) {
		this.rhum = rhum;
	}

	public void setMsl(double msl) {
		this.msl = msl;
	}

	public void setWdsp(double wdsp) {
		this.wdsp = wdsp;
	}

	public void setWddir(double wddir) {
		this.wddir = wddir;
	}

	public void setSun(double sun) {
		this.sun = sun;
	}
		
}
