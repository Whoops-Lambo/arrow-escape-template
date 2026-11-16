package com.ironsource;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    @NotNull
    public static final M a = new M();

    @NotNull
    private static final HashMap<String, Long> b = new HashMap<>();

    private M() {
    }

    public final boolean a(@NotNull String str, long j) {
        str.getClass();
        if (str.length() != 0) {
            HashMap<String, Long> map = b;
            if (map.containsKey(str)) {
                return false;
            }
            map.put(str, Long.valueOf(j));
            return true;
        }
        return false;
    }

    public final long b(@NotNull String str) {
        str.getClass();
        Long l = b.get(str);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    public final long c(@NotNull String str) {
        str.getClass();
        Long l = b.get(str);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @NotNull
    public final HashMap<String, Long> a() {
        return b;
    }

    public final boolean a(@NotNull String str) {
        str.getClass();
        HashMap<String, Long> map = b;
        if (map.get(str) == null) {
            return false;
        }
        map.remove(str);
        return true;
    }
}
