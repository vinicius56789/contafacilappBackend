package com.contafacilapp.bff.service.impl.extraincome;

import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.service.extraincome.impl.SelectExtraIncomeBFFServiceImpl;
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

@ExtendWith(MockitoExtension.class)
public class SelectExtraIncomeBFFServiceImplTest {

    @Mock
    private ExtraIncomeService extraIncomeService;

    @InjectMocks
    private SelectExtraIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void selectExtraIncomeBFFServiceTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();
        extraIncomeDTO.setExtraIncomeId("1");

        ExtraIncome extraIncome = new ExtraIncome();

        Mockito.when(extraIncomeService.selectExtraIncome(Mockito.any())).thenReturn(extraIncome);

        Assertions.assertNotNull(service.selectExtraIncomeBFFService(extraIncomeDTO));
    }
}
