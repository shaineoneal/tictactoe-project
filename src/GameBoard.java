public class GameBoard {
    char board[][] = new char[8][5];

    /** Constructs a 5x8 GameBoard filled with ' ' characters.
     *
     * @pre none
     * @post all spaced on GameBoard = ' '
     */
    public GameBoard() {

    }

    /** Returns true if the position specified in pos is available;
     * false otherwise. If a space is not in bounds, then it is not available.
     *
     * @param pos       space on board to be checked
     * @return true iff position != ' '
     *
     * @pre pos != null
     * @post pos = #pos AND (checkSpace = true OR checkSpace = false)
     */
    public boolean checkSpace(BoardPosition pos) {
        return true;
    }

    /** Places the character in player on the position specified by
     * marker and should not be called if space is unavailable.
     *
     * @param marker        space on board where player should be placed
     * @param player        character that represents specified player
     *
     * @pre marker != null AND player != null AND player != ' ' AND
     *      checkSpace(marker) = true
     * @post whatsAtPos != null AND whatsAtPos != ' '
     */
    public void placeMarker(BoardPosition marker, char player){

    }

    /** Checks to see if the lastPos placed resulted in a winner. If so it
     * will return true, otherwise false.
     *
     * @param lastPos       last position a marker was placed
     * @return true iff lastPos made 5 in a row
     *
     * @pre lastPos != null
     * @post lastPos = #lastPos AND (checkForWinner = true OR checkForWinner = FALSE)
     */
    public boolean checkForWinner(BoardPosition lastPos) {

    }

    /** Checks to see if the game has resulted in a tie. A game is tied if
     * there are no free board positions remaining.
     *
     * @return true iff all board positions are filled
     *
     * @pre checkForWinner runs every turn
     * @post checkForDraw = true OR checkForDraw = false
     */
    public boolean checkForDraw() {

    }

    /** Checks to see if the last marker placed resulted in 5 in a row
     * horizontally. Returns true if it does, otherwise false.
     *
     * @param lastPos       last position a marker was placed
     * @param player        character that represents specified player
     * @return
     *
     * @pre player != null AND player != ' '
     * @post lastPos = #lastPos AND player = #player AND (checkHorizontalWin = true OR
     *      checkHorizontalWin = false)
     */
    public boolean checkHorizontalWin(BoardPosition lastPos, char player) {
        return true;
    }

    /** Checks to see if the last marker placed resulted in 5 in a row
     * vertically. Returns true if it does, otherwise false.
     *
     * @param lastPos       last position a marker was placed
     * @param player        character that represents specified player
     * @return
     *
     * @pre player != null AND player != ' '
     * @post lastPos = #lastPos AND player = #player AND (checkVerticalWin = true OR
     *      checkVerticalWin = false)
     */
    public boolean checkVerticalWin(BoardPosition lastPos, char player) {
        return true;
    }

    /** Checks to see if the last marker placed resulted in 5 in a row
     * diagonally. Returns true if it does, otherwise false.
     *
     * @param lastPos       last position a marker was placed
     * @param player        character that represents specified player
     * @return
     *
     * @pre player != null AND player != ' '
     * @post lastPos = #lastPos AND player = #player AND (checkDiagonalWin = true OR
     *      checkDiagonalWin = false)
     */
    public boolean checkDiagonalWin(BoardPosition lastPos, char player) {
        return true;
    }

    /** Returns what is in the GameBoard at position pos. If no marker is
     * there, it returns a blank space char.
     *
     * @param pos       position to be evaluated
     * @return character located in pos
     *
     * @pre checkSpace(pos) = true
     * @post pos = #pos AND (whatsAtPos = player character OR whatsAtPos = ' ')
     */
    public char whatsAtPos(BoardPosition pos) {
    }

    /** Returns true if the player is at pos; otherwise, it returns false.
     *
     * @param pos
     * @param player
     * @return true iff whatsAtPos(pos) = player
     *
     * @pre checkSpace(pos) = true AND player != null AND player != ' '
     * @post pos = #pos AND player = #player (isPlayerAtPos = true OR isPlayerAtPos = false)
     */
    public boolean isPlayerAtPos(BoardPosition pos, char player) {

    }

    /** Returns one string that shows entire GameBoard
     *
     * @return string that is formatted GameBoard
     *
     * @pre none
     * @post toString = string representing GameBoard
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
