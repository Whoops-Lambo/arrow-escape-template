package com.ironsource;

import defpackage.dk2;
import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import defpackage.kk2;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public enum W7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);

    private final int a;
    private static final /* synthetic */ jh0 g = ek2.m(a());

    @NotNull
    public static final a b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @NotNull
        public final W7 a(@NotNull String str) {
            str.getClass();
            List listN0 = dk2.n0(str, new String[]{"_"}, 0, 6);
            if (listN0.size() < 2) {
                return W7.UnknownProvider;
            }
            return a(kk2.M((String) listN0.get(1)));
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
        @NotNull
        public final W7 a(@Nullable Integer num) {
            for (W7 w7 : W7.values()) {
                int iC = w7.c();
                if (num != null && iC == num.intValue()) {
                    if (w7 == null) {
                        return W7.UnknownProvider;
                    }
                    return w7;
                }
            }
            w7 = null;
            if (w7 == null) {
                return W7.UnknownProvider;
            }
            return w7;
        }
    }

    @NotNull
    public static jh0 b() {
        return g;
    }

    public final int c() {
        return this.a;
    }

    W7(int i) {
        this.a = i;
    }
}
