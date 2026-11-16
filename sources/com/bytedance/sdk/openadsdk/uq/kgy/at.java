package com.bytedance.sdk.openadsdk.uq.kgy;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class at {
    public static at kgy = new at();
    private kgy ahm;
    private final Map<String, kgy> rz = new HashMap();
    private volatile boolean uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private final int ahm;
        private final int kgy;

        public int ahm() {
            return this.ahm;
        }

        public int kgy() {
            return this.kgy;
        }

        public kgy(int i, int i2) {
            this.kgy = (i < 0 || i > 5) ? 3 : i;
            this.ahm = i2 < 10 ? 30 : i2;
        }
    }

    private int rz() {
        kgy kgyVar = this.ahm;
        if (kgyVar != null) {
            return kgyVar.ahm();
        }
        return 30;
    }

    public int ahm(String str) {
        kgy kgyVar = this.rz.get(str);
        return kgyVar == null ? rz() : kgyVar.ahm();
    }

    public int kgy(String str) {
        if (!kgy()) {
            return 4;
        }
        kgy kgyVar = this.rz.get(str);
        if (kgyVar == null) {
            return ahm();
        }
        return kgyVar.kgy();
    }

    private int ahm() {
        kgy kgyVar = this.ahm;
        if (kgyVar != null) {
            return kgyVar.kgy();
        }
        return 3;
    }

    public void kgy(String str, kgy kgyVar) {
        if (TextUtils.isEmpty(str) || kgyVar == null) {
            return;
        }
        this.rz.put(str, kgyVar);
    }

    public void kgy(kgy kgyVar) {
        this.ahm = kgyVar;
    }

    public boolean kgy() {
        return this.uq;
    }

    public void kgy(boolean z) {
        this.uq = z;
    }
}
