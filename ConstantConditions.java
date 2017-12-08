package scripts.wastedbro.api.waiting;

import org.tribot.api.types.generic.Condition;
import org.tribot.api2007.Banking;

/**
 * @author Wastedbro
 */
public class ConstantConditions
{
    private static final Condition BankIsOpen  = new Condition()
    {
        @Override
        public boolean active()
        {
            return Banking.isBankScreenOpen();
        }
    };
    private static final Condition BankIsClosed  = new Condition()
    {
        @Override
        public boolean active()
        {
            return !Banking.isBankScreenOpen();
        }
    };


}
