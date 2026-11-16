package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.e80;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0 extends J5 {

    @NotNull
    private final C4911p0 a;

    @NotNull
    private final C4750g0 b;

    @Nullable
    private final String c;

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b0) {
        Map<String, Object> mapA = a(this.b);
        mapA.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", Integer.valueOf(this.a.g()));
        String str = this.c;
        if (str != null) {
            mapA.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }

    public C0(@NotNull C4911p0 c4911p0, @NotNull C4750g0 c4750g0, @Nullable String str) {
        c4911p0.getClass();
        c4750g0.getClass();
        this.a = c4911p0;
        this.b = c4750g0;
        this.c = str;
    }

    public /* synthetic */ C0(C4911p0 c4911p0, C4750g0 c4750g0, String str, int i, e80 e80Var) {
        this(c4911p0, c4750g0, (i & 4) != 0 ? null : str);
    }
}
