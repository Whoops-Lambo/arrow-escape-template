package defpackage;

import android.graphics.Color;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhcr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ku3 {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public static boolean b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            zzeh.d("SsaStyle", jc1.o("Failed to parse boolean value: '", str, new StringBuilder(String.valueOf(str).length() + 33), "'"), e);
            return false;
        }
    }

    public static Integer a(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgvz.a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(zzhcr.a(((j >> 24) & 255) ^ 255), zzhcr.a(j & 255), zzhcr.a((j >> 8) & 255), zzhcr.a((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzeh.d("SsaStyle", jc1.o("Failed to parse color expression: '", str, new StringBuilder(String.valueOf(str).length() + 36), "'"), e);
            return null;
        }
    }

    public ku3(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }
}
