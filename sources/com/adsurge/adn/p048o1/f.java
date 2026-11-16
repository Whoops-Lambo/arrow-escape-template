package com.adsurge.adn.p048o1;

import android.text.TextUtils;
import com.adsurge.adn.F.d;
import com.adsurge.adn.Y0.c;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.h50;
import defpackage.pv1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class f {
    public final StringBuilder a = new StringBuilder();

    public f c() {
        this.a.append("} ");
        return this;
    }

    public f d() {
        this.a.append("} else ");
        return this;
    }

    public f a(String str, Object... objArr) {
        Arrays.toString(objArr);
        if (objArr != null && objArr.length > 0) {
            Object[] objArr2 = new Object[objArr.length + 2];
            objArr2[0] = str;
            objArr2[1] = null;
            System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
            return a("GDTEventBus", "emit").b("GDTEventBus", "emit", objArr2);
        }
        return a("GDTEventBus", "emit").b("GDTEventBus", "emit", str);
    }

    public f b(String str, String str2, Object... objArr) {
        if (TextUtils.isEmpty(str2)) {
            return this;
        }
        if (str != null) {
            StringBuilder sb = this.a;
            sb.append(str);
            sb.append(UserDetailsUtils.UserDetailsLiterals.DOT);
        }
        StringBuilder sb2 = this.a;
        sb2.append(str2);
        sb2.append('(');
        int i = 0;
        while (true) {
            int length = objArr.length;
            StringBuilder sb3 = this.a;
            if (i < length) {
                sb3.append(a(objArr[i]));
                if (i < objArr.length - 1) {
                    this.a.append(", ");
                }
                i++;
            } else {
                sb3.append("); ");
                return this;
            }
        }
    }

    public static String a(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    public f a(String str, String str2) {
        if (str != null) {
            StringBuilder sbR = pv1.r("typeof ", str, " !== 'undefined' && typeof ", str, UserDetailsUtils.UserDetailsLiterals.DOT);
            sbR.append(str2);
            sbR.append(" === 'function' ");
            return b(sbR.toString());
        }
        return b("typeof " + str2 + " === 'function' ");
    }

    public f a(String str, String str2, Object... objArr) {
        return a(str, str2).b(str, str2, objArr);
    }

    public static String a(Object obj) {
        if (!(obj instanceof String)) {
            if (obj == null) {
                return "null";
            }
            return obj.toString();
        }
        return "\"" + a((String) obj) + "\"";
    }

    public String a() {
        return this.a.toString();
    }

    public static f b() {
        return new f();
    }

    public Object a(d dVar, c cVar) {
        if (dVar == null) {
            return null;
        }
        String strA = a();
        try {
            return d.a(dVar, strA);
        } catch (Throwable th) {
            g.a(strA, cVar, th);
            return null;
        }
    }

    public f b(String str) {
        h50.x("if (", str, this.a, ") { ");
        return this;
    }
}
