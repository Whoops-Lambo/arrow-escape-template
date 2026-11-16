package defpackage;

import com.inmobi.media.AbstractC4230n1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class lf3 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC4230n1 b;

    public /* synthetic */ lf3(AbstractC4230n1 abstractC4230n1, int i) {
        this.a = i;
        this.b = abstractC4230n1;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        AbstractC4230n1 abstractC4230n1 = this.b;
        switch (i) {
            case 0:
                return AbstractC4230n1.d(abstractC4230n1);
            case 1:
                return AbstractC4230n1.e(abstractC4230n1);
            default:
                return AbstractC4230n1.a(abstractC4230n1);
        }
    }
}
