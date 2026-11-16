package com.ironsource;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4895o2 {

    @Nullable
    private List<String> a = new ArrayList();

    @Nullable
    private List<String> b = new ArrayList();

    @Nullable
    private List<String> c = new ArrayList();

    @Nullable
    public final List<String> a() {
        return this.c;
    }

    @Nullable
    public final List<String> b() {
        return this.b;
    }

    @Nullable
    public final List<String> c() {
        return this.a;
    }

    public final void a(@Nullable List<String> list) {
        this.c = list;
    }

    public final void b(@Nullable List<String> list) {
        this.b = list;
    }

    public final void c(@Nullable List<String> list) {
        this.a = list;
    }
}
