package com.moloco.sdk.acm;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();
    public final String b;
    public final ArrayList a = new ArrayList();
    public int c = 1;

    public e(String str) {
        this.b = str;
    }

    public final void a(String str, String str2) {
        str2.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.size() < 10 && str.length() <= 100 && str2.length() <= 100) {
            arrayList.add(new f(str, str2));
        }
    }
}
