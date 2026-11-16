package defpackage;

import com.inmobi.media.InterfaceC4472vl;
import com.inmobi.media.Ll;
import com.inmobi.media.N4;
import com.inmobi.media.Zi;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class df1 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ df1(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        boolean zA;
        int i = this.a;
        Set set = this.b;
        switch (i) {
            case 0:
                zA = Ll.a(set, (InterfaceC4472vl) obj);
                break;
            default:
                zA = Zi.a(set, (N4) obj);
                break;
        }
        return Boolean.valueOf(zA);
    }
}
