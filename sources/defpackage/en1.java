package defpackage;

import com.inmobi.media.C4263o6;
import com.inmobi.media.C4545yd;
import com.inmobi.media.C4562z3;
import com.inmobi.media.Md;
import com.inmobi.media.Mk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class en1 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Md b;

    public /* synthetic */ en1(Md md, int i) {
        this.a = i;
        this.b = md;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        boolean zA;
        int i = this.a;
        Md md = this.b;
        switch (i) {
            case 0:
                zA = Mk.a(md);
                break;
            case 1:
                zA = C4263o6.a(md);
                break;
            case 2:
                zA = C4545yd.a(md);
                break;
            default:
                zA = C4562z3.a(md);
                break;
        }
        return Boolean.valueOf(zA);
    }
}
