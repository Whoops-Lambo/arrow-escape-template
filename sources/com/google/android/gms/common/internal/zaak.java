package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DeviceProperties;
import defpackage.e32;
import defpackage.pv1;
import defpackage.rl3;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zaak extends Button {
    public zaak(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        e32.i(pv1.l(i, "Unknown color scheme: ", new StringBuilder(String.valueOf(i).length() + 22)));
        return 0;
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int iZab = zab(i2, com.ecffri.arrows.R.drawable.common_google_signin_btn_icon_dark, com.ecffri.arrows.R.drawable.common_google_signin_btn_icon_light, com.ecffri.arrows.R.drawable.common_google_signin_btn_icon_light);
        int iZab2 = zab(i2, com.ecffri.arrows.R.drawable.common_google_signin_btn_text_dark, com.ecffri.arrows.R.drawable.common_google_signin_btn_text_light, com.ecffri.arrows.R.drawable.common_google_signin_btn_text_light);
        if (i == 0 || i == 1) {
            iZab = iZab2;
        } else if (i != 2) {
            y.d(rl3.c(i, 21), i, "Unknown button size: ");
            return;
        }
        Drawable drawable = resources.getDrawable(iZab);
        drawable.setTintList(resources.getColorStateList(com.ecffri.arrows.R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i2, com.ecffri.arrows.R.color.common_google_signin_btn_text_dark, com.ecffri.arrows.R.color.common_google_signin_btn_text_light, com.ecffri.arrows.R.color.common_google_signin_btn_text_light))));
        if (i == 0) {
            setText(resources.getString(com.ecffri.arrows.R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(com.ecffri.arrows.R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                y.d(rl3.c(i, 21), i, "Unknown button size: ");
                return;
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
