package com.mbridge.msdk.config.component.common.express.node;

import defpackage.vq2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b extends d {
    private static final Set<String> d;
    String a;
    d b;
    d c;

    static {
        Object[] objArr = {"=", "+=", "-=", "*=", "/=", "%="};
        HashSet hashSet = new HashSet(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                vq2.r(obj, "duplicate element: ");
                return;
            }
        }
        d = Collections.unmodifiableSet(hashSet);
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object objA2 = this.c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objA2);
        return dVar.a(objA, arrayList, this.a, aVar);
    }

    public b(String str, d dVar, d dVar2) {
        this.a = str;
        this.b = dVar;
        this.c = dVar2;
    }
}
