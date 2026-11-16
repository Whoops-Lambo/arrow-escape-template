package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.annotation.ColorInt;
import androidx.appcompat.view.ContextThemeWrapper;
import com.ecffri.arrows.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    @ColorInt
    public static final int a(@NotNull Context context) {
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.mlcColorPrimary});
        typedArrayObtainStyledAttributes.getClass();
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (zHasValue) {
            return color;
        }
        TypedArray typedArrayObtainStyledAttributes2 = new ContextThemeWrapper(context, R.style.Theme_Moloco).obtainStyledAttributes(new int[]{R.attr.mlcColorPrimary});
        typedArrayObtainStyledAttributes2.getClass();
        boolean zHasValue2 = typedArrayObtainStyledAttributes2.hasValue(0);
        int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (zHasValue2) {
            return color2;
        }
        return context.getColor(R.color.moloco_primary);
    }
}
