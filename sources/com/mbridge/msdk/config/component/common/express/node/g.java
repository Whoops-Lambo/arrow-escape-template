package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class g extends d {
    d a;
    d b;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.a.a(dVar, eVar, aVar);
        Object objA2 = this.b.a(dVar, eVar, aVar);
        HashMap map = new HashMap();
        map.put(objA, objA2);
        return map;
    }

    public g(d dVar, d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }
}
