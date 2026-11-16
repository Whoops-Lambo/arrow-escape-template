package com.bytedance.sdk.component.ahm.kgy.kgy.kgy;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class kgy extends com.bytedance.sdk.component.ahm.kgy.uq {
    public static volatile ra kgy;
    private List<com.bytedance.sdk.component.ahm.kgy.ahm> ahm = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.ahm.kgy.ahm> rz = new CopyOnWriteArrayList();
    private ExecutorService uq;

    public static void kgy(ra raVar) {
        kgy = raVar;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public ExecutorService ahm() {
        ExecutorService executorServiceKgy = kgy != null ? kgy.kgy() : null;
        return executorServiceKgy != null ? executorServiceKgy : this.uq;
    }

    public boolean ct() {
        return (kgy == null || kgy.kgy() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public List<com.bytedance.sdk.component.ahm.kgy.ahm> rz() {
        return this.ahm;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public List<com.bytedance.sdk.component.ahm.kgy.ahm> uq() {
        return this.rz;
    }

    public kgy(ExecutorService executorService) {
        this.uq = executorService;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public void kgy(int i) {
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.uq
    public int kgy() {
        return 0;
    }
}
