// This is a generated file. Not intended for manual editing.
package com.justint.usdidea.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.justint.usdidea.lang.psi.USDTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.justint.usdidea.lang.psi.*;

public class usdReferenceItemImpl extends ASTWrapperPsiElement implements usdReferenceItem {

  public usdReferenceItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull usdVisitor visitor) {
    visitor.visitReferenceItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof usdVisitor) accept((usdVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAssetReference() {
    return findChildByType(ASSETREFERENCE);
  }

  @Override
  @Nullable
  public PsiElement getPathReference() {
    return findChildByType(PATHREFERENCE);
  }

}
