package com.contafacilapp.bff.mapper.category;

import com.contafacilapp.bff.dto.category.InsertCategoryBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class InsertCategoryBFFResponseMapper {

    private InsertCategoryBFFResponseDTO responseBFF = new InsertCategoryBFFResponseDTO();

    public InsertCategoryBFFResponseMapper(int insertCategory) {

        if(ConstantsIntegerUtils.ZERO.equals(insertCategory)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NOINSERTCATEGORY);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.INSERTCATEGORY);
        }

    }

    public InsertCategoryBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
