package defpackage;

import com.inmobi.media.Oa;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qr1 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Oa b;

    public /* synthetic */ qr1(Oa oa, int i) {
        this.a = i;
        this.b = oa;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        Oa oa = this.b;
        switch (i) {
            case 0:
                return Oa.a(oa, "IncompleteLogFinalizer");
            default:
                return Oa.a(oa);
        }
    }
}
