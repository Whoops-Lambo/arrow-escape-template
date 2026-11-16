package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import com.inmobi.media.C4009f3;
import com.inmobi.media.r;
import com.ironsource.C5006u6;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ax0 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ ax0(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                ((MutablePreferences) obj).f(bx0.b, Long.valueOf(j));
                return null;
            case 1:
                return r.a(j, (C4009f3) obj);
            default:
                return C5006u6.a(j, (C5006u6) obj);
        }
    }
}
