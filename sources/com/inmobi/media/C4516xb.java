package com.inmobi.media;

import defpackage.az2;
import defpackage.c91;
import defpackage.cz;
import defpackage.li2;
import defpackage.tb5;
import defpackage.zr0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4516xb {
    public final cz a;
    public final String b;
    public final Map c;

    public C4516xb(cz czVar) {
        czVar.getClass();
        this.a = czVar;
        this.b = "xb";
        this.c = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final void a(String str, zr0 zr0Var) {
        str.getClass();
        zr0Var.getClass();
        li2 li2VarT = tb5.t(this.a, null, null, new C4489wb(zr0Var, null), 3);
        Map map = this.c;
        map.getClass();
        Object copyOnWriteArrayList = map.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(str, copyOnWriteArrayList);
        }
        ((List) copyOnWriteArrayList).add(li2VarT);
        li2VarT.invokeOnCompletion(new defpackage.y5(4, this, str, li2VarT));
    }

    public static final az2 a(C4516xb c4516xb, String str, c91 c91Var, Throwable th) {
        c4516xb.b.getClass();
        List list = (List) c4516xb.c.get(str);
        if (list != null) {
            list.remove(c91Var);
        }
        return az2.a;
    }
}
