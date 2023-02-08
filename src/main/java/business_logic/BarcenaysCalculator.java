package business_logic;

public class BarcenaysCalculator implements ExchangeCalculator{
    public String[] getCurrencyLongNames(){
        return Currency.longNames();
    }

    @Override
    public double getChangeValue(String origCurrency, double amount, String endCurrency) throws Exception{
        ForexOperator forex = new ForexOperator(origCurrency, amount, endCurrency);
        return (forex.getChangeValue());
    }

    @Override
    public double calculateCommission(double amount, String origCurrency) throws Exception{
        CommissionCalculator commission = new CommissionCalculator(amount, origCurrency);
        return (commission.calculateCommission());
    }
}
