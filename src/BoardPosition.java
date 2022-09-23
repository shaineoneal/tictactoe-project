/**
 * Keeps track of an individual cell from the <code>GameBoard</code>.
 *
 * @author Shaine O'Neal
 * @version 1.0
 */
public class BoardPosition {
    private int Row, Column;

    /**
     * Constructor for BoardPosition class
     * @param r     row position on board
     * @param c     column position on board
     *
     * @pre none
     * @post Row = r
     * @post Column = c
     */
    public BoardPosition(int r, int c) {
        Row = r;
        Column = c;
    }

    /**
     * Returns the row number of the position stored
     *
     * @return row position
     *
     * @pre none
     * @post getRow = row and row = #row
     */
    public int getRow() {
        return Row;
    }

    /**
     * Returns the column number of the position stored
     *
     * @return column position
     *
     * @pre none
     * @post getColumn = column and column = #column
     */
    public int getColumn() {
        return Column;
    }

    /**
     * Returns true if <code>BoardPosition</code> stored is equal to <code>altPos</code>
     * @param altPos    the second position to compare
     * @return true if the positions are the same
     *
     * @pre altPos must not be null
     * @post altPos = #altPos
     */
    public boolean equals(BoardPosition altPos) {
        if(altPos != null && ((BoardPosition) altPos).getRow() == this.Row &&
                ((BoardPosition) altPos).getColumn() == this.Column) {
            return true;
        }
        return false;
    }

    /**
     * Returns data formatted as a string
     * @return string with data in format "Row,Column"
     *
     * @pre row and column must not be null
     * @post row = #row && col = #col
     */
    public String toString() {
        String temp = Row + "," + Column;
        return temp;
    }
}
