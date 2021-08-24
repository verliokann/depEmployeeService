package com.company.jmixqsproject.screen.catalogdegree;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogDegree;

@UiController("CatalogDegree.browse")
@UiDescriptor("catalog-degree-browse.xml")
@LookupComponent("catalogDegreesTable")
public class CatalogDegreeBrowse extends StandardLookup<CatalogDegree> {
}