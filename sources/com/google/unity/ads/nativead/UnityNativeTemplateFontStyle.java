package com.google.unity.ads.nativead;

import android.graphics.Typeface;
import com.google.unity.ads.PluginUtils;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum UnityNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static UnityNativeTemplateFontStyle fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        pv1.u(i, "Invalid index for NativeTemplateFontStyle: ", PluginUtils.LOGTAG);
        return NORMAL;
    }

    public Typeface getTypeface() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        return Typeface.DEFAULT;
                    }
                    return Typeface.MONOSPACE;
                }
                return Typeface.defaultFromStyle(2);
            }
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.DEFAULT;
    }
}
