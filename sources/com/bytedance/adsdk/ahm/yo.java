package com.bytedance.adsdk.ahm;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class yo {
    private float at;
    private Map<String, com.bytedance.adsdk.ahm.rz.rz> ct;
    private rz dg;
    private LongSparseArray<com.bytedance.adsdk.ahm.rz.rz.ct> fi;
    private ahm fpp;
    private List<com.bytedance.adsdk.ahm.rz.rz.ct> gf;
    private boolean kus;
    private List<com.bytedance.adsdk.ahm.rz.noq> noq;
    private float nu;
    private Rect ra;
    private Map<String, List<com.bytedance.adsdk.ahm.rz.rz.ct>> rz;
    private float twf;
    private kgy um;
    private Map<String, ra> uq;
    private SparseArray<com.bytedance.adsdk.ahm.rz.uq> yo;
    private final um kgy = new um();
    private final HashSet<String> ahm = new HashSet<>();
    private int vs = 0;
    private String xh = "";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm {
        public int[][] ahm;
        public String kgy;
        public JSONArray rz;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public Map<String, Object> ahm;
        public int ct;
        public int kgy;
        public String noq;
        public Map<String, Object> rz;
        public int uq;
        public JSONArray yo;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class rz {
        public String ahm;
        public int[] ct;
        public int kgy;
        public String noq;
        public String rz;
        public String uq;
        public JSONArray yo;
    }

    public List<com.bytedance.adsdk.ahm.rz.rz.ct> ahm(String str) {
        return this.rz.get(str);
    }

    public float at() {
        return this.twf;
    }

    public Map<String, ra> dg() {
        return this.uq;
    }

    public rz fi() {
        return this.dg;
    }

    public String gf() {
        return this.xh;
    }

    public void kgy(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.ahm.rz.rz.ct> list, LongSparseArray<com.bytedance.adsdk.ahm.rz.rz.ct> longSparseArray, Map<String, List<com.bytedance.adsdk.ahm.rz.rz.ct>> map, Map<String, ra> map2, SparseArray<com.bytedance.adsdk.ahm.rz.uq> sparseArray, Map<String, com.bytedance.adsdk.ahm.rz.rz> map3, List<com.bytedance.adsdk.ahm.rz.noq> list2, rz rzVar, String str, kgy kgyVar, ahm ahmVar) {
        this.ra = rect;
        this.nu = f;
        this.at = f2;
        this.twf = f3;
        this.gf = list;
        this.fi = longSparseArray;
        this.rz = map;
        this.uq = map2;
        this.yo = sparseArray;
        this.ct = map3;
        this.noq = list2;
        this.dg = rzVar;
        this.xh = str;
        this.um = kgyVar;
        this.fpp = ahmVar;
    }

    public SparseArray<com.bytedance.adsdk.ahm.rz.uq> kus() {
        return this.yo;
    }

    public float noq() {
        return this.nu;
    }

    public kgy nu() {
        return this.um;
    }

    public ahm ra() {
        return this.fpp;
    }

    public com.bytedance.adsdk.ahm.rz.noq rz(String str) {
        int size = this.noq.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.ahm.rz.noq noqVar = this.noq.get(i);
            if (noqVar.kgy(str)) {
                return noqVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.ahm.rz.rz.ct> it = this.gf.iterator();
        while (it.hasNext()) {
            sb.append(it.next().kgy("\t"));
        }
        return sb.toString();
    }

    public List<com.bytedance.adsdk.ahm.rz.rz.ct> twf() {
        return this.gf;
    }

    public Rect uq() {
        return this.ra;
    }

    public Map<String, com.bytedance.adsdk.ahm.rz.rz> vs() {
        return this.ct;
    }

    public float xh() {
        return this.at - this.nu;
    }

    public float yo() {
        return this.at;
    }

    public float ct() {
        return (long) ((xh() / this.twf) * 1000.0f);
    }

    public void ahm(boolean z) {
        this.kgy.kgy(z);
    }

    public int ahm() {
        return this.vs;
    }

    public um rz() {
        return this.kgy;
    }

    public void kgy(String str) {
        this.ahm.add(str);
    }

    public void kgy(boolean z) {
        this.kus = z;
    }

    public void kgy(int i) {
        this.vs += i;
    }

    public boolean kgy() {
        return this.kus;
    }

    public com.bytedance.adsdk.ahm.rz.rz.ct kgy(long j) {
        return this.fi.get(j);
    }

    public float kgy(float f) {
        return com.bytedance.adsdk.ahm.noq.ct.kgy(this.nu, this.at, f);
    }
}
