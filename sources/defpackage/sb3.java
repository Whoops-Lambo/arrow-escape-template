package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.adview.b;
import com.applovin.impl.d2;
import com.applovin.impl.f2;
import com.inmobi.media.C4192lj;
import com.inmobi.media.C4491wd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sb3 implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ sb3(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return b.a(view, motionEvent);
            case 1:
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            case 2:
                return d2.a(view, motionEvent);
            case 3:
                return f2.a(view, motionEvent);
            case 4:
                return C4192lj.a(view, motionEvent);
            default:
                return C4491wd.a(view, motionEvent);
        }
    }
}
