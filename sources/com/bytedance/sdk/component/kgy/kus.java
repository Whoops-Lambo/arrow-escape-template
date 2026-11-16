package com.bytedance.sdk.component.kgy;

import android.text.TextUtils;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kus {
    public final String ahm;
    public final String ct;
    public final String fi;
    public final int kgy;
    public final String noq;
    public final String rz;
    public final String uq;
    public final String yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        private String ahm;
        private String ct;
        private String kgy;
        private String noq;
        private String rz;
        private String uq;
        private String yo;

        public kus kgy() {
            return new kus(this);
        }

        public kgy ahm(String str) {
            this.ahm = str;
            return this;
        }

        public kgy ct(String str) {
            this.ct = str;
            return this;
        }

        public kgy noq(String str) {
            this.noq = str;
            return this;
        }

        public kgy rz(String str) {
            this.rz = str;
            return this;
        }

        public kgy uq(String str) {
            this.uq = str;
            return this;
        }

        public kgy yo(String str) {
            this.yo = str;
            return this;
        }

        private kgy() {
        }

        public kgy kgy(String str) {
            this.kgy = str;
            return this;
        }
    }

    public static boolean kgy(kus kusVar) {
        return kusVar == null || kusVar.kgy != 1 || TextUtils.isEmpty(kusVar.uq) || TextUtils.isEmpty(kusVar.ct);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("methodName: ");
        sb.append(this.uq);
        sb.append(", params: ");
        sb.append(this.ct);
        sb.append(", callbackId: ");
        sb.append(this.noq);
        sb.append(", type: ");
        sb.append(this.rz);
        sb.append(", version: ");
        return nj.q(sb, this.ahm, ", ");
    }

    private kus(kgy kgyVar) {
        this.ahm = kgyVar.kgy;
        this.rz = kgyVar.ahm;
        this.uq = kgyVar.rz;
        this.ct = kgyVar.uq;
        this.noq = kgyVar.ct;
        this.yo = kgyVar.noq;
        this.kgy = 1;
        this.fi = kgyVar.yo;
    }

    public static kus kgy(String str, int i) {
        return new kus(str, i);
    }

    public static kgy kgy() {
        return new kgy();
    }

    private kus(String str, int i) {
        this.ahm = null;
        this.rz = null;
        this.uq = null;
        this.ct = null;
        this.noq = str;
        this.yo = null;
        this.kgy = i;
        this.fi = null;
    }
}
