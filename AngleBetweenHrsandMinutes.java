//Problem Link: https://rb.gy/fpkq43

//code
public class Solution 
{
    public static int findAngle(int hour, int minute) 
    {
        double hours_angle = (30*hour)  + (0.5*minute);
        double minute_angle = 6*minute;
        double angle = Math.abs(hours_angle - minute_angle);

        return (int)Math.min(angle,360-angle);
    }
}
