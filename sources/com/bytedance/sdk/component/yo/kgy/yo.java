package com.bytedance.sdk.component.yo.kgy;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class yo {
    private static yo at;
    private static volatile com.bytedance.sdk.component.yo.kgy.ct.kgy gf;
    private volatile com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy ahm;
    private volatile com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy ct;
    private volatile ct fi;
    private volatile Context kgy;
    private long kus;
    private volatile com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy noq;
    private volatile Map<Integer, com.bytedance.sdk.component.yo.kgy.ahm.rz> nu;
    private volatile com.bytedance.sdk.component.yo.kgy.ahm.rz ra;
    private volatile com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy rz;
    private final AtomicBoolean twf = new AtomicBoolean(false);
    private volatile com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy uq;
    private volatile com.bytedance.sdk.component.yo.kgy.kgy.ct yo;

    public static synchronized yo noq() {
        try {
            if (at == null) {
                at = new yo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return at;
    }

    public static com.bytedance.sdk.component.yo.kgy.ct.kgy uq() {
        if (gf == null) {
            synchronized (yo.class) {
                try {
                    if (gf == null) {
                        gf = new com.bytedance.sdk.component.yo.kgy.ct.ahm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return gf;
    }

    public Map<Integer, com.bytedance.sdk.component.yo.kgy.ahm.rz> ahm() {
        return this.nu;
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy at() {
        return this.rz;
    }

    public Context ct() {
        return this.kgy;
    }

    public long dg() {
        return this.kus * 86400000;
    }

    public void fi() {
        com.bytedance.sdk.component.yo.kgy.ahm.uq.kgy.ahm();
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy gf() {
        return this.noq;
    }

    public void kgy(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar) {
        if (kgyVar == null) {
            return;
        }
        kgyVar.kgy(System.currentTimeMillis());
        com.bytedance.sdk.component.yo.kgy.ahm.uq.kgy.kgy(kgyVar, kgyVar.uq());
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kus() {
        return this.ct;
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy nu() {
        return this.ahm;
    }

    public void ra() {
        com.bytedance.sdk.component.yo.kgy.ahm.uq.kgy.rz();
    }

    public com.bytedance.sdk.component.yo.kgy.kgy.ct rz() {
        return this.yo;
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy twf() {
        return this.uq;
    }

    public ct vs() {
        return this.fi;
    }

    public com.bytedance.sdk.component.yo.kgy.ahm.rz yo() {
        return this.ra;
    }

    private yo() {
    }

    public void ahm(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        this.ahm = kgyVar;
    }

    public void ct(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        this.ct = kgyVar;
    }

    public void rz(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        this.rz = kgyVar;
    }

    public void kgy(boolean z) {
        this.twf.set(z);
    }

    public void kgy(com.bytedance.sdk.component.yo.kgy.kgy.ct ctVar) {
        this.yo = ctVar;
    }

    public void kgy(Context context) {
        this.kgy = context;
    }

    public void kgy(com.bytedance.sdk.component.yo.kgy.ahm.rz rzVar) {
        this.ra = rzVar;
    }

    public void kgy(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        this.noq = kgyVar;
    }

    public boolean kgy() {
        return this.twf.get();
    }

    public void kgy(String str, boolean z) {
        com.bytedance.sdk.component.yo.kgy.noq.kgy.kgy().kgy(str, z);
    }

    public void kgy(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.yo.kgy.noq.kgy.kgy().kgy(str, list, z, map, i, str2);
    }

    public void kgy(ct ctVar) {
        this.fi = ctVar;
    }

    public void uq(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
        this.uq = kgyVar;
    }

    public void kgy(long j) {
        this.kus = j;
    }
}
