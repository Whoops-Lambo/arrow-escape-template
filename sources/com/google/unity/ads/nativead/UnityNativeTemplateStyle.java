package com.google.unity.ads.nativead;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.ads.nativetemplates.TemplateView;
import defpackage.cq1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class UnityNativeTemplateStyle {

    @Nullable
    final UnityNativeTemplateTextStyle callToActionStyle;
    private LayoutInflater layoutInflater;

    @Nullable
    final ColorDrawable mainBackgroundColor;

    @Nullable
    final UnityNativeTemplateTextStyle primaryTextStyle;

    @Nullable
    final UnityNativeTemplateTextStyle secondaryTextStyle;

    @NonNull
    final UnityNativeTemplateType templateType;

    @Nullable
    final UnityNativeTemplateTextStyle tertiaryTextStyle;

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnityNativeTemplateStyle)) {
            return false;
        }
        UnityNativeTemplateStyle unityNativeTemplateStyle = (UnityNativeTemplateStyle) obj;
        return this.templateType == unityNativeTemplateStyle.templateType && (((colorDrawable = this.mainBackgroundColor) == null && unityNativeTemplateStyle.mainBackgroundColor == null) || colorDrawable.getColor() == unityNativeTemplateStyle.mainBackgroundColor.getColor()) && Objects.equals(this.callToActionStyle, unityNativeTemplateStyle.callToActionStyle) && Objects.equals(this.primaryTextStyle, unityNativeTemplateStyle.primaryTextStyle) && Objects.equals(this.secondaryTextStyle, unityNativeTemplateStyle.secondaryTextStyle) && Objects.equals(this.tertiaryTextStyle, unityNativeTemplateStyle.tertiaryTextStyle);
    }

    private void setLayoutInflater(Context context) {
        this.layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @NonNull
    public cq1 asNativeTemplateStyle() {
        cq1 cq1Var = new cq1();
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        if (colorDrawable != null) {
            cq1Var.q = colorDrawable;
        }
        UnityNativeTemplateTextStyle unityNativeTemplateTextStyle = this.callToActionStyle;
        if (unityNativeTemplateTextStyle != null) {
            if (unityNativeTemplateTextStyle.getBackgroundColor() != null) {
                cq1Var.d = this.callToActionStyle.getBackgroundColor();
            }
            if (this.callToActionStyle.getTextColor() != null) {
                cq1Var.c = Integer.valueOf(this.callToActionStyle.getTextColor().getColor());
            }
            if (this.callToActionStyle.getFontStyle() != null) {
                cq1Var.a = this.callToActionStyle.getFontStyle().getTypeface();
            }
            if (this.callToActionStyle.getSize() != null) {
                cq1Var.b = this.callToActionStyle.getSize().floatValue();
            }
        }
        UnityNativeTemplateTextStyle unityNativeTemplateTextStyle2 = this.primaryTextStyle;
        if (unityNativeTemplateTextStyle2 != null) {
            if (unityNativeTemplateTextStyle2.getBackgroundColor() != null) {
                cq1Var.h = this.primaryTextStyle.getBackgroundColor();
            }
            if (this.primaryTextStyle.getTextColor() != null) {
                cq1Var.g = Integer.valueOf(this.primaryTextStyle.getTextColor().getColor());
            }
            if (this.primaryTextStyle.getFontStyle() != null) {
                cq1Var.e = this.primaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.primaryTextStyle.getSize() != null) {
                cq1Var.f = this.primaryTextStyle.getSize().floatValue();
            }
        }
        UnityNativeTemplateTextStyle unityNativeTemplateTextStyle3 = this.secondaryTextStyle;
        if (unityNativeTemplateTextStyle3 != null) {
            if (unityNativeTemplateTextStyle3.getBackgroundColor() != null) {
                cq1Var.l = this.secondaryTextStyle.getBackgroundColor();
            }
            if (this.secondaryTextStyle.getTextColor() != null) {
                cq1Var.k = Integer.valueOf(this.secondaryTextStyle.getTextColor().getColor());
            }
            if (this.secondaryTextStyle.getFontStyle() != null) {
                cq1Var.i = this.secondaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.secondaryTextStyle.getSize() != null) {
                cq1Var.j = this.secondaryTextStyle.getSize().floatValue();
            }
        }
        UnityNativeTemplateTextStyle unityNativeTemplateTextStyle4 = this.tertiaryTextStyle;
        if (unityNativeTemplateTextStyle4 != null) {
            if (unityNativeTemplateTextStyle4.getBackgroundColor() != null) {
                cq1Var.p = this.tertiaryTextStyle.getBackgroundColor();
            }
            if (this.tertiaryTextStyle.getTextColor() != null) {
                cq1Var.o = Integer.valueOf(this.tertiaryTextStyle.getTextColor().getColor());
            }
            if (this.tertiaryTextStyle.getFontStyle() != null) {
                cq1Var.m = this.tertiaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.tertiaryTextStyle.getSize() != null) {
                cq1Var.n = this.tertiaryTextStyle.getSize().floatValue();
            }
        }
        return cq1Var;
    }

    @Nullable
    public TemplateView asTemplateView(Context context) {
        if (this.layoutInflater == null) {
            setLayoutInflater(context);
        }
        TemplateView templateView = (TemplateView) this.layoutInflater.inflate(this.templateType.resourceId(), (ViewGroup) null);
        if (templateView == null) {
            return null;
        }
        templateView.setStyles(asNativeTemplateStyle());
        return templateView;
    }

    @Nullable
    public UnityNativeTemplateTextStyle getCallToActionStyle() {
        return this.callToActionStyle;
    }

    @Nullable
    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    @Nullable
    public UnityNativeTemplateTextStyle getPrimaryTextStyle() {
        return this.primaryTextStyle;
    }

    @Nullable
    public UnityNativeTemplateTextStyle getSecondaryTextStyle() {
        return this.secondaryTextStyle;
    }

    @NonNull
    public UnityNativeTemplateType getTemplateType() {
        return this.templateType;
    }

    @Nullable
    public UnityNativeTemplateTextStyle getTertiaryTextStyle() {
        return this.tertiaryTextStyle;
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        return Objects.hash(colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor()), this.callToActionStyle, this.primaryTextStyle, this.secondaryTextStyle, this.tertiaryTextStyle);
    }

    public UnityNativeTemplateStyle(@NonNull UnityNativeTemplateType unityNativeTemplateType, @Nullable ColorDrawable colorDrawable, @Nullable UnityNativeTemplateTextStyle unityNativeTemplateTextStyle, @Nullable UnityNativeTemplateTextStyle unityNativeTemplateTextStyle2, @Nullable UnityNativeTemplateTextStyle unityNativeTemplateTextStyle3, @Nullable UnityNativeTemplateTextStyle unityNativeTemplateTextStyle4) {
        this.templateType = unityNativeTemplateType;
        this.mainBackgroundColor = colorDrawable;
        this.callToActionStyle = unityNativeTemplateTextStyle;
        this.primaryTextStyle = unityNativeTemplateTextStyle2;
        this.secondaryTextStyle = unityNativeTemplateTextStyle3;
        this.tertiaryTextStyle = unityNativeTemplateTextStyle4;
    }

    @VisibleForTesting
    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
    }
}
