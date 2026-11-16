package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.e80;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Q2 extends C4750g0 {

    @NotNull
    private final LevelPlayAdSize g;

    @Nullable
    private final Boolean h;

    @Nullable
    private final Long i;

    public /* synthetic */ Q2(UUID uuid, String str, C4870md c4870md, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, Tf tf, Double d, int i, e80 e80Var) {
        this(uuid, str, (i & 4) != 0 ? null : c4870md, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : tf, (i & 128) != 0 ? null : d);
    }

    @NotNull
    public final LevelPlayAdSize i() {
        return this.g;
    }

    @Nullable
    public final Boolean j() {
        return this.h;
    }

    @Nullable
    public final Long k() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(@NotNull UUID uuid, @NotNull String str, @Nullable C4870md c4870md, @NotNull LevelPlayAdSize levelPlayAdSize, @Nullable Boolean bool, @Nullable Long l, @Nullable Tf tf, @Nullable Double d) {
        super(IronSource.a.BANNER, uuid, str, c4870md, tf, d);
        uuid.getClass();
        str.getClass();
        levelPlayAdSize.getClass();
        this.g = levelPlayAdSize;
        this.h = bool;
        this.i = l;
    }

    public Q2() {
        this(C5097z7.a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
