package io.p071bidmachine.rendering.internal.adform.html;

import io.p071bidmachine.rendering.utils.d;
import io.p071bidmachine.util.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements io.p071bidmachine.rendering.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // io.p071bidmachine.rendering.c
    public void e(e eVar) {
        int i = this.a;
        d dVar = this.b;
        eVar.getClass();
        switch (i) {
            case 1:
                dVar.g.b(dVar, eVar);
                break;
            default:
                dVar.g.b(dVar, eVar);
                break;
        }
    }

    @Override // io.p071bidmachine.util.i
    public void onSuccess(Object obj) {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 1:
                String str = (String) obj;
                str.getClass();
                dVar.G(str);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                d.a(new b(dVar, str2, 0));
                break;
        }
    }
}
