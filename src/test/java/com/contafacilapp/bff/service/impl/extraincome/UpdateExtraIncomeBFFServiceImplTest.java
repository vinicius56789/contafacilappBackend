package com.contafacilapp.bff.service.impl.extraincome;


import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.service.extraincome.impl.UpdateExtraIncomeBFFServiceImpl;
import com.contafacilapp.bs.ExtraIncomeService;
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
public class UpdateExtraIncomeBFFServiceImplTest {

    @Mock
    private ExtraIncomeService extraIncomeService;

    @InjectMocks
    private UpdateExtraIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void updateExtraIncomeBFFServiceSuccessTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();
        extraIncomeDTO.setExtraIncomeId("1");

        Mockito.when(extraIncomeService.updateExtraIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.updateExtraIncomeBFFService(extraIncomeDTO));
    }

    @Test
    void updateExtraIncomeBFFServiceErrorTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();
        extraIncomeDTO.setExtraIncomeId("1");

        Mockito.when(extraIncomeService.updateExtraIncome(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.updateExtraIncomeBFFService(extraIncomeDTO));
    }

}
