package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.fd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4745fd implements N7 {

    @NotNull
    private final G3 a;

    @NotNull
    private ConcurrentHashMap<String, Long> b;

    public C4745fd(@NotNull G3 g3) {
        g3.getClass();
        this.a = g3;
        this.b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.N7
    @Nullable
    public Long a(@NotNull String str) {
        str.getClass();
        Long l = this.b.get(str);
        if (l != null) {
            return Long.valueOf(l.longValue());
        }
        Long lB = this.a.b(str);
        if (lB != null) {
            long jLongValue = lB.longValue();
            this.b.put(str, Long.valueOf(jLongValue));
            return Long.valueOf(jLongValue);
        }
        return null;
    }

    @Override // com.ironsource.N7
    public void a(long j, @NotNull String str) {
        str.getClass();
        this.b.put(str, Long.valueOf(j));
        this.a.a(str, j);
    }
}
