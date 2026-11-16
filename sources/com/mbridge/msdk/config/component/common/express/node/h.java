package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class h extends d {
    List<d> a;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        HashMap map = new HashMap();
        Iterator<d> it = this.a.iterator();
        while (it.hasNext()) {
            Object objA = it.next().a(dVar, eVar, aVar);
            map.putAll(objA instanceof Map ? (Map) objA : new HashMap());
        }
        return map;
    }

    public h(List<d> list) {
        this.a = list;
    }
}
