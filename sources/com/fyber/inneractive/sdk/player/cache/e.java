package com.fyber.inneractive.sdk.player.cache;

import com.singular.sdk.internal.UserDetailsUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public final String a;
    public final long[] b;
    public boolean c;
    public d d;
    public final /* synthetic */ g e;

    public e(g gVar, String str) {
        this.e = gVar;
        this.a = str;
        this.b = new long[gVar.g];
    }

    public final File a(int i) {
        return new File(this.e.a, this.a + UserDetailsUtils.UserDetailsLiterals.DOT + i);
    }

    public final File b(int i) {
        return new File(this.e.a, this.a + UserDetailsUtils.UserDetailsLiterals.DOT + i + ".tmp");
    }
}
