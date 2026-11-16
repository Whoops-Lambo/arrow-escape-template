package defpackage;

import com.ironsource.A;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ A b;

    public /* synthetic */ j(A a, int i) {
        this.a = i;
        this.b = a;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        A a = this.b;
        switch (i) {
            case 0:
                return A.d(a);
            case 1:
                return A.b(a);
            default:
                return A.a(a);
        }
    }
}
