package com.bytedance.adsdk.ahm;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ra {
    private final int ahm;
    private final String ct;
    private final String fi;
    private final int[][] gf;
    private final int kgy;
    private final String noq;
    private Bitmap nu;
    private final JSONArray ra;
    private final String rz;
    private final String uq;
    private final List<kgy> yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public int ahm;
        public int ct;
        public int kgy;
        public int noq;
        public String rz;
        public String uq;
        public String yo;
    }

    public int ahm() {
        return this.ahm;
    }

    public String ct() {
        return this.fi;
    }

    public String fi() {
        return this.rz;
    }

    public String gf() {
        return this.uq;
    }

    public int kgy() {
        return this.kgy;
    }

    public int[][] noq() {
        return this.gf;
    }

    public Bitmap nu() {
        return this.nu;
    }

    public String ra() {
        return this.ct;
    }

    public List<kgy> rz() {
        return this.yo;
    }

    public String uq() {
        return this.noq;
    }

    public JSONArray yo() {
        return this.ra;
    }

    public ra(int i, int i2, String str, String str2, String str3, String str4, List<kgy> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.kgy = i;
        this.ahm = i2;
        this.rz = str;
        this.uq = str2;
        this.ct = str3;
        this.noq = str4;
        this.yo = list;
        this.fi = str5;
        this.gf = iArr;
        this.ra = jSONArray;
    }

    public void kgy(Bitmap bitmap) {
        this.nu = bitmap;
    }
}
