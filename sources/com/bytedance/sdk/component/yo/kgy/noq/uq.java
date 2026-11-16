package com.bytedance.sdk.component.yo.kgy.noq;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class uq {
    private final String ahm;
    private boolean at;
    private final int ct;
    private String fi;
    private final String kgy;
    private final String noq;
    private boolean nu;
    private final boolean rz;
    private String yo;
    private int uq = -1;
    private int gf = 0;
    private String ra = null;

    public void ahm(int i) {
        this.gf = i;
        if (i == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.yo)) {
            this.yo = String.valueOf(this.gf);
            return;
        }
        this.yo += "," + this.gf;
    }

    public boolean at() {
        return this.at;
    }

    public int ct() {
        return this.ct;
    }

    public int fi() {
        return this.gf;
    }

    public String gf() {
        return this.fi;
    }

    public String noq() {
        return this.noq;
    }

    public boolean nu() {
        return this.uq == -1;
    }

    public boolean ra() {
        return this.nu;
    }

    public void rz(String str) {
        this.ra = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.fi)) {
            this.fi = String.valueOf(this.ra);
            return;
        }
        this.fi += "," + this.ra;
    }

    public int uq() {
        return this.uq;
    }

    public String yo() {
        return this.yo;
    }

    public uq(String str, String str2, boolean z, int i, String str3) {
        this.kgy = str;
        this.ahm = str2;
        this.rz = z;
        this.ct = i;
        this.noq = str3;
    }

    public Runnable kgy(String str, Map<String, String> map) {
        return kgy.kgy().kgy(this, str, map);
    }

    public void kgy(int i) {
        this.uq = i;
    }

    public void kgy(String str) {
        this.yo = str;
    }

    public void kgy(boolean z) {
        this.nu = z;
    }

    public String kgy() {
        return this.kgy;
    }

    public String ahm() {
        return this.ahm;
    }

    public void ahm(String str) {
        this.fi = str;
    }

    public void ahm(boolean z) {
        this.at = z;
    }

    public boolean rz() {
        return this.rz;
    }
}
