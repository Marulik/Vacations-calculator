package com.marulik.calcVacations.service;

import com.marulik.calcVacations.models.Calculator;
import org.springframework.stereotype.Service;

@Service
public class Calculate {
        public int result(Calculator calculator) {
        return calculator.getWorkPay() / 29 * calculator.getVacationDays();
    }

    public Calculator clear (Calculator calculator) {
            calculator.setWorkPay(0);
            calculator.setVacationDays(0);
            return calculator;
    }
 }
