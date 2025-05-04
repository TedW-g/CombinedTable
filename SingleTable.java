public class SingleTable
{
    private int seats;
    private int height;
    private double viewQuality;
/** Returns the number of seats at this table. The value is always greater than or equal to 4. */
public SingleTable(int chairs, int high, double good)
{
    seats = chairs;
    height = high;
    viewQuality = good;
}
public int getNumSeats()
{
    return seats;
}
/** Returns the height of this table in centimeters. */
public int getHeight()
{
   return height;
}
/** Returns the quality of the view from this table. */
public double getViewQuality()
{
    return viewQuality;
}
/** Sets the quality of the view from this table to value . */
public void setViewQuality(double value)
{

}
// There may be instance variables, constructors, and methods that are not shown.
}