package io.p071bidmachine.util.download;

import defpackage.j52;
import defpackage.k52;
import defpackage.rc1;
import defpackage.xe0;
import defpackage.zr0;
import io.p071bidmachine.rendering.internal.event.k;
import io.p071bidmachine.util.network.b;
import io.p071bidmachine.util.network.f;
import io.p071bidmachine.util.r;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends rc1 implements zr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ j j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, String str, int i) {
        super(2);
        this.i = i;
        this.j = jVar;
        this.k = str;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        String str = this.k;
        j jVar = this.j;
        switch (i) {
            case 0:
                f fVar = (f) obj;
                File file = (File) obj2;
                jVar.b.c("DownloadManager", new k(str, 4));
                b bVar = null;
                xe0 xe0Var = fVar != null ? fVar.k : null;
                if (file != null && xe0Var != null) {
                    bVar = new b(xe0Var.a, file);
                }
                return new k52(bVar);
            default:
                b bVar2 = (b) obj2;
                bVar2.getClass();
                jVar.b.b("DownloadManager", new r(2, bVar2, str));
                return new k52(new j52(bVar2.a));
        }
    }
}
