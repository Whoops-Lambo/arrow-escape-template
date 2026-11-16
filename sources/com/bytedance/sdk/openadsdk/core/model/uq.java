package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class uq {

    @NonNull
    private com.bytedance.sdk.openadsdk.core.twf.uq kgy = new com.bytedance.sdk.openadsdk.core.twf.uq();
    private Set<com.bytedance.sdk.openadsdk.core.twf.ra> ahm = new HashSet();

    public void ahm(Set<com.bytedance.sdk.openadsdk.core.twf.ra> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.ahm.addAll(set);
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.twf.uq uqVar) {
        if (uqVar == null) {
            uqVar = new com.bytedance.sdk.openadsdk.core.twf.uq();
        }
        this.kgy = uqVar;
    }

    @NonNull
    public com.bytedance.sdk.openadsdk.core.twf.uq kgy() {
        return this.kgy;
    }

    public void kgy(Set<com.bytedance.sdk.openadsdk.core.twf.ra> set) {
        this.ahm = set;
    }

    public void kgy(ioy ioyVar) {
        com.bytedance.sdk.openadsdk.core.twf.uq uqVar = this.kgy;
        if (uqVar != null) {
            uqVar.kgy(ioyVar);
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.twf.ra> ahm() {
        return this.ahm;
    }
}
