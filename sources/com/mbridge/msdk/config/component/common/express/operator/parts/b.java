package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b implements Callable {
    private d a;
    private e b;
    private com.mbridge.msdk.config.component.common.express.node.d c;
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a d;

    public void a(Object obj) {
        this.d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.c.a(this.a, this.b, this.d);
    }

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.c = dVar2;
        this.a = dVar;
        this.b = eVar;
        this.d = aVar;
    }
}
