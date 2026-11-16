package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzfq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ra implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a = 1;
    public final Handler b;
    public final Object c;

    public ra(o14 o14Var, Handler handler) {
        this.c = o14Var;
        Looper looper = handler.getLooper();
        String str = zzfq.a;
        this.b = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        int i2 = this.a;
        Handler handler = this.b;
        switch (i2) {
            case 0:
                handler.post(new s(i, 1, this));
                break;
            default:
                ei1 ei1Var = new ei1(i, 3, this);
                String str = zzfq.a;
                Looper looper = handler.getLooper();
                if (looper.getThread().isAlive()) {
                    if (looper != Looper.myLooper()) {
                        handler.post(ei1Var);
                    } else {
                        ei1Var.run();
                    }
                    break;
                }
                break;
        }
    }

    public ra(sa saVar, Handler handler) {
        this.c = saVar;
        this.b = handler;
    }
}
