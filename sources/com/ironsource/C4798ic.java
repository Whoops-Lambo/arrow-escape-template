package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import defpackage.e80;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4798ic extends C4750g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4798ic(@NotNull UUID uuid, @NotNull String str, @Nullable C4870md c4870md) {
        super(IronSource.a.NATIVE_AD, uuid, str, c4870md, null, null, 48, null);
        uuid.getClass();
        str.getClass();
    }

    public /* synthetic */ C4798ic(UUID uuid, String str, C4870md c4870md, int i, e80 e80Var) {
        this(uuid, str, (i & 4) != 0 ? null : c4870md);
    }

    public C4798ic() {
        this(C5097z7.a.a(), "", null, 4, null);
    }
}
