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

/* JADX INFO: renamed from: com.inmobi.media.za, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4569za extends E6 {
    public final S9 c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.E6
    public final Object b(int i, fy fyVar) {
        C4542ya c4542ya;
        if (fyVar instanceof C4542ya) {
            c4542ya = (C4542ya) fyVar;
            int i2 = c4542ya.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4542ya.c = i2 - Integer.MIN_VALUE;
            } else {
                c4542ya = new C4542ya(this, fyVar);
            }
        } else {
            c4542ya = new C4542ya(this, fyVar);
        }
        Object objA = c4542ya.a;
        int i3 = c4542ya.c;
        if (i3 == 0) {
            wz2.a0(objA);
            S9 s9 = this.c;
            c4542ya.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, "SELECT * FROM crash ORDER BY ts ASC LIMIT " + i, null), c4542ya);
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
            String asString = contentValues.getAsString("eventId");
            String asString2 = contentValues.getAsString("eventType");
            String asString3 = contentValues.getAsString("componentType");
            String asString4 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_PAYLOAD);
            String asString5 = contentValues.getAsString("ts");
            asString5.getClass();
            long j = Long.parseLong(asString5);
            asString.getClass();
            asString3.getClass();
            asString2.getClass();
            Ca ca = new Ca(asString, asString3, asString2, asString4);
            ca.c = j;
            Integer asInteger = contentValues.getAsInteger("id");
            asInteger.getClass();
            ca.d = asInteger.intValue();
            arrayList.add(ca);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4569za(S9 s9) {
        super("crash", s9);
        s9.getClass();
        this.c = s9;
    }
}
