package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b implements h {
    private Boolean a = null;
    private Boolean b = null;

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z, com.mbridge.msdk.videocommon.entity.c cVar2) {
        q0.a("ShowRewardListener", "onAdClose:isCompleteView:" + z + ",reward:" + cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        q63.D("onVideoComplete: ", str2, "ShowRewardListener");
    }

    public Boolean c() {
        return this.b;
    }

    public Boolean d() {
        return this.a;
    }

    public void b() {
        this.a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        q0.a("ShowRewardListener", "onAdShow");
        this.a = Boolean.TRUE;
    }

    public void a() {
        this.b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        q63.D("onShowFail:", str, "ShowRewardListener");
        this.b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z, String str, String str2) {
        q63.D("onVideoAdClicked:", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z, int i) {
        q0.a("ShowRewardListener", "onAdCloseWithIVReward: " + z + "  " + i);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        q63.D("onEndcardShow: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i, String str, String str2) {
        q63.D("onAutoLoad: ", str2, "ShowRewardListener");
    }
}
