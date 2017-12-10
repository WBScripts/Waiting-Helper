package scripts.wastedbro.api.waiting;

import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api.types.generic.Condition;
import org.tribot.api2007.Game;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSTile;

/**
 * @author Wastedbro
 */
public class Waiting
{
    public static boolean waitUntilInBank()
    {
        return Timing.waitCondition(ConstantConditions.IN_BANK, General.randomSD(1500,6000,3500,450));
    }

    public static boolean waitForBankOpen()
    {
        return Timing.waitCondition(ConstantConditions.BANK_IS_OPEN, General.randomSD(1500,4500,3000,500));
    }

    public static boolean waitForAnimation(int animationId, int timeout)
    {
        return Timing.waitCondition(new Condition()
        {
            @Override
            public boolean active()
            {
                return Player.getAnimation() == animationId;
            }
        }, timeout);
    }

    public static boolean waitForAnyAnimation(int timeout)
    {
        return Timing.waitCondition(new Condition()
        {
            @Override
            public boolean active()
            {
                return Player.getAnimation() != -1;
            }
        }, timeout);
    }

    public static int calculateTimeOutFromDistance(int distance)
    {
        int tick = 800;

        if(Game.isRunOn())
            tick = 400;

        return General.randomSD((distance*tick+1000), 300);
    }
}
