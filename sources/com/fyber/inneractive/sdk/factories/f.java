package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public final HashMap a = new HashMap();

    public final void a(com.fyber.inneractive.sdk.response.a aVar, e eVar) {
        boolean zContainsKey = this.a.containsKey(aVar);
        HashMap map = this.a;
        if (zContainsKey) {
            IAlog.f("Handler already exists for ad type %s! : %s", aVar, map.get(aVar));
        } else {
            map.put(aVar, eVar);
        }
    }
}
