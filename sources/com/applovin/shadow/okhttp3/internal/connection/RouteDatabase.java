package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.Route;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/RouteDatabase;", "", "<init>", "()V", "Lcom/applovin/shadow/okhttp3/Route;", "failedRoute", "Laz2;", "failed", "(Lcom/applovin/shadow/okhttp3/Route;)V", "route", AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED, "", "shouldPostpone", "(Lcom/applovin/shadow/okhttp3/Route;)Z", "", "failedRoutes", "Ljava/util/Set;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RouteDatabase {

    @NotNull
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(@NotNull Route route) {
        route.getClass();
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(@NotNull Route failedRoute) {
        failedRoute.getClass();
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean shouldPostpone(@NotNull Route route) {
        route.getClass();
        return this.failedRoutes.contains(route);
    }
}
