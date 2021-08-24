package com.company.jmixqsproject.screen.catalogcontracttype;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogContractType;

@UiController("CatalogContractType.edit")
@UiDescriptor("catalog-contract-type-edit.xml")
@EditedEntityContainer("catalogContractTypeDc")
public class CatalogContractTypeEdit extends StandardEditor<CatalogContractType> {
}