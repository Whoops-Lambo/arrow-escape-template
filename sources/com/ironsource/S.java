package com.ironsource;

import defpackage.du;
import defpackage.e80;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class S implements P, P.a {

    @NotNull
    private final ReadWriteLock a;

    @NotNull
    private final Map<String, O> b;

    public S(@NotNull ReadWriteLock readWriteLock) {
        readWriteLock.getClass();
        this.a = readWriteLock;
        this.b = new LinkedHashMap();
    }

    @Override // com.ironsource.P.a
    public void a(@NotNull JSONObject jSONObject, @NotNull EnumC4893o0 enumC4893o0, @NotNull String str) {
        jSONObject.getClass();
        enumC4893o0.getClass();
        str.getClass();
        this.a.writeLock().lock();
        try {
            O o = this.b.get(str);
            if (o == null) {
                return;
            }
            String strOptString = jSONObject.optString("bundleId");
            strOptString.getClass();
            if (strOptString.length() > 0) {
                o.a(strOptString);
            }
            String strOptString2 = jSONObject.optString("dynamicDemandSource");
            strOptString2.getClass();
            if (strOptString2.length() > 0) {
                o.a(W7.b.a(strOptString2));
            }
            o.a(enumC4893o0);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public S() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ S(ReadWriteLock readWriteLock, int i, e80 e80Var) {
        this((i & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.P
    @NotNull
    public List<O> a() {
        this.a.readLock().lock();
        List<O> listZ0 = du.z0(this.b.values());
        this.a.readLock().unlock();
        return listZ0;
    }

    @Override // com.ironsource.P.a
    public void a(@NotNull O o) {
        o.getClass();
        this.a.writeLock().lock();
        try {
            if (this.b.get(o.c()) == null) {
                this.b.put(o.c(), o);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.P
    @Nullable
    public O a(@NotNull String str) {
        str.getClass();
        this.a.readLock().lock();
        try {
            return this.b.get(str);
        } finally {
            this.a.readLock().unlock();
        }
    }

    @Override // com.ironsource.P.a
    public void a(@NotNull EnumC4893o0 enumC4893o0, @NotNull String str) {
        enumC4893o0.getClass();
        str.getClass();
        this.a.writeLock().lock();
        try {
            O o = this.b.get(str);
            if (o == null) {
                return;
            }
            o.a(enumC4893o0);
            o.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
