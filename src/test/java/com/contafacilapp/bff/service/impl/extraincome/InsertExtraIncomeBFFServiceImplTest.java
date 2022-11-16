package com.contafacilapp.bff.service.impl.extraincome;


import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.service.extraincome.impl.InsertExtraIncomeBFFServiceImpl;
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
public class InsertExtraIncomeBFFServiceImplTest {

    @Mock
    private ExtraIncomeService extraIncomeService;

    @InjectMocks
    private InsertExtraIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void insertExtraIncomeBFFServiceSuccessTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();
        extraIncomeDTO.setClientId("1");

        Mockito.when(extraIncomeService.insertExtraIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.insertExtraIncomeBFFService(extraIncomeDTO));
    }

    @Test
    void insertExtraIncomeBFFServiceErrorTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();
        extraIncomeDTO.setClientId("1");

        Mockito.when(extraIncomeService.insertExtraIncome(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.insertExtraIncomeBFFService(extraIncomeDTO));
    }
}
