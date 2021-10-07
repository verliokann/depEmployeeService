package com.company.jmixqsproject.screen.ribarticle;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.RibArticle;

@UiController("RibArticle.browse")
@UiDescriptor("rib-article-browse.xml")
@LookupComponent("ribArticlesTable")
public class RibArticleBrowse extends StandardLookup<RibArticle> {
}