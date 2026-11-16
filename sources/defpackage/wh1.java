package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class wh1 {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, boolean z, int i) {
        TypedValue typedValueA = a(context, i);
        if (typedValueA != null && typedValueA.type == 18) {
            if (typedValueA.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static TypedValue c(Context context, int i, String str) {
        TypedValue typedValueA = a(context, i);
        if (typedValueA != null) {
            return typedValueA;
        }
        wb0.g("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }
}
