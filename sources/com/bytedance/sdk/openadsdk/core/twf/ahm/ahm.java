package com.bytedance.sdk.openadsdk.core.twf.ahm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm extends rz implements Comparable<ahm> {
    private final float kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private final float ahm;
        private final String kgy;
        private rz.EnumC0265rz rz = rz.EnumC0265rz.TRACKING_URL;
        private boolean uq = false;

        public ahm kgy() {
            return new ahm(this.ahm, this.kgy, this.rz, Boolean.valueOf(this.uq));
        }

        public kgy(String str, float f) {
            this.kgy = str;
            this.ahm = f;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public int compareTo(ahm ahmVar) {
        if (ahmVar == null) {
            return 1;
        }
        float f = this.kgy;
        float f2 = ahmVar.kgy;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    private ahm(float f, String str, rz.EnumC0265rz enumC0265rz, Boolean bool) {
        super(str, enumC0265rz, bool);
        this.kgy = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.twf.ahm.rz
    public void p_() {
        super.p_();
    }

    public String toString() {
        return super.toString();
    }

    public boolean kgy(float f) {
        return this.kgy <= f && !uq();
    }
}
