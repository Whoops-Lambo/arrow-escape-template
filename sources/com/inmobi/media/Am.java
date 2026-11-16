package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Am;
import java.util.HashMap;
import java.util.Timer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Am {
    public final AbstractC4230n1 a;
    public final HashMap b;

    public final boolean a(byte b, long j) {
        if (this.b.containsKey(Byte.valueOf(b))) {
            a(b);
        }
        try {
            Timer timer = new Timer("Am");
            this.b.put(Byte.valueOf(b), timer);
            timer.schedule(new C4581zm(this, b), j);
            return true;
        } catch (InternalError e) {
            e.toString();
            return false;
        }
    }

    public final void b(final byte b) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: e5
            @Override // java.lang.Runnable
            public final void run() {
                Am.a(this.a, b);
            }
        });
    }

    public Am(AbstractC4230n1 abstractC4230n1) {
        abstractC4230n1.getClass();
        this.a = abstractC4230n1;
        this.b = new HashMap();
    }

    public static final void a(Am am, byte b) {
        am.a.a(b);
    }

    public final void a(byte b) {
        Timer timer = (Timer) this.b.get(Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.b.remove(Byte.valueOf(b));
        }
    }
}
