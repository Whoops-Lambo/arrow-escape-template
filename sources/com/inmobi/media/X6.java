package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import defpackage.az2;
import defpackage.ba0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.hg0;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.y80;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class X6 {
    public final Ed a;
    public final AbstractC4035g1 b;

    public abstract Object a(dy dyVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(List list, fy fyVar) throws Throwable {
        W6 w6;
        OmSdkInfo omsdkInfo;
        Object objE;
        List list2;
        Map macros;
        String customReferenceData;
        if (fyVar instanceof W6) {
            w6 = (W6) fyVar;
            int i = w6.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6.e = i - Integer.MIN_VALUE;
            } else {
                w6 = new W6(this, fyVar);
            }
        } else {
            w6 = new W6(this, fyVar);
        }
        Object obj = w6.c;
        int i2 = w6.e;
        az2 az2Var = az2.a;
        if (i2 == 0) {
            wz2.a0(obj);
            if (list.isEmpty()) {
                Y9 y9A = a();
                if (y9A != null) {
                    ((Z9) y9A).a("ExperienceLoader", "OMID trackers are empty");
                }
                return az2Var;
            }
            MetaInfo metaInfo = this.a.a.b.d;
            omsdkInfo = metaInfo != null ? metaInfo.getOmsdkInfo() : null;
            boolean z = omsdkInfo != null && omsdkInfo.getOmidEnabled();
            boolean omidEnabled = this.a.a.b.a.b.getViewability().getOmidConfig().getOmidEnabled();
            if (!z || !omidEnabled) {
                Y9 y9A2 = a();
                if (y9A2 != null) {
                    ((Z9) y9A2).a("ExperienceLoader", "OMID is not enabled");
                }
                return az2Var;
            }
            C4356rg c4356rg = C4356rg.a;
            w6.a = list;
            w6.b = omsdkInfo;
            w6.e = 1;
            Context context = AbstractC4221mk.a;
            if (context == null) {
                objE = "";
            } else {
                ba0 ba0Var = xc0.a;
                objE = tb5.E(y80.c, new C4301pg(context, null), w6);
            }
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            list2 = list;
            obj = objE;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            omsdkInfo = w6.b;
            List list3 = w6.a;
            wz2.a0(obj);
            list2 = list3;
        }
        String str = (String) obj;
        String str2 = this.a.a.b.a.a.f;
        Y9 y9A3 = a();
        if (y9A3 != null) {
            ((Z9) y9A3).a("ExperienceLoader", "OM-SDK Session Initialize Called");
        }
        AbstractC4035g1 abstractC4035g1 = this.b;
        if (omsdkInfo == null || (macros = omsdkInfo.getMacros()) == null) {
            macros = hg0.a;
        }
        abstractC4035g1.a(str, list2, macros, str2, (omsdkInfo == null || (customReferenceData = omsdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omsdkInfo != null && omsdkInfo.getIsolateVerificationScripts());
        return az2Var;
    }

    public X6(Ed ed, AbstractC4035g1 abstractC4035g1) {
        ed.getClass();
        abstractC4035g1.getClass();
        this.a = ed;
        this.b = abstractC4035g1;
    }

    public final Y9 a() {
        return this.a.a.a.c;
    }
}
