package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.applovin.impl.k8;
import com.applovin.impl.sdk.l;
import com.inmobi.media.Hq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class kx0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kx0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Hq.a((Hq) obj, view, windowInsets);
            default:
                return k8.a((l) obj, view, windowInsets);
        }
    }
}
