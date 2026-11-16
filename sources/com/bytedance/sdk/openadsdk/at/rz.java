package com.bytedance.sdk.openadsdk.at;

import com.bytedance.sdk.component.adexpress.ct.ct;
import com.bytedance.sdk.component.kgy.sx;
import com.bytedance.sdk.openadsdk.core.gf.ioy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class rz extends sx {
    @Override // com.bytedance.sdk.component.kgy.sx
    public void rz() {
        if (this.gf != null) {
            if (ioy.wy()) {
                ct.kgy().ahm(this.gf, this, ((sx) this).fi);
            } else {
                ct.kgy().kgy(this.gf, this, ((sx) this).fi);
            }
        }
    }

    @Override // com.bytedance.sdk.component.kgy.sx
    public void uq() {
        if (ioy.wy()) {
            ct.kgy().ahm(this.gf, ((sx) this).fi);
        } else {
            ct.kgy().kgy(this.gf, ((sx) this).fi);
        }
    }
}
