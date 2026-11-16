package com.bykv.vk.openvk.preload.a;

import defpackage.d10;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class i implements b {
    protected e a;
    private int b;
    private List<h> c;
    private d d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    private d c(Class cls) {
        d dVar = this.d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.d;
        if (dVar != null) {
            dVar.c = obj;
            dVar.e();
        }
        if (this.b >= this.c.size()) {
            return obj;
        }
        h hVar = this.c.get(this.b);
        Class<? extends d> cls = hVar.a;
        d dVar2 = (d) this.a.a(cls);
        if (dVar2 == null) {
            d10.c("interceptor == null , index = ", obj, " , class: ", cls);
            return null;
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.c, this.b + 1, this.a, dVar2);
        dVar2.a(iVar, this.d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e) {
            dVar2.c(e.getCause());
            throw e;
        } catch (Throwable th) {
            dVar2.b(th);
            throw new a(th);
        }
    }

    public i(List<h> list, int i, e eVar, d dVar) {
        this.c = list;
        this.b = i;
        this.a = eVar;
        this.d = dVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.c;
        }
        defpackage.d.r("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
        return null;
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.b;
        }
        defpackage.d.r("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
        return null;
    }
}
