package defpackage;

import com.inmobi.media.V;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q43 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ V b;

    public /* synthetic */ q43(V v, int i) {
        this.a = i;
        this.b = v;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        V v = this.b;
        switch (i) {
            case 0:
                return V.c(v);
            default:
                return V.b(v);
        }
    }
}
