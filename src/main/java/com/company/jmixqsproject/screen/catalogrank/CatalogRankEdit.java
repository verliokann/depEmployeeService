package com.company.jmixqsproject.screen.catalogrank;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogRank;

@UiController("Rank_.edit")
@UiDescriptor("catalog-rank-edit.xml")
@EditedEntityContainer("catalogRankDc")
public class CatalogRankEdit extends StandardEditor<CatalogRank> {
}