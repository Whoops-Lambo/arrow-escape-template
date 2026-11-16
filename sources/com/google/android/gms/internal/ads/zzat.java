package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import defpackage.nj;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzat extends IOException {
    public final boolean a;
    public final int b;

    public static zzat a(@Nullable String str, @Nullable Throwable th) {
        return new zzat(str, th, true, 0);
    }

    public static zzat b(@Nullable String str, @Nullable Throwable th) {
        return new zzat(str, th, true, 1);
    }

    public static zzat c(@Nullable String str) {
        return new zzat(str, null, false, 1);
    }

    public zzat(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String strConcat;
        String message = super.getMessage();
        if (message != null) {
            strConcat = message.concat(" ");
        } else {
            strConcat = "";
        }
        boolean z = this.a;
        int i = this.b;
        int length = strConcat.length();
        int length2 = String.valueOf(z).length() + length + 20;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z);
        sb.append(", dataType=");
        return nj.l(i, "}", sb);
    }
}
