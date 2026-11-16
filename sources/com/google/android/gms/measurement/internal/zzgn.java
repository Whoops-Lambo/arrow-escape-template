package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.C4664b4;
import defpackage.gx4;
import defpackage.h50;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgn {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final gx4 a;

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.b()) {
            return str;
        }
        return g(str, zzjm.f, zzjm.a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.b()) {
            return str;
        }
        return g(str, zzjn.b, zzjn.a, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.b()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return pv1.n("experiment_id(", str, ")");
        }
        return g(str, zzjo.b, zzjo.a, d);
    }

    public final String d(zzbh zzbhVar) {
        String string;
        gx4 gx4Var = this.a;
        if (!gx4Var.b()) {
            return zzbhVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbhVar.c);
        sb.append(",name=");
        sb.append(a(zzbhVar.a));
        sb.append(",params=");
        zzbf zzbfVar = zzbhVar.b;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !gx4Var.b() ? zzbfVar.a.toString() : e(zzbfVar.v0());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.a.b()) {
            return bundle.toString();
        }
        StringBuilder sbP = h50.p("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbP.length() != 8) {
                sbP.append(", ");
            }
            sbP.append(b(str));
            sbP.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbP.append(strF);
        }
        sbP.append("}]");
        return sbP.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbP = h50.p(C4664b4.j.d);
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbP.length() != 1) {
                    sbP.append(", ");
                }
                sbP.append(strE);
            }
        }
        sbP.append(C4664b4.j.e);
        return sbP.toString();
    }

    public zzgn(gx4 gx4Var) {
        this.a = gx4Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }
}
