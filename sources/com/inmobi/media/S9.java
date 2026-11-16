package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import defpackage.az2;
import defpackage.dz;
import defpackage.fy;
import defpackage.uy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class S9 {
    public final C4127ja a;
    public final L5 b;
    public SQLiteDatabase c;
    public SQLiteDatabase d;
    public uy e;

    /* JADX WARN: Code duplicated, block: B:28:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r8 == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.wr0 r7, defpackage.dy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.M9
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.M9 r0 = (com.inmobi.media.M9) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.inmobi.media.M9 r0 = new com.inmobi.media.M9
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.wz2.a0(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            return r2
        L31:
            wr0 r7 = r0.a
            defpackage.wz2.a0(r8)
            goto L4e
        L37:
            defpackage.wz2.a0(r8)
            uy r6 = r6.e
            if (r6 == 0) goto L52
            com.inmobi.media.N9 r8 = new com.inmobi.media.N9
            r8.<init>(r7, r2)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.tb5.E(r6, r8, r0)
            if (r8 != r5) goto L4e
            goto L5c
        L4e:
            if (r8 != 0) goto L51
            goto L52
        L51:
            return r8
        L52:
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r7.invoke(r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.S9.a(wr0, dy):java.lang.Object");
    }

    public S9(C4127ja c4127ja, L5 l5) {
        c4127ja.getClass();
        l5.getClass();
        this.a = c4127ja;
        this.b = l5;
    }

    public static Object a(S9 s9, String str, ContentValues contentValues, String str2, String[] strArr, fy fyVar, int i) {
        String str3 = (i & 4) != 0 ? null : str2;
        String[] strArr2 = (i & 8) != 0 ? null : strArr;
        s9.getClass();
        Object objA = s9.a(new R9(s9, new Q9(str, contentValues, str3, strArr2, null), null), fyVar);
        return objA == dz.a ? objA : az2.a;
    }

    public static /* synthetic */ Object a(S9 s9, String str, String str2, fy fyVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return s9.a(str, str2, (String[]) null, fyVar);
    }

    public final Object a(String str, String str2, String[] strArr, fy fyVar) {
        Object objA = a(new R9(this, new K9(str, str2, strArr, null), null), fyVar);
        return objA == dz.a ? objA : az2.a;
    }

    public final Object a(String str, fy fyVar) {
        Object objA = a(new R9(this, new L9(str, null), null), fyVar);
        return objA == dz.a ? objA : az2.a;
    }

    public final Object a(String str, ContentValues contentValues, int i, fy fyVar) {
        Object objA = a(new R9(this, new P9(str, contentValues, i, null), null), fyVar);
        return objA == dz.a ? objA : az2.a;
    }
}
