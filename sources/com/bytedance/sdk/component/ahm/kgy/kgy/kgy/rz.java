package com.bytedance.sdk.component.ahm.kgy.kgy.kgy;

import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.kus;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz implements com.bytedance.sdk.component.ahm.kgy.fi.kgy {
    at ahm;
    List<com.bytedance.sdk.component.ahm.kgy.fi> kgy;
    int rz = 0;

    @Override // com.bytedance.sdk.component.ahm.kgy.fi.kgy
    public kus kgy(at atVar) throws IOException {
        this.ahm = atVar;
        int i = this.rz + 1;
        this.rz = i;
        if (i >= this.kgy.size()) {
            return null;
        }
        return this.kgy.get(this.rz).kgy(this);
    }

    public rz(List<com.bytedance.sdk.component.ahm.kgy.fi> list, at atVar) {
        this.kgy = list;
        this.ahm = atVar;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.fi.kgy
    public at kgy() {
        return this.ahm;
    }
}
