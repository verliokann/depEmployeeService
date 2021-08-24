package com.company.jmixqsproject.screen.catalogrank;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.CatalogRank;

@UiController("Rank_.browse")
@UiDescriptor("catalog-rank-browse.xml")
@LookupComponent("catalogRanksTable")
public class CatalogRankBrowse extends StandardLookup<CatalogRank> {
}