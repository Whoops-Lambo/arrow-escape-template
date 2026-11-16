package com.mbridge.msdk.config.component.asy;

import com.mbridge.msdk.config.component.base.b;
import com.mbridge.msdk.config.component.base.c;
import com.mbridge.msdk.config.component.base.d;
import defpackage.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class AsyCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements c {
        final String a;

        public a(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(b bVar) {
        c("923002", new HashMap(), bVar);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public List<d> a(c cVar, b bVar) {
        ArrayList arrayList = new ArrayList();
        if (!(cVar instanceof a)) {
            return arrayList;
        }
        com.mbridge.msdk.config.component.asy.a.a(((a) cVar).a, new q4(10, this, bVar));
        arrayList.addAll(a(b("923003", new HashMap(), bVar)));
        return arrayList;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public c c(Map<String, Object> map) {
        this.f = "923001";
        Object obj = map.get(com.mbridge.msdk.config.component.common.util.c.c("207"));
        return new a(obj != null ? String.valueOf(obj) : "");
    }
}
