package defpackage;

import android.view.ViewTreeObserver;
import com.adsurge.adn.p053r.k;
import com.adsurge.adn.p053r.l;
import com.inmobi.media.Qq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j12 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j12(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Qq.a((lz1) obj, z);
                break;
            case 1:
                ((k) obj).c(z);
                break;
            default:
                ((l) obj).c(z);
                break;
        }
    }
}
