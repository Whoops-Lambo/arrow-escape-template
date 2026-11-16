package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C4874n extends J5 {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final UUID b;

    @NotNull
    private final String c;

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b0) {
        return a(new C4750g0(this.a, this.b, this.c, null, null, null, 56, null));
    }

    public C4874n(@NotNull IronSource.a aVar, @NotNull UUID uuid, @NotNull String str) {
        aVar.getClass();
        uuid.getClass();
        str.getClass();
        this.a = aVar;
        this.b = uuid;
        this.c = str;
    }
}
