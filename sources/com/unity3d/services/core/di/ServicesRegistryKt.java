package com.unity3d.services.core.di;

import defpackage.wr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/unity3d/services/core/di/ServicesRegistry;", "Laz2;", "registry", "(Lwr0;)Lcom/unity3d/services/core/di/ServicesRegistry;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ServicesRegistryKt {
    @NotNull
    public static final ServicesRegistry registry(@NotNull wr0 wr0Var) {
        wr0Var.getClass();
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        wr0Var.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
