public class CombinedTable
{
    private SingleTable one;
    private SingleTable two;
    public CombinedTable(SingleTable eins, SingleTable zwei)
    {
        one = eins;
        two = zwei;
    }

    public boolean canSeat(int can)
    {
        if (can <= one.getNumSeats() + two.getNumSeats() - 2) return true;
        return false;
    }
}