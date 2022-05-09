package com.example.backend.Service.PayPal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.DTO.BookingObject;
import com.example.backend.Repository.SeatRepository;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

@Service
public class PayPalPayment {
	
	@Autowired
	private APIContext apiContext;
    @Autowired
    private SeatRepository seats;
	
	public Payment createPayment(
			BookingObject booking ,
			String cancelUrl, 
			String successUrl) throws PayPalRESTException{
		 Integer count[]=booking.getSeatId();
		 int amount1=0;
	      for(int i=0;i<count.length;i++) {
	          String cost=seats.getCostById(count[i]);
	          Integer price=Integer.parseInt(cost);
	          amount1=amount1+price;
	      }
		Amount amount = new Amount();
		amount.setCurrency("USD");
		amount1 = (int) new BigDecimal(amount1).setScale(2, RoundingMode.HALF_UP).doubleValue();
		amount.setTotal(String.format("%.2f", amount1));

		Transaction transaction = new Transaction();
		transaction.setDescription("booking payment");
		transaction.setAmount(amount);

		List transactions = new ArrayList<>();
		transactions.add(transaction);

		Payer payer = new Payer();
		payer.setPaymentMethod("paypal");

		Payment payment = new Payment();
		payment.setIntent("booking");
		payment.setPayer(payer);  
		payment.setTransactions(transactions);
		RedirectUrls redirectUrls = new RedirectUrls();
		redirectUrls.setCancelUrl(cancelUrl);
		redirectUrls.setReturnUrl(successUrl);
		payment.setRedirectUrls(redirectUrls);

		return payment.create(apiContext);
	}
	
	public Payment executePayment(String paymentId, String payerId) throws PayPalRESTException{
		Payment payment = new Payment();
		payment.setId(paymentId);
		PaymentExecution paymentExecute = new PaymentExecution();
		paymentExecute.setPayerId(payerId);
		return payment.execute(apiContext, paymentExecute);
	}


}