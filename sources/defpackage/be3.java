package defpackage;

import com.inmobi.media.AbstractC4230n1;
import com.inmobi.media.B6;
import com.inmobi.media.C4118j1;
import com.inmobi.media.C4174l1;
import com.inmobi.media.X;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class be3 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC4230n1 b;

    public /* synthetic */ be3(AbstractC4230n1 abstractC4230n1, int i) {
        this.a = i;
        this.b = abstractC4230n1;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        AbstractC4230n1 abstractC4230n1 = this.b;
        switch (i) {
            case 0:
                return C4118j1.a(abstractC4230n1, (X) obj);
            case 1:
                return C4174l1.a(abstractC4230n1, (X) obj);
            default:
                return AbstractC4230n1.a(abstractC4230n1, (B6) obj);
        }
    }
}
