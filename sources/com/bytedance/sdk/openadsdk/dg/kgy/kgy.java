package com.bytedance.sdk.openadsdk.dg.kgy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class kgy {
    int ahm;
    float at;
    float ct;
    float dg;
    float fi;
    float gf;
    String kgy;
    int kus;
    int noq;
    float nu;
    int ra;
    float rz;
    float twf;
    float uq;
    String vs;
    int xh;
    float yo;
    int um = -1;
    String fpp = "";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.dg.kgy.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0270kgy {
        kgy kgy = new kgy();

        public C0270kgy ahm(float f) {
            this.kgy.ahm(f);
            return this;
        }

        public C0270kgy ct(float f) {
            this.kgy.ct(f);
            return this;
        }

        public C0270kgy fi(float f) {
            this.kgy.fi(f);
            return this;
        }

        public C0270kgy gf(float f) {
            this.kgy.gf(f);
            return this;
        }

        public C0270kgy kgy(String str) {
            this.kgy.ahm(str);
            return this;
        }

        public C0270kgy noq(float f) {
            this.kgy.noq(f);
            return this;
        }

        public C0270kgy ra(float f) {
            this.kgy.ra(f);
            return this;
        }

        public C0270kgy rz(float f) {
            this.kgy.rz(f);
            return this;
        }

        public C0270kgy uq(float f) {
            this.kgy.uq(f);
            return this;
        }

        public C0270kgy yo(float f) {
            this.kgy.yo(f);
            return this;
        }

        public C0270kgy ahm(int i) {
            this.kgy.ct(i);
            return this;
        }

        public C0270kgy kgy(int i) {
            this.kgy.ahm(i);
            return this;
        }

        public C0270kgy rz(int i) {
            this.kgy.noq(i);
            return this;
        }

        public C0270kgy ahm(String str) {
            this.kgy.rz(str);
            return this;
        }

        public C0270kgy kgy(float f) {
            this.kgy.kgy(f);
            return this;
        }

        public kgy kgy() {
            return this.kgy;
        }
    }

    public String ahm() {
        return this.fpp;
    }

    public int at() {
        return this.ra;
    }

    public float ct() {
        return this.rz;
    }

    public int dg() {
        return this.kus;
    }

    public int fi() {
        return this.noq;
    }

    public int fpp() {
        return this.xh;
    }

    public float gf() {
        return this.yo;
    }

    public int kgy() {
        return this.um;
    }

    public float kus() {
        return this.at;
    }

    public float noq() {
        return this.uq;
    }

    public float nu() {
        return this.gf;
    }

    public float ra() {
        return this.fi;
    }

    public String rz() {
        return this.kgy;
    }

    public float twf() {
        return this.nu;
    }

    public float um() {
        return this.dg;
    }

    public int uq() {
        return this.ahm;
    }

    public BigDecimal vs() {
        return new BigDecimal(this.twf).setScale(3, RoundingMode.HALF_UP);
    }

    public String xh() {
        return this.vs;
    }

    public float yo() {
        return this.ct;
    }

    public void ahm(String str) {
        this.kgy = str;
    }

    public void ct(float f) {
        this.fi = f;
    }

    public void fi(float f) {
        this.at = f;
    }

    public void gf(float f) {
        this.twf = f;
    }

    public void kgy(int i) {
        this.um = i;
    }

    public void noq(float f) {
        this.gf = f;
    }

    public void ra(float f) {
        this.dg = f;
    }

    public void rz(float f) {
        this.ct = f;
    }

    public void uq(float f) {
        this.yo = f;
    }

    public void yo(float f) {
        this.nu = f;
    }

    public void ahm(int i) {
        this.ahm = i;
    }

    public void ct(int i) {
        this.kus = i;
    }

    public void kgy(String str) {
        this.fpp = str;
    }

    public void noq(int i) {
        this.xh = i;
    }

    public void rz(int i) {
        this.noq = i;
    }

    public void uq(int i) {
        this.ra = i;
    }

    public void ahm(float f) {
        this.uq = f;
    }

    public void kgy(float f) {
        this.rz = f;
    }

    public void rz(String str) {
        this.vs = str;
    }
}
