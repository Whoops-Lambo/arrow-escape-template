package com.mbridge.msdk.advanced.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends d {
    private int d;

    public abstract void a(CampaignUnit campaignUnit, int i);

    public abstract void b(int i, String str);

    @Override // com.mbridge.msdk.advanced.request.d
    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit, this.d);
    }

    public b(int i) {
        this.d = i;
    }

    @Override // com.mbridge.msdk.advanced.request.d
    public void a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.advanced.request.d
    public void a(int i, String str) {
        b(i, str);
    }
}
