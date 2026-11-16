package com.ironsource;

import androidx.media3.exoplayer.upstream.CmcdData;
import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum M3 {
    Day("d", 86400000),
    Hour(CmcdData.STREAMING_FORMAT_HLS, 3600000),
    Second("s", 1000);


    @NotNull
    private final String a;
    private final long b;
    private static final /* synthetic */ jh0 h = ek2.m(a());

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @Nullable
        public final M3 a(@Nullable String str) {
            for (M3 m3 : M3.values()) {
                if (s71.b(m3.a, str)) {
                    return m3;
                }
            }
            return null;
        }

        private a() {
        }
    }

    public static /* synthetic */ long a(M3 m3, Integer num, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: inMilliseconds");
            return 0L;
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return m3.a(num);
    }

    @NotNull
    public static jh0 b() {
        return h;
    }

    M3(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final long a(@Nullable Integer num) {
        return ((long) (num != null ? num.intValue() : 1)) * this.b;
    }
}
