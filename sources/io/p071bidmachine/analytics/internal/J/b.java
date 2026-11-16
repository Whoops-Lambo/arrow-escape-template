package io.p071bidmachine.analytics.internal.J;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    void a(String str, String str2);

    String b(String str, String str2);

    static /* synthetic */ String a(b bVar, String str, String str2, int i, Object obj) {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: getString");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return bVar.b(str, str2);
    }
}
