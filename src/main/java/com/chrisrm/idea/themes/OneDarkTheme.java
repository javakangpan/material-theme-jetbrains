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

import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public final class OneDarkTheme extends MTAbstractTheme {
  @Override
  public String getThemeId() {
    return "one.dark";
  }

  @Override
  public ColorUIResource getBackgroundColorString() {
    return new ColorUIResource(0x282C34);
  }

  @Override
  public ColorUIResource getForegroundColorString() {
    return new ColorUIResource(0x979FAD);
  }

  @Override
  public ColorUIResource getTextColorString() {
    return new ColorUIResource(0x979FAD);
  }

  @Override
  public ColorUIResource getSelectionBackgroundColorString() {
    return new ColorUIResource(0x3A3F4B);
  }

  @Override
  public ColorUIResource getSelectionForegroundColorString() {
    return new ColorUIResource(0xFFFFFF);
  }

  @Override
  public ColorUIResource getButtonColorString() {
    return new ColorUIResource(0x3A3F4B);
  }

  @Override
  public ColorUIResource getSecondaryBackgroundColorString() {
    return new ColorUIResource(0x2F333D);
  }

  @Override
  public ColorUIResource getDisabledColorString() {
    return new ColorUIResource(0x6B727D);
  }

  @Override
  public ColorUIResource getContrastColorString() {
    return new ColorUIResource(0x21252B);
  }

  @Override
  public ColorUIResource getTableSelectedColorString() {
    return new ColorUIResource(0x383E49);
  }

  @Override
  public ColorUIResource getSecondBorderColorString() {
    return new ColorUIResource(0x282C34);
  }

  @Override
  public ColorUIResource getHighlightColorString() {
    return new ColorUIResource(0x383D48);
  }

  @Override
  public ColorUIResource getTreeSelectionColorString() {
    return new ColorUIResource(new Color(0x803A3F4B, true));
  }

  @Override
  public ColorUIResource getNotificationsColorString() {
    return new ColorUIResource(0x282C34);
  }

  @Override
  public ColorUIResource getAccentColorString() {
    return new ColorUIResource(0x2979ff);
  }

  @Override
  public ColorUIResource getExcludedColorString() {
    return new ColorUIResource(0x3c4150);
  }
}
