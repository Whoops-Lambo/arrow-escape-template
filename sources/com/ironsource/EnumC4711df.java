package com.ironsource;

import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC4711df {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);

    private final int a;
    private static final /* synthetic */ jh0 g = ek2.m(a());

    @NotNull
    public static final a b = new a(null);

    /* JADX INFO: renamed from: com.ironsource.df$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @NotNull
        public final EnumC4711df a(int i) {
            for (EnumC4711df enumC4711df : EnumC4711df.values()) {
                if (enumC4711df.a == i) {
                    if (enumC4711df == null) {
                        return EnumC4711df.CurrentlyLoadedAds;
                    }
                    return enumC4711df;
                }
            }
            enumC4711df = null;
            if (enumC4711df == null) {
                return EnumC4711df.CurrentlyLoadedAds;
            }
            return enumC4711df;
        }

        private a() {
        }
    }

    @NotNull
    public static jh0 b() {
        return g;
    }

    public final int c() {
        return this.a;
    }

    EnumC4711df(int i) {
        this.a = i;
    }
}
