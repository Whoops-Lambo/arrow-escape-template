package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.pm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4307pm extends E6 {
    public final S9 c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.E6
    public final Object b(int i, fy fyVar) {
        C4279om c4279om;
        if (fyVar instanceof C4279om) {
            c4279om = (C4279om) fyVar;
            int i2 = c4279om.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4279om.c = i2 - Integer.MIN_VALUE;
            } else {
                c4279om = new C4279om(this, fyVar);
            }
        } else {
            c4279om = new C4279om(this, fyVar);
        }
        Object objA = c4279om.a;
        int i3 = c4279om.c;
        if (i3 == 0) {
            wz2.a0(objA);
            S9 s9 = this.c;
            c4279om.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i, null), c4279om);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        List<ContentValues> list = (List) objA;
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        for (ContentValues contentValues : list) {
            contentValues.getClass();
            String asString = contentValues.getAsString("eventType");
            String asString2 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_PAYLOAD);
            String asString3 = contentValues.getAsString("eventSource");
            String asString4 = contentValues.getAsString("ts");
            asString4.getClass();
            long j = Long.parseLong(asString4);
            asString.getClass();
            asString3.getClass();
            C4335qm c4335qm = new C4335qm(asString, asString2, asString3);
            c4335qm.c = j;
            Integer asInteger = contentValues.getAsInteger("id");
            asInteger.getClass();
            c4335qm.d = asInteger.intValue();
            arrayList.add(c4335qm);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4307pm(S9 s9) {
        super("telemetry", s9);
        s9.getClass();
        this.c = s9;
    }
}
