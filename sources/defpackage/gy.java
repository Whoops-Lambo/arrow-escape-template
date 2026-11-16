package defpackage;

import android.window.OnBackInvokedCallback;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.ironsource.sdk.controller.ControllerActivity;
import com.mbridge.msdk.config.activity.backdispatcher.b;
import com.vungle.ads.internal.ui.l;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gy implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ControllerActivity) obj).g();
                break;
            case 1:
                InMobiAdActivity.a((InMobiAdActivity) obj);
                break;
            case 2:
                ((sr0) obj).invoke();
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                ((b) obj).a();
                break;
            default:
                l.b((l) obj);
                break;
        }
    }
}
