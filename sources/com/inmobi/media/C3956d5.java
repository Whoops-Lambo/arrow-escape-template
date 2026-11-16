package com.inmobi.media;

import android.content.ContentValues;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.wz2;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3956d5 {
    public final S9 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        C3900b5 c3900b5;
        if (fyVar instanceof C3900b5) {
            c3900b5 = (C3900b5) fyVar;
            int i = c3900b5.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3900b5.c = i - Integer.MIN_VALUE;
            } else {
                c3900b5 = new C3900b5(this, fyVar);
            }
        } else {
            c3900b5 = new C3900b5(this, fyVar);
        }
        Object objA = c3900b5.a;
        int i2 = c3900b5.c;
        if (i2 == 0) {
            wz2.a0(objA);
            S9 s9 = this.a;
            c3900b5.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, "SELECT * FROM c_data", null), c3900b5);
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
            String asString = contentValues.getAsString("e_data");
            asString.getClass();
            Long asLong = contentValues.getAsLong("timestamp");
            asLong.getClass();
            arrayList.add(new C4511x6(asString, asLong.longValue()));
        }
        return arrayList;
    }

    public C3956d5(S9 s9) {
        s9.getClass();
        this.a = s9;
    }

    public final Object a(int i, long j, C4150k5 c4150k5) {
        Object objA = this.a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j + " ORDER BY timestamp DESC LIMIT " + i + ") foo);", c4150k5);
        return objA == dz.a ? objA : az2.a;
    }
}
