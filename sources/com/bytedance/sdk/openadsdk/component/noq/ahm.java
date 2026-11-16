package com.bytedance.sdk.openadsdk.component.noq;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.fpz.rz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm implements Handler.Callback {
    private final com.bytedance.sdk.openadsdk.component.fi.kgy ahm;
    private boolean at;
    private long nu;
    private long ra;
    private kgy rz;
    private boolean yo;
    private Handler kgy = new Handler(Looper.myLooper(), this);
    private int uq = 0;
    private int ct = 5;
    private int noq = 0;
    private final int fi = 1000;
    private int gf = 1000;

    public void kgy(int i, float f, boolean z) {
        com.bytedance.sdk.openadsdk.component.fi.kgy kgyVar;
        if ((i == 1 || i == 2) && this.at != z) {
            this.at = z;
            if (i == 1 && (kgyVar = this.ahm) != null) {
                kgyVar.kgy(z);
            }
            if (z) {
                try {
                    this.gf = (int) (1000.0f / f);
                    this.nu = System.currentTimeMillis();
                    return;
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48erThU4CibF/J9yJA=", "b9oMhROTecKOa9NpgwGMKULhOIEruWXXhVg=", "VOAMlgC5ZcKSS8NY", 153);
                }
            } else {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.nu) + this.ra;
                this.ra = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.fi.kgy kgyVar2 = this.ahm;
                if (kgyVar2 != null) {
                    kgyVar2.kgy(jCurrentTimeMillis);
                }
            }
            this.gf = 1000;
        }
    }

    public void ahm() {
        Handler handler = this.kgy;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.ct, 0));
        }
    }

    public void ct() {
        this.kgy.removeCallbacksAndMessages(null);
        this.kgy = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.kgy != null) {
            int i = message.arg1;
            kgy(i);
            if (i > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i - 1;
                this.kgy.sendMessageDelayed(messageObtain, this.gf);
            }
        }
        return true;
    }

    public void rz() {
        if (this.kgy != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.uq;
            this.kgy.sendMessage(messageObtain);
        }
    }

    public void uq() {
        Handler handler = this.kgy;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public ahm(com.bytedance.sdk.openadsdk.component.fi.kgy kgyVar) {
        this.ahm = kgyVar;
    }

    public void ahm(int i) {
        this.noq = Math.min(i, this.ct);
    }

    public void kgy(float f) {
        int i = (int) f;
        this.ct = i;
        if (i <= 0) {
            this.ct = 5;
        }
    }

    public void kgy(kgy kgyVar) {
        this.rz = kgyVar;
    }

    public int kgy() {
        return this.noq;
    }

    public void kgy(int i) {
        this.uq = i;
        int i2 = this.ct - i;
        this.ahm.ahm(((long) i2) * 1000);
        boolean z = true;
        if (i <= 0) {
            kgy kgyVar = this.rz;
            if (kgyVar != null && !this.yo) {
                kgyVar.rz();
                this.yo = true;
            }
            i = 0;
        }
        kgy kgyVar2 = this.rz;
        if (kgyVar2 != null) {
            int iMax = Math.max(this.noq - i2, 0);
            if (i != 0 && i2 < this.noq) {
                z = false;
            }
            kgyVar2.kgy(iMax, z);
        }
    }
}
