package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class J5 implements D0 {
    @NotNull
    public final Map<String, Object> a(@NotNull C4750g0 c4750g0) {
        c4750g0.getClass();
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put(C4671bb.f, c4750g0.a().toString());
        map.put("adf", Integer.valueOf(If.c(c4750g0.a())));
        map.put(C4671bb.i, c4750g0.b().toString());
        map.put("mediationAdUnitId", c4750g0.c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
