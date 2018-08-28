package com.csu.entity;

public class ReportScore {
	
	private String ScaleItemName;
	private int score;
	private int factor;
	
	
	
	public int getFactor() {
		return factor;
	}
	public void setFactor(int factor) {
		this.factor = factor;
	}
	public String getScaleItemName() {
		return ScaleItemName;
	}
	public void setScaleItemName(String scaleItemName) {
		ScaleItemName = scaleItemName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
