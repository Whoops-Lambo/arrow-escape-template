package com.bytedance.sdk.openadsdk.core.at.noq;

import com.bytedance.adsdk.ugeno.core.um;
import com.bytedance.sdk.component.adexpress.ahm.twf;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy extends twf {
    private um ahm;
    private boolean ct;
    private JSONObject kgy;
    private float rz;
    private float uq;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.at.noq.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0242kgy extends twf.kgy {
        private um ahm;
        private boolean ct;
        private JSONObject kgy;
        private float rz;
        private float uq;

        @Override // com.bytedance.sdk.component.adexpress.ahm.twf.kgy
        /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
        public kgy kgy() {
            return new kgy(this);
        }

        public C0242kgy yo(boolean z) {
            this.ct = z;
            return this;
        }

        public C0242kgy ahm(float f) {
            this.uq = f;
            return this;
        }

        public C0242kgy kgy(JSONObject jSONObject) {
            this.kgy = jSONObject;
            return this;
        }

        public C0242kgy kgy(um umVar) {
            this.ahm = umVar;
            return this;
        }

        public C0242kgy kgy(float f) {
            this.rz = f;
            return this;
        }
    }

    public float bmz() {
        return this.uq;
    }

    public JSONObject ikw() {
        return this.kgy;
    }

    public boolean muf() {
        return this.ct;
    }

    public um uxe() {
        return this.ahm;
    }

    public float vg() {
        return this.rz;
    }

    public kgy(C0242kgy c0242kgy) {
        super(c0242kgy);
        this.kgy = c0242kgy.kgy;
        this.ahm = c0242kgy.ahm;
        this.rz = c0242kgy.rz;
        this.uq = c0242kgy.uq;
        this.ct = c0242kgy.ct;
    }
}
