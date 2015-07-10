package com.example.colorpicker;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView
  extends TextView
{
  public static Typeface FONT_NAME; //Ankur
  
  public CustomTextView(Context paramContext)
  {
    super(paramContext);
    if (FONT_NAME == null) {
      FONT_NAME = Utils.getFont(paramContext);
    }
    setTypeface(FONT_NAME);
  }
  
  public CustomTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (FONT_NAME == null) {
      FONT_NAME = Utils.getFont(paramContext);
    }
    setTypeface(FONT_NAME);
  }
  
  public CustomTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (FONT_NAME == null) {
      FONT_NAME = Utils.getFont(paramContext);
    }
    setTypeface(FONT_NAME);
  }
}
