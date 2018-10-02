/**.
 * Class for Team.
 */
public class Team implements Comparable<Team> {
    private String team;
    private Integer wins;
    private Integer losses;
    private Integer draws;
    /**.
     *It's a default constructor.
     */
    public Team() {

   }
    /**.
     *A Constructor.
     *
     * @param      name  The name
     * @param      win   The window
     * @param      loss  The loss
     * @param      draw  The draw
     */
    public Team(String name, Integer win, Integer loss, Integer draw) {
        this.team = name;
        this.wins = win;
        this.losses = loss;
        this.draws = draw;
    }
    /**.
     *It Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.team;
    }
    /**.
     * Gets the wins.
     *
     * @return     The wins.
     */
    public Integer getWins() {
        return this.wins;
    }
    /**.
     * Gets the losses.
     *
     * @return     The losses.
     */
    public Integer getLosses() {
        return this.losses;
    }
    /**.
     * Gets the draws.
     *
     * @return     The draws.
     */
    public Integer getDraws() {
        return this.draws;
    }
    /**.
     * Checks the various attributes and returns -1 or 0 or 1 accordingly.
     *
     * @param      that  The that
     *
     * @return     -1 or 0 or 1
     */
    public int compareTo(Team that) {
        if (this.getWins() > that.getWins()) {
            return 1;
        } else if (this.getWins() < that.getWins()) {
            return -1;
        } else if (this.getLosses() < that.getLosses()) {
            return 1;
        } else if (this.getLosses() > that.getLosses()) {
            return -1;
        } else if (this.getDraws() > that.getDraws()) {
            return 1;
        } else if (this.getDraws() < that.getDraws()) {
            return -1;
        } else {
            return 0;
        }
    }
}