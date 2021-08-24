package com.company.jmixqsproject.screen.catalogcontracttype;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogContractType;

@UiController("CatalogContractType.browse")
@UiDescriptor("catalog-contract-type-browse.xml")
@LookupComponent("catalogContractTypesTable")
public class CatalogContractTypeBrowse extends StandardLookup<CatalogContractType> {
}