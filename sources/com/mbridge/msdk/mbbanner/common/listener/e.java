package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.setting.m;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class e implements c {
    private c a;
    private m b;

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(List<CampaignEx> list) {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(list);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void b() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void c() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void d() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void onLeaveApp() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.onLeaveApp();
        }
    }

    public e(c cVar, m mVar) {
        this.b = mVar;
        this.a = cVar;
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(CampaignEx campaignEx) {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(campaignEx);
        }
    }
}
