package com.bykv.vk.openvk.preload.a;

import defpackage.e32;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {
    private Map<String, a> d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        List<h> a = new ArrayList();

        public final a a(h hVar) {
            this.a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.a.addAll(list);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        private Map<String, a> a = new HashMap();
        private com.bykv.vk.openvk.preload.a.b.a b;

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.a).a(this.b).b();
        }

        public final a a(String str) {
            if (!this.a.containsKey(str)) {
                a aVar = new a();
                this.a.put(str, aVar);
                return aVar;
            }
            defpackage.d.r("duplicated branch name");
            return null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.d = (Map) obj;
                return;
            } catch (ClassCastException e) {
                defpackage.d.n(e);
                return;
            }
        }
        e32.i("args error");
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && ((h) pv1.i(1, list)).a == f.class;
    }

    public final Map<String, a> a() {
        return this.d;
    }
}
