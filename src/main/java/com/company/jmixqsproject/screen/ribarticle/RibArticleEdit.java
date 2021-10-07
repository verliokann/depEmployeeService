package com.company.jmixqsproject.screen.ribarticle;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.RibArticle;

@UiController("RibArticle.edit")
@UiDescriptor("rib-article-edit.xml")
@EditedEntityContainer("ribArticleDc")
public class RibArticleEdit extends StandardEditor<RibArticle> {
}