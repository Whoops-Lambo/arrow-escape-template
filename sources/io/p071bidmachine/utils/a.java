package io.p071bidmachine.utils;

import android.os.Handler;
import android.text.TextUtils;
import defpackage.nj;
import defpackage.q63;
import io.p071bidmachine.core.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final a e = new a(100, "Can't connect to server");
    public static final a f = new a(102, "Timeout reached");
    public static final a g = new a(110, "Request contains bad syntax or cannot be fulfilled");
    public static final a h = new a(109, "Server failed to fulfil an apparently valid request");
    public static final a i = new a(107, "AdRequest expired, load new one please");
    public static final a j = new a(106, "AdRequest destroyed, create new one please");
    public static final a k = new a(107, "AdResponse expired, load new one please");
    public static final a l = new a(111, "AdResponse already was shown");
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public final int a;
    public final String b;
    public final boolean c;
    public final a d;

    static {
        new a(111, "Ads was already shown, load new one please");
        m = new a(107, "Ads was expired, load new one please");
        n = new a(106, "Ads destroyed, load new one please");
        o = new a(201, "Placeholder timeout error");
        p = new a(103, "No ads fill");
        q = c("Unknown error");
        r = new a(103, "No bid", false, null);
    }

    public static a a(String str) {
        return new a(200, str);
    }

    public static a b(String str) {
        return new a(101, str);
    }

    public static a c(String str) {
        return new a(108, str);
    }

    public static a d(String str) {
        return new a(103, str.concat(" not found"));
    }

    public static a e(String str, Throwable th) {
        a aVar;
        if (th != null) {
            try {
                StringBuilder sb = new StringBuilder(th.getClass().getName());
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb.append(": ");
                    sb.append(message);
                }
                aVar = new a(-1, sb.toString());
            } catch (Throwable unused) {
                aVar = null;
            }
        } else {
            aVar = null;
        }
        return new a(108, str, true, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a != aVar.a) {
            return false;
        }
        return this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        String str = this.b;
        a aVar = this.d;
        int i2 = this.a;
        if (aVar == null) {
            return q63.f(i2, "(", ") ", str);
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(i2);
        sb.append(") ");
        sb.append(str);
        sb.append(" - (");
        sb.append(aVar.a);
        sb.append(" - ");
        return nj.q(sb, aVar.b, ")");
    }

    public a(int i2, String str, boolean z, a aVar) {
        this.a = i2;
        Handler handler = j.a;
        this.b = TextUtils.isEmpty(str) ? "Unknown error" : str;
        this.c = z;
        this.d = aVar;
    }

    public a(int i2, String str) {
        this(i2, str, true, null);
    }

    public a(a aVar, int i2, String str) {
        this(aVar.a, aVar.b, aVar.c, new a(i2, str));
    }
}
