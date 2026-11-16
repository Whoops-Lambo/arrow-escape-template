package com.moloco.sdk.acm;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();
    public final com.facebook.ads.a a;
    public long b;
    public final ArrayList c = new ArrayList();
    public final String d;

    public i(String str, com.facebook.ads.a aVar) {
        this.a = aVar;
        this.d = str;
    }

    public final void a(String str, String str2) {
        str2.getClass();
        ArrayList arrayList = this.c;
        if (arrayList.size() < 10 && str.length() <= 100 && str2.length() <= 100) {
            arrayList.add(new f(str, str2));
        }
    }
}
