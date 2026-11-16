package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.adsurge.adn.E1.h;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.vungle.ads.internal.n1;
import com.vungle.ads.internal.ui.view.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x6 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return AndroidWebViewContainer._init_$lambda$1((AndroidWebViewContainer) obj, view, motionEvent);
            case 1:
                we0 we0Var = (we0) obj;
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - we0Var.o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        we0Var.m = false;
                    }
                    we0Var.t();
                    we0Var.m = true;
                    we0Var.o = System.currentTimeMillis();
                }
                return false;
            case 2:
                return ((h) obj).a(view, motionEvent);
            case 3:
                return j.a((j) obj, view, motionEvent);
            default:
                return n1.a((n1) obj, view, motionEvent);
        }
    }
}
