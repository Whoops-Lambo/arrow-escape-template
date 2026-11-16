package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C4664b4;
import com.ironsource.C5074y2;
import com.ironsource.Hd;
import defpackage.e32;
import defpackage.gd1;
import defpackage.s71;
import defpackage.sr0;
import defpackage.vq2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lcom/unity3d/services/core/di/IServicesRegistry;", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "named", "Lkotlin/Function0;", C5074y2.p, "Lcom/unity3d/services/core/di/ServiceKey;", Hd.d, "(Ljava/lang/String;Lsr0;)Lcom/unity3d/services/core/di/ServiceKey;", "factory", C4664b4.i.W, "Lgd1;", "Laz2;", "updateService", "(Lcom/unity3d/services/core/di/ServiceKey;Lgd1;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "getService", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getOrNull", "resolveService", "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "Ljava/util/concurrent/ConcurrentHashMap;", "_services", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getServices", "()Ljava/util/Map;", "services", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ServicesRegistry implements IServicesRegistry {

    @NotNull
    private final ConcurrentHashMap<ServiceKey, gd1> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, sr0 sr0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        sr0Var.getClass();
        s71.C();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        s71.C();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        s71.C();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String str, sr0 sr0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        sr0Var.getClass();
        s71.C();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @NotNull
    public Map<ServiceKey, gd1> getServices() {
        return this._services;
    }

    public final <T> ServiceKey factory(String named, sr0 instance) {
        named.getClass();
        instance.getClass();
        s71.C();
        throw null;
    }

    public final <T> T get(String named) {
        named.getClass();
        s71.C();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        named.getClass();
        s71.C();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(@NotNull String named, @NotNull KClass<?> instance) {
        named.getClass();
        instance.getClass();
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(@NotNull ServiceKey key) {
        key.getClass();
        gd1 gd1Var = getServices().get(key);
        if (gd1Var != null) {
            return (T) gd1Var.getValue();
        }
        vq2.v(key, "No service instance found for ");
        return null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @Nullable
    public <T> T resolveServiceOrNull(@NotNull ServiceKey key) {
        key.getClass();
        gd1 gd1Var = getServices().get(key);
        if (gd1Var == null) {
            return null;
        }
        return (T) gd1Var.getValue();
    }

    public final <T> ServiceKey single(String named, sr0 instance) {
        named.getClass();
        instance.getClass();
        s71.C();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(@NotNull ServiceKey key, @NotNull gd1 instance) {
        key.getClass();
        instance.getClass();
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
        } else {
            e32.h(key, "Cannot have multiple identical services: ");
        }
    }
}
