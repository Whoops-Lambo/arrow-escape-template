package com.google.unity.ads.nativead;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class UnityNativeTemplateTextStyle {

    @Nullable
    private final ColorDrawable backgroundColor;

    @Nullable
    private final UnityNativeTemplateFontStyle fontStyle;

    @Nullable
    private final Double size;

    @Nullable
    private final ColorDrawable textColor;

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnityNativeTemplateTextStyle)) {
            return false;
        }
        UnityNativeTemplateTextStyle unityNativeTemplateTextStyle = (UnityNativeTemplateTextStyle) obj;
        ColorDrawable colorDrawable2 = this.textColor;
        return ((colorDrawable2 == null && unityNativeTemplateTextStyle.textColor == null) || colorDrawable2.getColor() == unityNativeTemplateTextStyle.textColor.getColor()) && (((colorDrawable = this.backgroundColor) == null && unityNativeTemplateTextStyle.backgroundColor == null) || colorDrawable.getColor() == unityNativeTemplateTextStyle.backgroundColor.getColor()) && Objects.equals(this.size, unityNativeTemplateTextStyle.size) && Objects.equals(this.fontStyle, unityNativeTemplateTextStyle.fontStyle);
    }

    @Nullable
    public ColorDrawable getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public UnityNativeTemplateFontStyle getFontStyle() {
        return this.fontStyle;
    }

    @Nullable
    public Float getSize() {
        Double d = this.size;
        if (d == null) {
            return null;
        }
        return Float.valueOf(d.floatValue());
    }

    @Nullable
    public ColorDrawable getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.textColor;
        Integer numValueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.backgroundColor;
        return Objects.hash(numValueOf, colorDrawable2 != null ? Integer.valueOf(colorDrawable2.getColor()) : null, this.size, this.fontStyle);
    }

    public UnityNativeTemplateTextStyle(@Nullable ColorDrawable colorDrawable, @Nullable ColorDrawable colorDrawable2, @Nullable UnityNativeTemplateFontStyle unityNativeTemplateFontStyle, @Nullable Double d) {
        this.textColor = colorDrawable;
        this.backgroundColor = colorDrawable2;
        this.fontStyle = unityNativeTemplateFontStyle;
        this.size = d;
    }
}
