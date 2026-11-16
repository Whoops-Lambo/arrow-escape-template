package androidx.core.util;

import androidx.annotation.RestrictTo;
import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public final class Preconditions {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        d.r(str);
    }

    public static void b(int i) {
        if (i >= 0) {
            return;
        }
        e32.a();
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        d.w(str);
    }
}
