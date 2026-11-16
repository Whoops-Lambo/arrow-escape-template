package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class at extends YogaNodeJNIBase {
    public void twf() {
        long j = this.kgy;
        if (j != 0) {
            this.kgy = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }

    public void finalize() throws Throwable {
        try {
            twf();
        } finally {
            super.finalize();
        }
    }
}
