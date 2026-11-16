package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.dt1;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.qh1;
import defpackage.wz2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class W0 {
    public static final W0 a = new W0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, fy fyVar) {
        V0 v0;
        int i;
        if (fyVar instanceof V0) {
            v0 = (V0) fyVar;
            int i2 = v0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0.c = i2 - Integer.MIN_VALUE;
            } else {
                v0 = new V0(this, fyVar);
            }
        } else {
            v0 = new V0(this, fyVar);
        }
        Object objCast = v0.a;
        int i3 = v0.c;
        try {
            if (i3 == 0) {
                wz2.a0(objCast);
                v0.c = 1;
                objCast = AdResponse.class.cast(AbstractC4184lb.a(new JSONObject(str), AdResponse.class, null, null));
                dz dzVar = dz.a;
                if (objCast == dzVar) {
                    return dzVar;
                }
            } else {
                if (i3 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(objCast);
            }
            AdResponse adResponse = (AdResponse) objCast;
            if (adResponse != null) {
                return adResponse;
            }
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, new Short((short) 2232)))));
        } catch (Exception e) {
            if (e instanceof JSONException) {
                i = 2113;
            } else {
                i = e instanceof ClassCastException ? 2207 : com.ironsource.M9.a.g;
            }
            e.toString();
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, new Short((short) i)))));
        }
    }
}
