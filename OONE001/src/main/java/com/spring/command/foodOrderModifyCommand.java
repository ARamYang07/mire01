package com.spring.command;

public class foodOrderModifyCommand extends foodOrderRegistCommand{
	
	private String oldPicture;
	
	
	public String getOldPicture() {
		return oldPicture;
	}
	public void setOldPicture(String oldPicture) {
		this.oldPicture = oldPicture;
	}
	
}
