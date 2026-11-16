package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends d {
    List<d> a;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a(dVar, eVar, aVar));
        }
        return arrayList;
    }

    public a(List<d> list) {
        this.a = list;
    }
}
