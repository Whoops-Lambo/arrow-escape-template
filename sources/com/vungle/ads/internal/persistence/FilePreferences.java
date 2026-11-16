package com.vungle.ads.internal.persistence;

import com.ironsource.C4664b4;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.n;
import defpackage.tk0;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences;", "", "", C4664b4.i.W, "getString", "com/vungle/ads/internal/persistence/a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class FilePreferences {
    public static final a d = new a();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public final Executor a;
    public final File b;
    public final ConcurrentHashMap c;

    public final void b() {
        HashMap map = new HashMap(this.c);
        this.a.execute(new tk0(5, this.b, map));
    }

    public final String c() {
        Object obj = this.c.get("previous_tcf_token");
        return obj instanceof String ? (String) obj : "";
    }

    public FilePreferences(j jVar, PathProvider pathProvider, String str) throws Throwable {
        this.a = jVar;
        File file = new File(pathProvider.a(), str);
        this.b = file;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        Object objC = n.c(file);
        if (objC instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) objC);
        }
    }

    public final int a(String str, int i) {
        str.getClass();
        Object obj = this.c.get(str);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return i;
    }

    @Nullable
    public final String getString(@NotNull String key) {
        key.getClass();
        Object obj = this.c.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static final void a(File file, Serializable serializable) {
        file.getClass();
        serializable.getClass();
        n.a(file, serializable);
    }

    public final FilePreferences b(String str, int i) {
        str.getClass();
        this.c.put(str, Integer.valueOf(i));
        return this;
    }

    public final FilePreferences a(boolean z, String str) {
        str.getClass();
        this.c.put(str, Boolean.valueOf(z));
        return this;
    }

    public final FilePreferences b(String str, long j) {
        str.getClass();
        this.c.put(str, Long.valueOf(j));
        return this;
    }

    public final Boolean a(String str) {
        str.getClass();
        Object obj = this.c.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final FilePreferences a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.c.put(str, str2);
        return this;
    }

    public final long a(String str, long j) {
        str.getClass();
        Object obj = this.c.get(str);
        return obj instanceof Long ? ((Number) obj).longValue() : j;
    }

    public /* synthetic */ FilePreferences(j jVar, PathProvider pathProvider, String str, int i) {
        this(jVar, pathProvider, str);
    }
}
