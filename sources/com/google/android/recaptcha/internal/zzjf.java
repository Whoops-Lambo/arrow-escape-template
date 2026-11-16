package com.google.android.recaptcha.internal;

import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjf {
    public static void zza(boolean z) {
        if (z) {
            return;
        }
        e32.a();
    }

    public static void zzb(boolean z, Object obj) {
        if (z) {
            return;
        }
        d.r((String) obj);
    }

    public static void zzc(boolean z, String str, char c) {
        if (z) {
            return;
        }
        d.r(zzji.zza(str, Character.valueOf(c)));
    }

    public static void zzd(int i, int i2, int i3) {
        String strZzf;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzf = zzf(i, i3, "start index");
            } else {
                strZzf = (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z, Object obj) {
        if (z) {
            return;
        }
        e32.i((String) obj);
    }

    private static String zzf(int i, int i2, String str) {
        return i < 0 ? zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i)) : zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
