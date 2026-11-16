package com.bytedance.sdk.openadsdk.fpz.kgy;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.mw;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    private final ioy ahm;
    private int kgy = rz.ahm;
    private final AtomicBoolean rz = new AtomicBoolean(false);
    private final AtomicBoolean uq = new AtomicBoolean(true);
    private final AtomicInteger ct = new AtomicInteger(0);
    private long noq = 0;
    private long yo = 0;
    private final Runnable fi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.fpz.kgy.ahm.3
        @Override // java.lang.Runnable
        public void run() {
            ahm.this.uq();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void ct() {
        if (this.ct.get() == 2) {
            this.noq = SystemClock.elapsedRealtime();
            Handler handlerKgy = kgy.kgy();
            if (handlerKgy != null) {
                handlerKgy.postDelayed(this.fi, ((long) this.kgy) - this.yo);
            }
            this.ct.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void noq() {
        if (this.ct.get() != 1 || this.noq == 0) {
            return;
        }
        Handler handlerKgy = kgy.kgy();
        if (handlerKgy != null) {
            handlerKgy.removeCallbacks(this.fi);
        }
        this.yo = (SystemClock.elapsedRealtime() - this.noq) + this.yo;
        this.noq = 0L;
        this.ct.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq() {
        if (this.rz.compareAndSet(false, true)) {
            ahm();
            final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.noq) + this.yo;
            this.yo = jElapsedRealtime;
            mw.ahm(new com.bytedance.sdk.component.gf.ahm.rz("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.fpz.kgy.ahm.1
                @Override // java.lang.Runnable
                public void run() {
                    String strKgy = ftg.kgy(ahm.this.ahm);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", ahm.this.ahm.thv() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5gDoStQoCiD", "a88KsBWIe8aDQdJPyEA=", "Sfsj", 73);
                        sx.rz("EvTracker", e.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.uq.rz.ahm(ahm.this.ahm, strKgy, ahm.this.ahm.is(), jSONObject);
                }
            });
        }
    }

    public void ahm() {
        this.ct.set(3);
        Handler handlerKgy = kgy.kgy();
        if (handlerKgy != null) {
            handlerKgy.removeCallbacks(this.fi);
        }
    }

    public void kgy() {
        if (this.ct.get() != 0) {
            return;
        }
        this.kgy = this.ahm.thv() * 1000;
        this.ct.set(1);
        this.noq = SystemClock.elapsedRealtime();
        Handler handlerKgy = kgy.kgy();
        if (handlerKgy != null) {
            handlerKgy.postDelayed(this.fi, this.kgy);
        }
    }

    public boolean rz() {
        return this.ct.get() == 3;
    }

    public ahm(ioy ioyVar) {
        this.ahm = ioyVar;
    }

    public void kgy(final int i) {
        Handler handlerKgy;
        if (this.ct.get() == 3 || (handlerKgy = kgy.kgy()) == null) {
            return;
        }
        handlerKgy.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fpz.kgy.ahm.2
            @Override // java.lang.Runnable
            public void run() {
                if (i == 4 && ahm.this.uq.get()) {
                    ahm.this.ct();
                    return;
                }
                int i2 = i;
                if (i2 == 8) {
                    ahm.this.noq();
                } else if (i2 == 5) {
                    ahm.this.uq();
                }
            }
        });
    }

    public void kgy(boolean z) {
        this.uq.set(z);
    }
}
