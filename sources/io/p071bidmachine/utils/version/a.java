package io.p071bidmachine.utils.version;

import android.text.TextUtils;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a aVar) {
        int iCompare = Integer.compare(this.a, aVar.a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.b, aVar.b);
        return iCompare2 != 0 ? iCompare2 : Integer.compare(this.c, aVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return this.a + UserDetailsUtils.UserDetailsLiterals.DOT + this.b + UserDetailsUtils.UserDetailsLiterals.DOT + this.c;
    }

    public a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static a b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            i3 = (i3 * 100) + Integer.parseInt(strArrSplit[i4]);
                        } else {
                            i3 = Integer.parseInt(strArrSplit[2]);
                        }
                    } else {
                        i2 = Integer.parseInt(strArrSplit[1]);
                    }
                } else {
                    i = Integer.parseInt(strArrSplit[0]);
                }
            }
            return new a(i, i2, i3);
        } catch (Throwable unused) {
            return null;
        }
    }
}
