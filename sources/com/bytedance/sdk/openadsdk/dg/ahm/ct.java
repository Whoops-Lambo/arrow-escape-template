package com.bytedance.sdk.openadsdk.dg.ahm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
class ct implements rz {
    private static volatile ct kgy;

    public static ct kgy() {
        if (kgy == null) {
            synchronized (ct.class) {
                try {
                    if (kgy == null) {
                        kgy = new ct();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private ct() {
    }

    @Override // com.bytedance.sdk.openadsdk.dg.ahm.rz
    public void kgy(com.bytedance.sdk.openadsdk.dg.ahm ahmVar, boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.dg.ahm.rz
    public void kgy(com.bytedance.sdk.openadsdk.dg.ahm ahmVar) {
    }
}
