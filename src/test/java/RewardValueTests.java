import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue cashValue = new RewardValue(100.0);
        assertEquals( (int) (100.0/0.0035),cashValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue milesValue = new RewardValue(70);
        assertEquals((20000*0.0035),milesValue.getMilesValue()) ;
    }
}
