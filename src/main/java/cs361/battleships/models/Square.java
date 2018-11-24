package cs361.battleships.models;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Square {

	private int row;
    private char column;
    private boolean captain;
	private boolean submerged;
	public List<Ship> ships;
	public Square() {}

	public Square(int row, char column) {
		this.row = row;
		this.column = column;
		this.captain = false;
		this.submerged = false;
		ships = new ArrayList<>();
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

    /**
     * Sets whether this square is a captain's quarters
     *
     * @param isCaptainQuarters Whether this square should be a captain's quarters
     */
	public void setCaptainsQuarters(boolean isCaptainQuarters) {
	    this.captain = isCaptainQuarters;
    }

	public boolean getCaptain() {
		return captain;
	}

	public void setSubmerged(boolean submerged){this.submerged = submerged;}

	public boolean getSubmerged(){return submerged;}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
}
