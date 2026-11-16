package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class X implements Handler.Callback {
    public final /* synthetic */ Z a;

    public X(Z z) {
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 2269) {
            return false;
        }
        Y y = (Y) message.obj;
        Y y2 = Y.h;
        if (y == y2) {
            Z z = this.a;
            z.g--;
            z.a.executeMainThreadJobs();
            Z z2 = this.a;
            if (!z2.d) {
                return true;
            }
            if (z2.a.getHaveAndroidWindowSupport() && !this.a.e) {
                return true;
            }
            Z z3 = this.a;
            int i = z3.j;
            if (i >= 0) {
                if (i == 0) {
                    if (z3.a.getSplashEnabled()) {
                        this.a.a.disableStaticSplashScreen();
                    }
                    if (this.a.a.shouldReportFullyDrawn()) {
                        this.a.a.reportFullyDrawn();
                    }
                }
                this.a.j--;
            }
            if (!this.a.a.isFinishing() && !this.a.a.nativeRender()) {
                this.a.a.finish();
            }
        } else if (y == Y.c) {
            Looper.myLooper().quit();
        } else if (y == Y.b) {
            this.a.d = true;
        } else if (y == Y.a) {
            this.a.d = false;
        } else if (y == Y.d) {
            this.a.e = false;
        } else if (y == Y.e) {
            Z z4 = this.a;
            z4.e = true;
            if (z4.f == 3 && (!z4.a.getHaveAndroidWindowSupport() || this.a.e)) {
                this.a.a.nativeFocusChanged(true);
                this.a.f = 1;
            }
        } else if (y == Y.f) {
            Z z5 = this.a;
            if (z5.f == 1) {
                z5.a.nativeFocusChanged(false);
            }
            this.a.f = 2;
        } else if (y == Y.g) {
            Z z6 = this.a;
            z6.f = 3;
            if (!z6.a.getHaveAndroidWindowSupport() || this.a.e) {
                this.a.a.nativeFocusChanged(true);
                this.a.f = 1;
            }
        } else if (y == Y.i) {
            Z z7 = this.a;
            z7.a.nativeOrientationChanged(z7.h, z7.i);
        }
        Z z8 = this.a;
        if (z8.d && z8.g <= 0) {
            Message.obtain(z8.c, 2269, y2).sendToTarget();
            this.a.g++;
        }
        return true;
    }
}
