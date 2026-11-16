package com.bytedance.sdk.component.adexpress.dynamic.uq;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class gf {
    public float ahm;
    public float kgy;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gf gfVar = (gf) obj;
            if (Float.compare(gfVar.kgy, this.kgy) == 0 && Float.compare(gfVar.ahm, this.ahm) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.kgy), Float.valueOf(this.ahm)});
    }

    public gf(float f, float f2) {
        this.kgy = f;
        this.ahm = f2;
    }
}
