package com.ironsource;

import defpackage.du;
import defpackage.s71;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Mg {

    @NotNull
    private final List<A> a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mg) && s71.b(this.a, ((Mg) obj).a);
    }

    @NotNull
    public final List<A> b() {
        return this.a;
    }

    public final int c() {
        return this.a.size();
    }

    @NotNull
    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (A a : this.a) {
            arrayList.add(a(a.h(), a.r()));
        }
        return du.g0(arrayList, ",", null, null, null, 62);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WaterfallInstances(instances=" + this.a + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Mg(@NotNull List<? extends A> list) {
        list.getClass();
        this.a = list;
    }

    private final String a(C5074y2 c5074y2, int i) {
        return String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c5074y2.c()}, 2));
    }

    @NotNull
    public final Mg a(@NotNull List<? extends A> list) {
        list.getClass();
        return new Mg(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Mg a(Mg mg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mg.a;
        }
        return mg.a(list);
    }

    @NotNull
    public final List<A> a() {
        return this.a;
    }
}
