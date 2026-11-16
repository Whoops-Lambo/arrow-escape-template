package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class B4 {
    public final S9 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        A4 a4;
        Config config;
        if (fyVar instanceof A4) {
            a4 = (A4) fyVar;
            int i = a4.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a4.c = i - Integer.MIN_VALUE;
            } else {
                a4 = new A4(this, fyVar);
            }
        } else {
            a4 = new A4(this, fyVar);
        }
        Object objA = a4.a;
        int i2 = a4.c;
        if (i2 == 0) {
            wz2.a0(objA);
            S9 s9 = this.a;
            a4.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, "SELECT * FROM config_db", null), a4);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        ((List) objA).toString();
        ArrayList arrayList = new ArrayList();
        for (ContentValues contentValues : (Iterable) objA) {
            contentValues.getClass();
            String asString = contentValues.getAsString("config_value");
            Long asLong = contentValues.getAsLong("update_ts");
            try {
                JSONObject jSONObject = new JSONObject(asString);
                String asString2 = contentValues.getAsString("config_type");
                asString2.getClass();
                asLong.getClass();
                long jLongValue = asLong.longValue();
                Class clsA = U4.a(asString2);
                clsA.getClass();
                config = (Config) clsA.cast(AbstractC4184lb.a(jSONObject, clsA, null, null));
                if (config != null) {
                    config.setLastUpdateTimeStamp(jLongValue);
                } else {
                    config = null;
                }
            } catch (Exception unused) {
            }
            String.valueOf(config);
            if (config != null) {
                arrayList.add(config);
            }
        }
        return arrayList;
    }

    public B4(S9 s9) {
        s9.getClass();
        this.a = s9;
    }
}
