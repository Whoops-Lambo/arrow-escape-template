package com.google.android.gms.internal.measurement;

import com.ironsource.C4664b4;
import defpackage.nj;
import defpackage.q63;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzyl {
    public final String a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public void b(Object obj, zzzc zzzcVar) {
        zzzcVar.a(obj, this.a);
    }

    public zzyl(String str, Class cls, boolean z, boolean z2) {
        char cCharAt = str.charAt(0);
        if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
            for (int i = 1; i < str.length(); i++) {
                char cCharAt2 = str.charAt(i);
                if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                    defpackage.d.r("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                    throw null;
                }
            }
            this.a = str;
            this.b = cls;
            this.c = z;
            this.d = z2;
            int iIdentityHashCode = System.identityHashCode(this);
            long j = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                j |= 1 << (iIdentityHashCode & 63);
                iIdentityHashCode >>>= 6;
            }
            this.e = j;
            return;
        }
        defpackage.d.r("identifier must start with an ASCII letter: ".concat(str));
        throw null;
    }

    public void a(Iterator it, zzzc zzzcVar) {
        while (it.hasNext()) {
            b(it.next(), zzzcVar);
        }
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        q63.y(sb, name, "/", str, C4664b4.j.d);
        return nj.q(sb, name2, C4664b4.j.e);
    }
}
