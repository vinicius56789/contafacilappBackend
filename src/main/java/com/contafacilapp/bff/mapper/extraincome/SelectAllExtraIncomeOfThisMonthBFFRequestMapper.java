package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.ExtraIncome;

public class SelectAllExtraIncomeOfThisMonthBFFRequestMapper {

    private ExtraIncome requestBS = new ExtraIncome();

    public SelectAllExtraIncomeOfThisMonthBFFRequestMapper(ExtraIncomeDTO extraIncomeDTO) {

        Client client = new Client();
        client.setId(Long.valueOf(extraIncomeDTO.getClientId()));
        requestBS.setClient(client);

    }

    public ExtraIncome toBusinessDTO() {
        return requestBS;
    }
}
