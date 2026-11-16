package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c extends d {
    String a;
    d b;
    d c;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.b.a(dVar, eVar, aVar);
        Object objA2 = this.c.a(dVar, eVar, aVar);
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(objA2);
            return dVar.a(objA, arrayList, this.a, aVar);
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        if (!(objA instanceof com.mbridge.msdk.config.component.common.express.entities.a)) {
            return null;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) objA;
        String strA = aVar3.a();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(objA2);
        Object objA3 = dVar.a(aVar3, arrayList2, this.a, aVar);
        aVar2.a(strA);
        aVar2.a(objA3);
        return aVar2;
    }

    public c(String str, d dVar, d dVar2) {
        this.a = str;
        this.b = dVar;
        this.c = dVar2;
    }
}
