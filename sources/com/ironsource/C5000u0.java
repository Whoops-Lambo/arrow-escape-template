package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.e80;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5000u0 {

    @NotNull
    private final AbstractC4929q0 a;

    @Nullable
    private final LevelPlayAdInfo b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5000u0)) {
            return false;
        }
        C5000u0 c5000u0 = (C5000u0) obj;
        return s71.b(this.a, c5000u0.a) && s71.b(this.b, c5000u0.b);
    }

    public static /* synthetic */ C5000u0 a(C5000u0 c5000u0, AbstractC4929q0 abstractC4929q0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC4929q0 = c5000u0.a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c5000u0.b;
        }
        return c5000u0.a(abstractC4929q0, levelPlayAdInfo);
    }

    @Nullable
    public final LevelPlayAdInfo b() {
        return this.b;
    }

    @Nullable
    public final LevelPlayAdInfo c() {
        return this.b;
    }

    @NotNull
    public final AbstractC4929q0 d() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdUnitCallback(adUnit=" + this.a + ", adInfo=" + this.b + ")";
    }

    public C5000u0(@NotNull AbstractC4929q0 abstractC4929q0, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        abstractC4929q0.getClass();
        this.a = abstractC4929q0;
        this.b = levelPlayAdInfo;
    }

    public /* synthetic */ C5000u0(AbstractC4929q0 abstractC4929q0, LevelPlayAdInfo levelPlayAdInfo, int i, e80 e80Var) {
        this(abstractC4929q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    @NotNull
    public final C5000u0 a(@NotNull AbstractC4929q0 abstractC4929q0, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        abstractC4929q0.getClass();
        return new C5000u0(abstractC4929q0, levelPlayAdInfo);
    }

    @NotNull
    public final AbstractC4929q0 a() {
        return this.a;
    }
}
