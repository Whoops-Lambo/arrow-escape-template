package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.jc1;
import defpackage.n30;
import defpackage.q63;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbg {
    public final int a;
    public final String b;
    public final int c;
    public final zzv[] d;
    public int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.b.equals(zzbgVar.b) && Arrays.equals(this.d, zzbgVar.d)) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public static void a(int i, String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        q63.y(sb, "Different ", str, " combined in one TrackGroup: '", str2);
        n30.t(i, "' (track 0) and '", str3, "' (track ", sb);
        sb.append(")");
        zzeh.f("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d) + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        String str = this.b;
        return jc1.o(str, ": ", new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length()), string);
    }

    public zzbg(String str, zzv... zzvVarArr) {
        boolean z;
        int iF;
        String str2;
        int length = zzvVarArr.length;
        int i = 1;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        this.b = str;
        this.d = zzvVarArr;
        this.a = length;
        String str3 = zzvVarArr[0].o;
        if (TextUtils.isEmpty(str3)) {
            iF = zzas.f(zzvVarArr[0].n);
        } else {
            iF = zzas.f(str3);
        }
        this.c = iF;
        zzv zzvVar = zzvVarArr[0];
        String str4 = zzvVar.d;
        str4 = (str4 == null || str4.equals("und")) ? "" : str4;
        int i2 = zzvVar.f | 16384;
        while (true) {
            zzv[] zzvVarArr2 = this.d;
            if (i < zzvVarArr2.length) {
                zzv zzvVar2 = zzvVarArr2[i];
                String str5 = zzvVar2.d;
                if (str5 == null || str5.equals("und")) {
                    str2 = "";
                } else {
                    str2 = str5;
                }
                if (!str4.equals(str2)) {
                    a(i, "languages", zzvVarArr2[0].d, str5);
                    return;
                } else {
                    if (i2 != (zzvVar2.f | 16384)) {
                        a(i, "role flags", Integer.toBinaryString(zzvVarArr2[0].f), Integer.toBinaryString(this.d[i].f));
                        return;
                    }
                    i++;
                }
            } else {
                return;
            }
        }
    }
}
