package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import com.inmobi.media.C4276oj;
import com.inmobi.media.N0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ N0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C4276oj e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ rp1(N0 n0, KeyEvent.Callback callback, long j, boolean z, C4276oj c4276oj, int i) {
        this.a = i;
        this.b = n0;
        this.f = callback;
        this.c = j;
        this.d = z;
        this.e = c4276oj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        KeyEvent.Callback callback = this.f;
        switch (i) {
            case 0:
                boolean z = this.d;
                C4276oj c4276oj = this.e;
                N0.a(this.b, (View) callback, this.c, z, c4276oj);
                break;
            default:
                boolean z2 = this.d;
                C4276oj c4276oj2 = this.e;
                N0.a(this.b, (Activity) callback, this.c, z2, c4276oj2);
                break;
        }
    }
}
