package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.eo4;
import defpackage.i05;
import defpackage.n30;
import defpackage.q63;
import defpackage.qo4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgu extends i05 {
    public char c;
    public long d;
    public String e;
    public final zzgs f;
    public final zzgs g;
    public final zzgs h;
    public final zzgs i;
    public final zzgs j;
    public final zzgs k;
    public final zzgs l;
    public final zzgs m;
    public final zzgs n;

    public final String D() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    ((zzic) ((zzic) this.a).d.a).getClass();
                    this.e = "FA";
                }
                Preconditions.checkNotNull(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // defpackage.i05
    public final boolean u() {
        return false;
    }

    public static qo4 B(String str) {
        if (str == null) {
            return null;
        }
        return new qo4(str);
    }

    public static String F(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(q63.a(str.length() + length + 3, String.valueOf(jRound2).length(), str));
            n30.x(sb, str, jRound, "...");
            return q63.g(jRound2, str, sb);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof qo4) {
                return ((qo4) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = zzic.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    public final zzgs A() {
        return this.n;
    }

    public final void C(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(D(), i)) {
            Log.println(i, D(), E(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhz zzhzVar = ((zzic) this.a).g;
        if (zzhzVar == null) {
            Log.println(6, D(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzhzVar.b) {
                Log.println(6, D(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            zzhzVar.C(new eo4(this, i, str, obj, obj2, obj3));
        }
    }

    public final zzgs x() {
        return this.f;
    }

    public final zzgs y() {
        return this.i;
    }

    public final zzgs z() {
        return this.m;
    }

    public zzgu(zzic zzicVar) {
        super(zzicVar);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new zzgs(this, 6, false, false);
        this.g = new zzgs(this, 6, true, false);
        this.h = new zzgs(this, 6, false, true);
        this.i = new zzgs(this, 5, false, false);
        this.j = new zzgs(this, 5, true, false);
        this.k = new zzgs(this, 5, false, true);
        this.l = new zzgs(this, 4, false, false);
        this.m = new zzgs(this, 3, false, false);
        this.n = new zzgs(this, 2, false, false);
    }

    public static String E(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strF = F(obj, z);
        String strF2 = F(obj2, z);
        String strF3 = F(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strF)) {
            sb.append(str2);
            sb.append(strF);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(strF2)) {
            sb.append(str2);
            sb.append(strF2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(strF3)) {
            sb.append(str3);
            sb.append(strF3);
        }
        return sb.toString();
    }
}
