package com.contafacilapp.bff.mapper.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.model.Client;
import com.contafacilapp.model.ExtraIncome;

public class InsertExtraIncomeBFFRequestMapper {

    private ExtraIncome requestBS = new ExtraIncome();

    public InsertExtraIncomeBFFRequestMapper(ExtraIncomeDTO extraIncomeDTO) {

        requestBS.setDescription(extraIncomeDTO.getDescription());
        requestBS.setMonth(extraIncomeDTO.getMonth());
        requestBS.setName(extraIncomeDTO.getName());
        requestBS.setValue(extraIncomeDTO.getValue());
        requestBS.setYear(extraIncomeDTO.getYear());

        Client client = new Client();
        client.setId(Long.valueOf(extraIncomeDTO.getClientId()));
        requestBS.setClient(client);

    }

    public ExtraIncome toBusinessDTO() {
        return requestBS;
    }
}
