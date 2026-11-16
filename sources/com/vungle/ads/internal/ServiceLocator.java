package com.vungle.ads.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.vq2;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0007\bJ!\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/ServiceLocator;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "serviceClass", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", "com/vungle/ads/internal/q1", "com/vungle/ads/internal/r1", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ServiceLocator {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static volatile ServiceLocator INSTANCE;
    public static final q1 d = new q1();
    public final Context a;
    public final HashMap b;
    public final HashMap c;

    public final synchronized boolean c() {
        HashMap map;
        map = this.c;
        for (Class cls : this.b.keySet()) {
            if (cls.isAssignableFrom(com.vungle.ads.internal.downloader.t.class)) {
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + com.vungle.ads.internal.downloader.t.class);
        return map.containsKey(cls);
    }

    public final synchronized <T> T getService(@NotNull Class<T> serviceClass) {
        serviceClass.getClass();
        return (T) a(serviceClass);
    }

    public final Object a(Class cls) {
        for (Class cls2 : this.b.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                Object obj = this.c.get(cls2);
                if (obj != null) {
                    return obj;
                }
                r1 r1Var = (r1) this.b.get(cls2);
                if (r1Var == null) {
                    defpackage.d.r("Unknown class");
                    return null;
                }
                Object objA = r1Var.a();
                if (r1Var.a) {
                    this.c.put(cls2, objA);
                }
                return objA;
            }
        }
        vq2.r(cls, "Unknown dependency for ");
        return null;
    }

    public final void b() {
        this.b.put(com.vungle.ads.internal.task.d.class, new z1(this));
        this.b.put(com.vungle.ads.internal.task.g.class, new a2(this));
        this.b.put(VungleApiClient.class, new b2(this));
        this.b.put(com.vungle.ads.internal.platform.f.class, new c2(this));
        this.b.put(com.vungle.ads.internal.executor.a.class, new d2());
        this.b.put(com.vungle.ads.internal.omsdk.c.class, new e2(this));
        this.b.put(com.vungle.ads.internal.omsdk.d.class, new f2());
        this.b.put(FilePreferences.class, new g2(this));
        this.b.put(com.vungle.ads.internal.locale.a.class, new h2());
        this.b.put(com.vungle.ads.internal.bidding.e.class, new s1(this));
        this.b.put(PathProvider.class, new t1(this));
        this.b.put(com.vungle.ads.internal.downloader.n.class, new u1(this));
        this.b.put(com.vungle.ads.internal.downloader.t.class, new v1(this));
        this.b.put(com.vungle.ads.internal.util.k.class, new w1());
        this.b.put(com.vungle.ads.internal.signals.j.class, new x1(this));
        this.b.put(com.vungle.ads.internal.network.r.class, new y1(this));
    }

    public ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new HashMap();
        this.c = new HashMap();
        b();
    }

    public /* synthetic */ ServiceLocator(Context context, int i) {
        this(context);
    }
}
