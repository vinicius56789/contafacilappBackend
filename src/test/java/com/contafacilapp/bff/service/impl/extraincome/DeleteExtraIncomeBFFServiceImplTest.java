package com.contafacilapp.bff.service.impl.extraincome;


import com.contafacilapp.bff.dto.extraincome.ExtraIncomeDTO;
import com.contafacilapp.bff.service.extraincome.impl.DeleteExtraIncomeBFFServiceImpl;
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
public class DeleteExtraIncomeBFFServiceImplTest {

    @Mock
    private ExtraIncomeService extraIncomeService;

    @InjectMocks
    private DeleteExtraIncomeBFFServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deleteExtraIncomeBFFServiceSuccessTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();
        extraIncomeDTO.setExtraIncomeId("1");

        Mockito.when(extraIncomeService.deleteExtraIncome(Mockito.any())).thenReturn(1);

        Assertions.assertNotNull(service.deleteExtraIncomeBFFService(extraIncomeDTO));
    }

    @Test
    void deleteExtraIncomeBFFServiceErrorTest() {

        ExtraIncomeDTO extraIncomeDTO = new ExtraIncomeDTO();
        extraIncomeDTO.setExtraIncomeId("1");

        Mockito.when(extraIncomeService.deleteExtraIncome(Mockito.any())).thenReturn(0);

        Assertions.assertNotNull(service.deleteExtraIncomeBFFService(extraIncomeDTO));
    }
}
