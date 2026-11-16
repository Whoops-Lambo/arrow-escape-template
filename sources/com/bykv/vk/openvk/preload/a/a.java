package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    public abstract String a(IN in);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Exception {
        new m(bVar);
        String strA = a(in);
        l.a aVar = a().get(strA);
        if (aVar == null) {
            defpackage.d.r("can not found branch, branch name is：".concat(String.valueOf(strA)));
            return null;
        }
        List<h> list = aVar.a;
        Object objA = c.a(list, ((i) bVar).a, this).a(in);
        return !l.a(list) ? objA : bVar.a(objA);
    }
}
