package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.az2;
import defpackage.dt1;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.qh1;
import defpackage.wz2;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class X9 implements Yh {
    public final String a;
    public InMobiJsonResponse b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.Yh
    public final Object a(dy dyVar) {
        W9 w9;
        int i;
        if (dyVar instanceof W9) {
            w9 = (W9) dyVar;
            int i2 = w9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w9.d = i2 - Integer.MIN_VALUE;
            } else {
                w9 = new W9(this, (fy) dyVar);
            }
        } else {
            w9 = new W9(this, (fy) dyVar);
        }
        Object objCast = w9.b;
        int i3 = w9.d;
        try {
            if (i3 == 0) {
                wz2.a0(objCast);
                String str = this.a;
                w9.a = this;
                w9.d = 1;
                objCast = InMobiJsonResponse.class.cast(AbstractC4184lb.a(new JSONObject(str), InMobiJsonResponse.class, null, null));
                dz dzVar = dz.a;
                if (objCast == dzVar) {
                    return dzVar;
                }
            } else {
                if (i3 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = w9.a;
                wz2.a0(objCast);
            }
            this.b = (InMobiJsonResponse) objCast;
            return az2.a;
        } catch (Throwable th) {
            defpackage.l7.D(th);
            if (th instanceof JSONException) {
                i = 2309;
            } else {
                i = th instanceof ClassCastException ? 2310 : 2311;
            }
            throw new Z(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, new Short((short) i)))));
        }
    }

    @Override // com.inmobi.media.Yh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.b);
        return this.b;
    }

    public X9(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.inmobi.media.Yh
    public final void a() {
        String str = this.a;
        if (this.b == null || str.length() == 0) {
            throw new C3885ai(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4471vk(qh1.Z(new dt1(IronSourceConstants.EVENTS_ERROR_CODE, (short) 3))));
        }
    }
}
