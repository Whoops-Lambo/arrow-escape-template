package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.er;
import defpackage.j71;
import defpackage.wz2;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ql {
    public static final Ql a = new Ql();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(JSONObject jSONObject, dy dyVar) {
        Pl pl;
        String packageName;
        if (dyVar instanceof Pl) {
            pl = (Pl) dyVar;
            int i = pl.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pl.c = i - Integer.MIN_VALUE;
            } else {
                pl = new Pl(this, dyVar);
            }
        } else {
            pl = new Pl(this, dyVar);
        }
        Object objA = pl.a;
        int i2 = pl.c;
        try {
            if (i2 == 0) {
                wz2.a0(objA);
                Context context = AbstractC4221mk.a;
                if (context == null || (packageName = context.getPackageName()) == null) {
                    return new Rl(6001);
                }
                try {
                    SignalsConfig.SynapseConfig synapse = ((SignalsConfig) AbstractC4563z4.a.a(SignalsConfig.class)).getSynapse();
                    jSONObject.getClass();
                    JSONObject jSONObjectPut = new JSONObject().put("s", jSONObject).put("hs", Ol.a(packageName));
                    jSONObjectPut.getClass();
                    jSONObjectPut.toString();
                    String string = jSONObjectPut.toString();
                    string.getClass();
                    byte[] bytes = string.getBytes(er.a);
                    bytes.getClass();
                    byte[] bArrA = Ml.a(packageName, bytes);
                    String pushUrl = synapse.getPushUrl();
                    int maxRetryCount = synapse.getMaxRetryCount();
                    int retryInterval = synapse.getRetryInterval();
                    j71 j71Var = Tf.a;
                    C3943ck c3943ck = new C3943ck(maxRetryCount, retryInterval * 1000, 0);
                    pushUrl.getClass();
                    bArrA.getClass();
                    Map mapSingletonMap = Collections.singletonMap("X-IM-Bundle-Id", packageName);
                    mapSingletonMap.getClass();
                    Mf mf = new Mf(pushUrl, mapSingletonMap, null, new C4037g3(bArrA), c3943ck, 36);
                    C4044ga c4044ga = (C4044ga) If.c.getValue();
                    pl.c = 1;
                    objA = c4044ga.a.a(mf, pl);
                    dz dzVar = dz.a;
                    if (objA == dzVar) {
                        return dzVar;
                    }
                } catch (Exception unused) {
                    return new Rl(6002);
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(objA);
            }
            try {
                int iC = ((Of) objA).c();
                return (200 > iC || iC >= 300) ? new Rl(iC) : Sl.a;
            } catch (Exception unused2) {
                return new Rl(6004);
            }
        } catch (Exception unused3) {
            return new Rl(6003);
        }
    }
}
