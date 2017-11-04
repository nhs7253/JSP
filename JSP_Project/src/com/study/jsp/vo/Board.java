package com.study.jsp.vo;

import java.io.Serializable;
import java.sql.Date;

public class Board implements Serializable{
	

	private int boardNumber;
	private String boardTitle;
	private String boardText;
	private int boardHit;
	private Date boardDate;
	
	public Board() {
	}

	public Board(int boardNumber, String boardTitle, String boardText, int boardHit, Date boardDate) {
		this.boardNumber = boardNumber;
		this.boardTitle = boardTitle;
		this.boardText = boardText;
		this.boardHit = boardHit;
		this.boardDate = boardDate;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardText() {
		return boardText;
	}

	public void setBoardText(String boardText) {
		this.boardText = boardText;
	}

	public int getBoardHit() {
		return boardHit;
	}

	public void setBoardHit(int boardHit) {
		this.boardHit = boardHit;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardDate == null) ? 0 : boardDate.hashCode());
		result = prime * result + boardHit;
		result = prime * result + boardNumber;
		result = prime * result + ((boardText == null) ? 0 : boardText.hashCode());
		result = prime * result + ((boardTitle == null) ? 0 : boardTitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (boardDate == null) {
			if (other.boardDate != null)
				return false;
		} else if (!boardDate.equals(other.boardDate))
			return false;
		if (boardHit != other.boardHit)
			return false;
		if (boardNumber != other.boardNumber)
			return false;
		if (boardText == null) {
			if (other.boardText != null)
				return false;
		} else if (!boardText.equals(other.boardText))
			return false;
		if (boardTitle == null) {
			if (other.boardTitle != null)
				return false;
		} else if (!boardTitle.equals(other.boardTitle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Board [boardNumber=" + boardNumber + ", boardTitle=" + boardTitle + ", boardText=" + boardText
				+ ", boardHit=" + boardHit + ", boardDate=" + boardDate + "]";
	}
}
