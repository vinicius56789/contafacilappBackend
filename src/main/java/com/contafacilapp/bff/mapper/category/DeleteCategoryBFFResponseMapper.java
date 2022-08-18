package com.contafacilapp.bff.mapper.category;

import com.contafacilapp.bff.dto.category.DeleteCategoryBFFResponseDTO;
import com.contafacilapp.util.ConstantsIntegerUtils;
import com.contafacilapp.util.ConstantsStringUtils;

public class DeleteCategoryBFFResponseMapper {

    private DeleteCategoryBFFResponseDTO responseBFF = new DeleteCategoryBFFResponseDTO();

    public DeleteCategoryBFFResponseMapper(int deleteCategory) {

        if(ConstantsIntegerUtils.ZERO.equals(deleteCategory)) {
            responseBFF.setReturnMessage(ConstantsStringUtils.NODELCATEGORY);
        } else {
            responseBFF.setReturnMessage(ConstantsStringUtils.DELCATEGORY);
        }

    }

    public DeleteCategoryBFFResponseDTO toFrontEndDTO() {
        return responseBFF;
    }
}
