package com.google.android.recaptcha.internal;

import defpackage.eu;
import io.p071bidmachine.media3.extractor.ts.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgc {
    @NotNull
    public static final Class zza(@Nullable Object obj) throws zzce {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (!(obj instanceof Integer)) {
            if (!(obj instanceof String)) {
                y.e(4, 5, null);
                return null;
            }
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                int i = zzav.zza;
                if (((zzfu) eu.w(zzgb.zza).getValue()).zzb(str)) {
                    return cls2;
                }
                y.e(6, 47, null);
                return null;
            } catch (Exception e) {
                y.e(6, 8, e);
                return null;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == 1) {
            cls = Integer.TYPE;
        } else if (iIntValue == 2) {
            cls = Short.TYPE;
        } else if (iIntValue == 3) {
            cls = Byte.TYPE;
        } else if (iIntValue == 4) {
            cls = Long.TYPE;
        } else if (iIntValue == 5) {
            cls = Character.TYPE;
        } else if (iIntValue == 6) {
            cls = Float.TYPE;
        } else if (iIntValue == 7) {
            cls = Double.TYPE;
        } else {
            cls = iIntValue == 8 ? Boolean.TYPE : null;
        }
        if (cls != null) {
            return cls;
        }
        y.e(4, 6, null);
        return null;
    }
}
