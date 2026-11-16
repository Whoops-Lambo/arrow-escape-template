package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import com.vungle.ads.internal.ui.view.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ f6(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.p0;
                ((AndroidComposeView) viewGroup).F();
                break;
            default:
                d.a((d) viewGroup);
                break;
        }
    }
}
