package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5015uf implements U8 {

    @NotNull
    private final G3 a;

    @NotNull
    private ConcurrentHashMap<String, Integer> b;

    @NotNull
    private ConcurrentHashMap<String, Long> c;

    public C5015uf(@NotNull G3 g3) {
        g3.getClass();
        this.a = g3;
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.U8
    public int a(@NotNull String str) {
        str.getClass();
        Integer num = this.b.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.a.c(str);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.b;
        if (numC != null) {
            int iIntValue = numC.intValue();
            concurrentHashMap.put(str, Integer.valueOf(iIntValue));
            return iIntValue;
        }
        concurrentHashMap.put(str, 0);
        return 0;
    }

    @Override // com.ironsource.U8
    @Nullable
    public Long b(@NotNull String str) {
        str.getClass();
        Long l = this.c.get(str);
        if (l != null) {
            return Long.valueOf(l.longValue());
        }
        Long lA = this.a.a(str);
        if (lA != null) {
            long jLongValue = lA.longValue();
            this.c.put(str, Long.valueOf(jLongValue));
            return Long.valueOf(jLongValue);
        }
        return null;
    }

    @Override // com.ironsource.U8
    public void a(int i, @NotNull String str) {
        str.getClass();
        this.b.put(str, Integer.valueOf(i));
        this.a.a(str, i);
    }

    @Override // com.ironsource.U8
    public void a(long j, @NotNull String str) {
        str.getClass();
        this.c.put(str, Long.valueOf(j));
        this.a.b(str, j);
    }
}
