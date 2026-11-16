package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.adquality.models.AdQualityResult;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.wz2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class J0 {
    public final S9 a;
    public WeakReference b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(AdQualityResult adQualityResult, fy fyVar) {
        I0 i0;
        B0 b0;
        if (fyVar instanceof I0) {
            i0 = (I0) fyVar;
            int i = i0.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0.c = i - Integer.MIN_VALUE;
            } else {
                i0 = new I0(this, fyVar);
            }
        } else {
            i0 = new I0(this, fyVar);
        }
        Object obj = i0.a;
        int i2 = i0.c;
        if (i2 == 0) {
            wz2.a0(obj);
            S9 s9 = this.a;
            adQualityResult.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("image_location", adQualityResult.getImageLocation());
            String sdkModelResult = adQualityResult.getSdkModelResult();
            if (sdkModelResult == null) {
                sdkModelResult = "";
            }
            contentValues.put("sdk_model_result", sdkModelResult);
            contentValues.put("beacon_url", adQualityResult.getBeaconUrl());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, adQualityResult.getExtras());
            i0.c = 1;
            Object objA = s9.a("ad_quality_db", contentValues, 4, i0);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        WeakReference weakReference = this.b;
        if (weakReference != null && (b0 = (B0) weakReference.get()) != null && b0.a.b.get()) {
            b0.a.b.set(false);
            b0.a.a();
        }
        return az2.a;
    }

    public J0(S9 s9) {
        s9.getClass();
        this.a = s9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        H0 h0;
        if (fyVar instanceof H0) {
            h0 = (H0) fyVar;
            int i = h0.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0.c = i - Integer.MIN_VALUE;
            } else {
                h0 = new H0(this, fyVar);
            }
        } else {
            h0 = new H0(this, fyVar);
        }
        Object objA = h0.a;
        int i2 = h0.c;
        if (i2 == 0) {
            wz2.a0(objA);
            S9 s9 = this.a;
            h0.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, "SELECT * FROM ad_quality_db", null), h0);
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
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
        for (ContentValues contentValues : iterable) {
            contentValues.getClass();
            String asString = contentValues.getAsString("image_location");
            asString.getClass();
            String asString2 = contentValues.getAsString("sdk_model_result");
            String asString3 = contentValues.getAsString("beacon_url");
            asString3.getClass();
            arrayList.add(new AdQualityResult(asString, asString2, asString3, contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_EXTRAS)));
        }
        return arrayList;
    }
}
