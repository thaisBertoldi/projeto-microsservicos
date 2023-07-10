package com.thais.hrpayroll.services;

import com.thais.hrpayroll.entities.Payment;
import com.thais.hrpayroll.entities.Worker;
import com.thais.hrpayroll.feignClient.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
