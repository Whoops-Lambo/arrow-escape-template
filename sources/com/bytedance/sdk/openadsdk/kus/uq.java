package com.bytedance.sdk.openadsdk.kus;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.uq.twf;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class uq {
    private twf ahm;
    private final HashSet<String> ct = new HashSet<>();
    private String kgy;
    private volatile boolean rz;
    private volatile long uq;

    private boolean ct() {
        return this.rz && this.uq != 0 && System.currentTimeMillis() - this.uq <= 5000;
    }

    private boolean rz(String str) {
        if (str != null) {
            return str.startsWith("intent://") || str.startsWith("market://") || str.contains("play.google.com/store");
        }
        return false;
    }

    private boolean uq(String str) {
        return !TextUtils.equals(this.kgy, str);
    }

    public uq(twf twfVar) {
        this.ahm = twfVar;
    }

    public void ahm(String str) {
        long jCurrentTimeMillis;
        twf twfVar;
        if (uq() && !TextUtils.isEmpty(str) && rz(str) && !this.ct.contains(str)) {
            this.ct.add(str);
            boolean zAhm = ahm();
            boolean zCt = ct();
            boolean zUq = uq(str);
            if (zAhm) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.uq;
            } else {
                jCurrentTimeMillis = -1;
            }
            if (zUq && !zCt && (twfVar = this.ahm) != null) {
                twfVar.kgy(this.kgy, str, jCurrentTimeMillis);
            }
        }
    }

    public void kgy(String str) {
        long jCurrentTimeMillis;
        twf twfVar;
        if (uq() && !TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.kgy)) {
                this.kgy = str;
            }
            if (rz(str) && !this.ct.contains(str)) {
                this.ct.add(str);
                boolean zAhm = ahm();
                boolean zCt = ct();
                if (zAhm) {
                    jCurrentTimeMillis = System.currentTimeMillis() - this.uq;
                } else {
                    jCurrentTimeMillis = -1;
                }
                if (!zCt && (twfVar = this.ahm) != null) {
                    twfVar.kgy(this.kgy, str, jCurrentTimeMillis);
                }
            }
        }
    }

    public boolean uq() {
        return com.bytedance.sdk.openadsdk.utils.ahm.uq();
    }

    public void rz() {
        this.kgy = null;
        this.uq = 0L;
        this.rz = false;
        this.ct.clear();
    }

    public boolean ahm() {
        return this.rz;
    }

    public void kgy() {
        if (uq()) {
            this.uq = System.currentTimeMillis();
            this.rz = true;
        }
    }
}
