package com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.noq.xh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class rz implements xh {
    private final com.bytedance.sdk.component.noq.ahm.rz.kgy.kgy ahm;
    private final xh kgy;

    public rz(xh xhVar, com.bytedance.sdk.component.noq.ahm.rz.kgy.kgy kgyVar) {
        this.kgy = xhVar;
        this.ahm = kgyVar;
    }

    @Override // com.bytedance.sdk.component.noq.kgy
    public boolean ahm(String str) {
        return this.kgy.ahm(str);
    }

    public rz(xh xhVar) {
        this(xhVar, null);
    }

    @Override // com.bytedance.sdk.component.noq.kgy
    public boolean kgy(String str, Bitmap bitmap) {
        return this.kgy.kgy(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.noq.kgy
    public Bitmap kgy(String str) {
        return this.kgy.kgy(str);
    }
}
