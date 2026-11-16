package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import defpackage.dt1;
import defpackage.eu;
import defpackage.qh1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements h {

    @NotNull
    public final Map<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d> a = new LinkedHashMap();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h
    @NotNull
    public List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d> q() {
        List listE0 = qh1.e0(this.a);
        ArrayList arrayList = new ArrayList(eu.f(listE0, 10));
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            arrayList.add((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) ((dt1) it.next()).b);
        }
        return arrayList;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar) {
        dVar.getClass();
        this.a.put(dVar.a, dVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar) {
        cVar.getClass();
        this.a.remove(cVar);
    }
}
