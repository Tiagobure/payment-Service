package modelService;

public interface OnlinePaymentService {
	Double paymentFee(Double amount);
	Integer interest(Double amount, Integer months); 
	
}
