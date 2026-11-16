package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ki1 {
    public static int a(int i, Context context, int i2) {
        Integer numValueOf;
        int color;
        TypedValue typedValueA = wh1.a(context, i);
        if (typedValueA != null) {
            int i3 = typedValueA.resourceId;
            if (i3 != 0) {
                color = context.getColor(i3);
            } else {
                color = typedValueA.data;
            }
            numValueOf = Integer.valueOf(color);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return i2;
    }

    public static int b(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValueC = wh1.c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueC.resourceId;
        if (i2 != 0) {
            return context.getColor(i2);
        }
        return typedValueC.data;
    }

    public static ColorStateList c(Context context, int i) {
        TypedValue typedValueA = wh1.a(context, i);
        if (typedValueA != null) {
            int i2 = typedValueA.resourceId;
            if (i2 != 0) {
                return ResourcesCompat.a(context.getResources(), i2, context.getTheme());
            }
            int i3 = typedValueA.data;
            if (i3 != 0) {
                return ColorStateList.valueOf(i3);
            }
            return null;
        }
        return null;
    }

    public static int d(float f, int i, int i2) {
        return ColorUtils.d(ColorUtils.f(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
