package com.mbridge.msdk.video.module.listener.impl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class i extends f {
    protected com.mbridge.msdk.video.module.listener.a a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.a;
        if (aVar != null) {
            aVar.a(i, obj);
        }
    }
}
