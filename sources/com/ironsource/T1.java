package com.ironsource;

import defpackage.e80;
import defpackage.hg0;
import defpackage.s71;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class T1 {

    @NotNull
    private final Map<String, String> a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T1) && s71.b(this.a, ((T1) obj).a);
    }

    public /* synthetic */ T1(Map map, int i, e80 e80Var) {
        this((i & 1) != 0 ? hg0.a : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ T1 a(T1 t1, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = t1.a;
        }
        return t1.a(map);
    }

    @NotNull
    public final Map<String, String> b() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.a + ")";
    }

    public T1(@NotNull Map<String, String> map) {
        map.getClass();
        this.a = map;
    }

    public T1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final T1 a(@NotNull Map<String, String> map) {
        map.getClass();
        return new T1(map);
    }

    @NotNull
    public final Map<String, String> a() {
        return this.a;
    }
}
