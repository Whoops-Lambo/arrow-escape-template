package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class t extends f {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        Map map = this.b;
        this.c.setOrientationProperties((map != null && map.containsKey("allowOrientationChange") && "false".equals(this.b.get("allowOrientationChange"))) ? false : true, (String) this.b.get("forceOrientation"));
    }

    public t(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}
