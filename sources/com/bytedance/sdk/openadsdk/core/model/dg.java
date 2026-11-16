package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class dg implements com.bytedance.sdk.component.adexpress.rz {
    public final float ahm;
    public int at;
    public final long ct;
    public int dg;
    public int fi;
    public JSONObject gf;
    public final float kgy;
    public int kus;
    public final long noq;
    public final boolean nu;
    public SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> ra;
    public final float rz;
    public JSONObject twf;
    public final float uq;
    public String vs;
    public Map<String, Object> xh;
    public final String yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private long ahm;
        private int at;
        private float ct;
        private Map<String, Object> dg;
        private int fi;
        private String gf;
        protected SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> kgy = new SparseArray<>();
        private String kus;
        private float noq;
        private JSONObject nu;
        private int ra;
        private long rz;
        private JSONObject twf;
        private float uq;
        private int vs;
        private boolean xh;
        private float yo;

        public kgy kgy(Map<String, Object> map) {
            this.dg = map == null ? null : new HashMap(map);
            return this;
        }

        public kgy ahm(int i) {
            this.ra = i;
            return this;
        }

        public kgy rz(int i) {
            this.fi = i;
            return this;
        }

        public kgy uq(float f) {
            this.yo = f;
            return this;
        }

        public kgy ahm(long j) {
            this.rz = j;
            return this;
        }

        public kgy rz(float f) {
            this.noq = f;
            return this;
        }

        public kgy uq(int i) {
            this.vs = i;
            return this;
        }

        public kgy ahm(float f) {
            this.ct = f;
            return this;
        }

        public kgy ahm(JSONObject jSONObject) {
            this.twf = jSONObject;
            return this;
        }

        public kgy ahm(String str) {
            this.kus = str;
            return this;
        }

        public kgy kgy(int i) {
            this.at = i;
            return this;
        }

        public kgy kgy(JSONObject jSONObject) {
            this.nu = jSONObject;
            return this;
        }

        public kgy kgy(boolean z) {
            this.xh = z;
            return this;
        }

        public kgy kgy(long j) {
            this.ahm = j;
            return this;
        }

        public kgy kgy(float f) {
            this.uq = f;
            return this;
        }

        public kgy kgy(String str) {
            this.gf = str;
            return this;
        }

        public kgy kgy(SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> sparseArray) {
            this.kgy = sparseArray;
            return this;
        }

        public dg kgy() {
            return new dg(this);
        }
    }

    private dg(@NonNull kgy kgyVar) {
        this.kgy = kgyVar.yo;
        this.ahm = kgyVar.noq;
        this.rz = kgyVar.ct;
        this.uq = kgyVar.uq;
        this.ct = kgyVar.rz;
        this.noq = kgyVar.ahm;
        this.yo = kgyVar.gf;
        this.ra = kgyVar.kgy;
        this.nu = kgyVar.xh;
        this.fi = kgyVar.ra;
        this.gf = kgyVar.nu;
        this.at = kgyVar.at;
        this.twf = kgyVar.twf;
        this.kus = kgyVar.fi;
        this.vs = kgyVar.kus;
        this.dg = kgyVar.vs;
        this.xh = kgyVar.dg;
    }
}
