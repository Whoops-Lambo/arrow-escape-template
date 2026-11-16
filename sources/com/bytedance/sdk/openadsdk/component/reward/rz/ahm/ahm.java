package com.bytedance.sdk.openadsdk.component.reward.rz.ahm;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.ft;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ahm implements ft.kgy {
    private kgy ahm;
    private long rz;
    private long uq;
    private Handler kgy = new ft(this);
    private boolean ct = false;
    private boolean noq = false;
    private int yo = 10000;
    private int fi = 10000;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.rz.ahm.ahm$ahm, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC0234ahm {
        NORMAL,
        TIMEOUT,
        DISCONNECTED
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy();

        void kgy(EnumC0234ahm enumC0234ahm);
    }

    private void rz() {
        if (!this.ct || this.ahm == null) {
            return;
        }
        this.rz = System.currentTimeMillis();
        this.noq = true;
        this.ahm.kgy();
        this.kgy.removeMessages(2);
        this.kgy.sendEmptyMessageDelayed(2, this.fi);
        this.kgy.removeMessages(1);
        this.kgy.sendEmptyMessageDelayed(1, this.yo);
    }

    private void uq() {
        if (this.ct && this.noq && System.currentTimeMillis() - this.rz >= this.yo) {
            this.noq = false;
            kgy kgyVar = this.ahm;
            if (kgyVar != null) {
                kgyVar.kgy(EnumC0234ahm.TIMEOUT);
            }
            kgy();
        }
    }

    public void ahm() {
        if (this.ct && this.noq) {
            this.uq = System.currentTimeMillis();
            this.noq = false;
            this.kgy.removeMessages(2);
            kgy kgyVar = this.ahm;
            if (kgyVar != null) {
                kgyVar.kgy(EnumC0234ahm.NORMAL);
            }
        }
    }

    public void kgy(kgy kgyVar) {
        if (this.ct) {
            return;
        }
        this.ahm = kgyVar;
        this.ct = true;
        this.noq = false;
        this.kgy.sendEmptyMessage(1);
        if (kgyVar != null) {
            kgyVar.kgy(EnumC0234ahm.NORMAL);
        }
    }

    public void kgy(int i) {
        this.yo = i;
    }

    public void kgy() {
        this.ct = false;
        this.noq = false;
        this.kgy.removeMessages(1);
        this.kgy.removeMessages(2);
        this.ahm = null;
    }

    @Override // com.bytedance.sdk.component.utils.ft.kgy
    public void kgy(Message message) {
        int i = message.what;
        if (i == 1) {
            rz();
        } else {
            if (i != 2) {
                return;
            }
            uq();
        }
    }

    public void ahm(int i) {
        this.fi = i;
    }
}
