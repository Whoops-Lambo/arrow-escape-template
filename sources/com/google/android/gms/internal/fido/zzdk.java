package com.google.android.gms.internal.fido;

import com.ironsource.C4664b4;
import defpackage.h50;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class zzdk {
    public final String a;
    public final Class b;
    public final boolean c;

    public zzdk(String str, Class cls, boolean z, int i) {
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char cCharAt2 = str.charAt(i2);
                    if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                        defpackage.d.r("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                        throw null;
                    }
                }
                this.a = str;
                this.b = cls;
                this.c = z;
                System.identityHashCode(this);
                for (int i3 = 0; i3 < 5; i3++) {
                }
                return;
            }
            defpackage.d.r("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        defpackage.d.r("identifier must not be empty");
        throw null;
    }

    public final String toString() {
        String name = getClass().getName();
        return pv1.p(h50.q(name, "/"), this.a, C4664b4.j.d, this.b.getName(), C4664b4.j.e);
    }
}
