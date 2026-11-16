package com.adsurge.adn.oversea_ad;

import android.view.MotionEvent;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class y0 extends Cnew {
    public final String b;
    public final Ccontinue c;

    @Override // com.adsurge.adn.oversea_ad.Cnew, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Ccontinue ccontinue = this.c;
        String str = this.b;
        if (!ccontinue.a.get()) {
            Cherry cherryA = Cherry.a(str, motionEvent);
            ccontinue.b.obtainMessage(2, cherryA).sendToTarget();
            if (Eridanus.d.get() && cherryA.e == 0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public y0(Window.Callback callback, String str, Ccontinue ccontinue) {
        super(callback);
        this.b = str;
        this.c = ccontinue;
    }
}
