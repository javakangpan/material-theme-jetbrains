/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes;

import com.chrisrm.idea.MTAbstractTheme;
import com.chrisrm.idea.MTConfig;
import com.chrisrm.idea.MTCustomThemeConfig;
import com.chrisrm.idea.utils.MTColorUtils;
import org.jetbrains.annotations.NotNull;

import javax.swing.plaf.ColorUIResource;

@SuppressWarnings("DesignForExtension")
public class MTCustomTheme extends MTAbstractTheme {
  @Override
  public ColorUIResource getBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getBackgroundColorString();
  }

  @Override
  public ColorUIResource getForegroundColorString() {
    return MTCustomThemeConfig.getInstance().getForegroundColorString();
  }

  @Override
  public ColorUIResource getTextColorString() {
    return MTCustomThemeConfig.getInstance().getTextColorString();
  }

  @Override
  public ColorUIResource getSelectionBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getSelectionBackgroundColorString();
  }

  @Override
  public ColorUIResource getSelectionForegroundColorString() {
    return MTCustomThemeConfig.getInstance().getSelectionForegroundColorString();
  }

  @Override
  public ColorUIResource getButtonColorString() {
    return MTCustomThemeConfig.getInstance().getButtonColorString();
  }

  @Override
  public ColorUIResource getSecondaryBackgroundColorString() {
    return MTCustomThemeConfig.getInstance().getSecondaryBackgroundColorString();
  }

  @Override
  public ColorUIResource getDisabledColorString() {
    return MTCustomThemeConfig.getInstance().getDisabledColorString();
  }

  @Override
  public ColorUIResource getContrastColorString() {
    return MTCustomThemeConfig.getInstance().getContrastColorString();
  }

  @Override
  public ColorUIResource getTableSelectedColorString() {
    return MTCustomThemeConfig.getInstance().getTableSelectedColorString();
  }

  @Override
  public ColorUIResource getSecondBorderColorString() {
    return MTCustomThemeConfig.getInstance().getSecondBorderColorString();
  }

  @Override
  public ColorUIResource getHighlightColorString() {
    return MTCustomThemeConfig.getInstance().getHighlightColorString();
  }

  @Override
  public ColorUIResource getTreeSelectionColorString() {
    return MTCustomThemeConfig.getInstance().getTreeSelectionColorString();
  }

  @Override
  public ColorUIResource getNotificationsColorString() {
    return MTCustomThemeConfig.getInstance().getNotificationsColorString();
  }

  @Override
  public ColorUIResource getAccentColorString() {
    return MTColorUtils.parseColor(MTConfig.getInstance().getAccentColor());
  }

  @Override
  public ColorUIResource getExcludedColorString() {
    // todo use contrastify
    return new ColorUIResource(0x2E3C43);
  }

  @NotNull
  @Override
  public String getThemeId() {
    return "mt.custom";
  }

  @Override
  public boolean isCustom() {
    return true;
  }
}
