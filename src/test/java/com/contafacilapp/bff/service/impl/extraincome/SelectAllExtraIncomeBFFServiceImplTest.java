package com.contafacilapp.bff.service.impl.extraincome;


import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.service.extraincome.impl.SelectAllExtraIncomeBFFServiceImpl;
import com.contafacilapp.bs.ExtraIncomeService;
import com.contafacilapp.model.ExtraIncome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SelectAllExtraIncomeBFFServiceImplTest {

    @Mock
    private ExtraIncomeService extraIncomeService;

    @InjectMocks
    private SelectAllExtraIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectAllExtraIncomeBFFServiceTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();
        extraIncomeDTO.setClientId("1");

        List<ExtraIncome> extraIncomes = new ArrayList<>();
        ExtraIncome extraIncome = new ExtraIncome();
        extraIncomes.add(extraIncome);

        Mockito.when(extraIncomeService.selectAllExtraIncome(Mockito.any())).thenReturn(extraIncomes);

        Assertions.assertNotNull(service.selectAllExtraIncomeBFFService(extraIncomeDTO));
    }
}
