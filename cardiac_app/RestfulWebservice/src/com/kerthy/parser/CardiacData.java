package com.kerthy.parser;

public class CardiacData {
	private String time;
	private String cpr;
	private String cpr_timestamp;
	private String rhythm;
	private String monitoring_key;
	private String monitoring_value;
	private String intervention_key;
	private String intervention_value;
	private String bolus;
	private String infusion;
	public String toString(){
		String str="'"+this.getTime()+"','"+this.getCpr()+"','"+this.getCpr_timestamp()+"','"+this.getRhythm()+"','"+this.getMonitoring_key()+"','"+
				   this.getMonitoring_value()+"','"+this.getIntervention_key()+"','"+this.getIntervention_value()+"','"+this.getBolus()+"','"+
				   this.getInfusion()+"'";
		return str;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCpr() {
		return cpr;
	}
	public void setCpr(String cpr) {
		this.cpr = cpr;
	}
	public String getRhythm() {
		return rhythm;
	}
	public void setRhythm(String rhythm) {
		this.rhythm = rhythm;
	}
	public String getBolus() {
		return bolus;
	}
	public void setBolus(String bolus) {
		this.bolus = bolus;
	}
	public String getInfusion() {
		return infusion;
	}
	public void setInfusion(String infusion) {
		this.infusion = infusion;
	}
	public String getCpr_timestamp() {
		return cpr_timestamp;
	}
	public void setCpr_timestamp(String cpr_timestamp) {
		this.cpr_timestamp = cpr_timestamp;
	}
	public String getMonitoring_key() {
		return monitoring_key;
	}
	public void setMonitoring_key(String monitoring_key) {
		this.monitoring_key = monitoring_key;
	}
	public String getMonitoring_value() {
		return monitoring_value;
	}
	public void setMonitoring_value(String monitoring_value) {
		this.monitoring_value = monitoring_value;
	}
	public String getIntervention_key() {
		return intervention_key;
	}
	public void setIntervention_key(String intervention_key) {
		this.intervention_key = intervention_key;
	}
	public String getIntervention_value() {
		return intervention_value;
	}
	public void setIntervention_value(String intervention_value) {
		this.intervention_value = intervention_value;
	}
	
	
	
	
}
