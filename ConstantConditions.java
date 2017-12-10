package scripts.wastedbro.api.waiting;

import org.tribot.api.types.generic.Condition;
import org.tribot.api2007.Banking;

/**
 * @author Wastedbro
 */
public class ConstantConditions
{
    public static final Condition BANK_IS_OPEN  = new Condition()
    {
        @Override
        public boolean active()
        {
            return Banking.isBankScreenOpen();
        }
    };
    public static final Condition BANK_IS_CLOSED  = new Condition()
    {
        @Override
        public boolean active()
        {
            return !Banking.isBankScreenOpen();
        }
    };
    public static final Condition IN_BANK = new Condition()
    {
        @Override
        public boolean active()
        {
            return Banking.isInBank();
        }
    };

}
