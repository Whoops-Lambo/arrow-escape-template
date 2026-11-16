package defpackage;

import android.view.View;
import com.inmobi.media.Mj;
import com.inmobi.media.Up;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s03 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ s03(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        View view = this.b;
        Mj mj = (Mj) obj;
        switch (i) {
            case 0:
                return Up.a(view, mj);
            default:
                return Up.b(view, mj);
        }
    }
}
