package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import defpackage.jc1;
import defpackage.q63;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzjr extends zzau {
    public final int c;

    @Nullable
    public final String d;
    public final int e;

    @Nullable
    public final zzv f;
    public final int g;

    @Nullable
    public final zzxt h;
    final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    private zzjr(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable zzv zzvVar, int i4, @Nullable zzxt zzxtVar, boolean z) {
        String str3;
        int i5;
        String strO;
        String str4;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            strO = "Source error";
        } else if (i != 1) {
            strO = "Unexpected runtime error";
            str3 = str2;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str5 = zzfq.a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    io.p071bidmachine.media3.extractor.ts.y.b();
                    throw null;
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(str4.length() + strValueOf.length() + q63.a(String.valueOf(str2).length() + 14, 9, String.valueOf(i3)) + 19);
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            strO = jc1.o(strValueOf, ", format_supported=", sb, str4);
        }
        this(TextUtils.isEmpty(null) ? strO : strO.concat(": null"), th, i2, i, str3, i5, zzvVar, i4, zzxtVar, SystemClock.elapsedRealtime(), z);
    }

    public static zzjr a(IOException iOException, int i) {
        return new zzjr(0, iOException, null, i, null, -1, null, 4, null, false);
    }

    public static zzjr b(Throwable th, String str, int i, @Nullable zzv zzvVar, int i2, @Nullable zzxt zzxtVar, boolean z, int i3) {
        if (zzvVar == null) {
            i2 = 4;
        }
        return new zzjr(1, th, null, i3, str, i, zzvVar, i2, zzxtVar, z);
    }

    public static zzjr c(RuntimeException runtimeException, int i) {
        return new zzjr(2, runtimeException, null, i, null, -1, null, 4, null, false);
    }

    @CheckResult
    public final zzjr d(@Nullable zzxt zzxtVar) {
        String message = getMessage();
        String str = zzfq.a;
        return new zzjr(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, zzxtVar, this.b, this.i);
    }

    private zzjr(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable zzv zzvVar, int i4, @Nullable zzxt zzxtVar, long j, boolean z) {
        boolean z2;
        super(str, th, i, Bundle.EMPTY, j);
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzgvz.a(z2);
        zzgvz.a(th != null);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = zzvVar;
        this.g = i4;
        this.h = zzxtVar;
        this.i = z;
    }
}
