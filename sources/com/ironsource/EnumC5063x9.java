package com.ironsource;

import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.x9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC5063x9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);

    private final int a;
    private static final /* synthetic */ jh0 g = ek2.m(a());

    @NotNull
    public static final a b = new a(null);

    /* JADX INFO: renamed from: com.ironsource.x9$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @NotNull
        public final EnumC5063x9 a(int i) {
            for (EnumC5063x9 enumC5063x9 : EnumC5063x9.values()) {
                if (enumC5063x9.a == i) {
                    if (enumC5063x9 == null) {
                        return EnumC5063x9.NotSupported;
                    }
                    return enumC5063x9;
                }
            }
            enumC5063x9 = null;
            if (enumC5063x9 == null) {
                return EnumC5063x9.NotSupported;
            }
            return enumC5063x9;
        }

        private a() {
        }
    }

    public final int c() {
        return this.a;
    }

    EnumC5063x9(int i) {
        this.a = i;
    }

    public final boolean b(@NotNull EnumC5063x9 enumC5063x9) {
        enumC5063x9.getClass();
        if (enumC5063x9.c() == this.a) {
            return true;
        }
        return false;
    }

    @NotNull
    public static jh0 b() {
        return g;
    }
}
