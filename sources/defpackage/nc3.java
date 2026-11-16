package defpackage;

import com.applovin.impl.u7;
import com.inmobi.media.AbstractC4081hj;
import com.inmobi.media.AbstractC4333qk;
import com.mbridge.msdk.config.component.common.util.d;
import io.p071bidmachine.AdRequest;
import io.p071bidmachine.SessionManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nc3 implements Runnable {
    public final /* synthetic */ int a;

    private final void a() {
    }

    private final void c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d.b();
                break;
            case 1:
                AbstractC4081hj.c();
                break;
            case 2:
                AdRequest.lambda$build$1();
                break;
            case 3:
                AdRequest.lambda$build$4();
                break;
            case 4:
                try {
                    SessionManager.get().resume();
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 5:
                try {
                    SessionManager.get().pause();
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 6:
            case 7:
                break;
            case 8:
                u7.c();
                break;
            default:
                AbstractC4333qk.b();
                break;
        }
    }

    public /* synthetic */ nc3(int i) {
        this.a = i;
    }
}
