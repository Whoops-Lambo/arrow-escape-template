package io.p071bidmachine.utils.version;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public final a a;
    public final a b;
    public final boolean c;
    public final boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.c == bVar.c && this.d == bVar.d && Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(a aVar) {
        boolean z = this.d;
        boolean z2 = this.c;
        a aVar2 = this.b;
        a aVar3 = this.a;
        if (aVar3 != null && aVar2 != null && (((z2 && aVar.compareTo(aVar3) >= 0) || (!z2 && aVar.compareTo(aVar3) > 0)) && ((z && aVar.compareTo(aVar2) <= 0) || (!z && aVar.compareTo(aVar2) < 0)))) {
            return true;
        }
        if (aVar3 != null && aVar2 == null && ((z2 && aVar.compareTo(aVar3) >= 0) || (!z2 && aVar.compareTo(aVar3) > 0))) {
            return true;
        }
        if (aVar3 != null || aVar2 == null || ((!z || aVar.compareTo(aVar2) > 0) && (z || aVar.compareTo(aVar2) >= 0))) {
            return aVar3 == null && aVar2 == null;
        }
        return true;
    }

    public b(a aVar, a aVar2, boolean z, boolean z2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
        this.d = z2;
    }

    public static b b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean zStartsWith = str.startsWith(C4664b4.j.d);
            boolean zStartsWith2 = str.startsWith("(");
            if (!zStartsWith && !zStartsWith2) {
                zStartsWith = true;
            } else {
                str = str.substring(1);
            }
            boolean zEndsWith = str.endsWith(C4664b4.j.e);
            boolean zEndsWith2 = str.endsWith(")");
            if (!zEndsWith && !zEndsWith2) {
                zEndsWith = true;
            } else {
                str = str.substring(0, str.length() - 1);
            }
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length < 2) {
                a aVarB = a.b(str);
                if (aVarB == null) {
                    return null;
                }
                return new b(aVarB, aVarB, zStartsWith, zEndsWith);
            }
            return new b(a.b(strArrSplit[0]), a.b(strArrSplit[1]), zStartsWith, zEndsWith);
        } catch (Throwable unused) {
            return null;
        }
    }
}
