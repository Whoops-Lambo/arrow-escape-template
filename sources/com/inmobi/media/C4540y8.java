package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.az2;
import defpackage.dy;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.y8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4540y8 implements Yh {
    public final String a;

    @Override // com.inmobi.media.Yh
    public final void a() {
        if (this.a.length() != 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2162);
        throw new C3885ai(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(map));
    }

    @Override // com.inmobi.media.Yh
    public final Object b() {
        return this.a;
    }

    public C4540y8(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.inmobi.media.Yh
    public final Object a(dy dyVar) {
        return az2.a;
    }
}
