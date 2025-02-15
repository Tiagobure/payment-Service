package model.Service;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		
	    return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		
		
		return  amount * 0.01 * months;
		 
		 
		 
			//value = value +(0.02*value);
		
			//value = value +(0.03*value);
		
		}
	}


