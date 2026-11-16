package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class X5 implements I7 {
    @Override // com.ironsource.I7
    public boolean a() {
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.i;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
