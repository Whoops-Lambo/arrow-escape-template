package defpackage;

import android.view.ViewTreeObserver;
import com.applovin.impl.j5;
import com.vungle.ads.internal.b1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vb3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vb3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return b1.a((b1) obj);
            default:
                return ((j5) obj).b();
        }
    }
}
