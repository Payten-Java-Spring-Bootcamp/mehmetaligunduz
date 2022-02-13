package com.patika.Credit.service.credit;

import com.patika.Credit.common.enumeration.Status;

public interface ICreditService {
    CreditService getStatusAndLimit(String id);
    CreditService getStatusAndLimit(String id, double salary);
}
