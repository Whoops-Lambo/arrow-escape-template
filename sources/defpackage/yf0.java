package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpk;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yf0 {
    public static final long[] e = new long[0];
    public long a;
    public Object b;
    public Serializable c;
    public final Object d;

    /* JADX WARN: Code duplicated, block: B:47:0x0103 A[PHI: r6 r16 r17
  0x0103: PHI (r6v4 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v6 android.database.Cursor) binds: [B:61:0x012e, B:46:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r16v5 com.google.android.gms.internal.measurement.zzhs) = (r16v3 com.google.android.gms.internal.measurement.zzhs), (r16v10 com.google.android.gms.internal.measurement.zzhs) binds: [B:61:0x012e, B:46:0x00fc] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r17v4 long) = (r17v2 long), (r17v7 long) binds: [B:61:0x012e, B:46:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public zzhs a(zzhs zzhsVar, String str) throws Throwable {
        ?? r9;
        zzhs zzhsVar2;
        long j;
        Cursor cursorRawQuery;
        ?? r0;
        Object obj;
        Pair pair;
        String strE = zzhsVar.E();
        List listB = zzhsVar.B();
        um3 um3Var = (um3) this.d;
        zzpg zzpgVar = um3Var.b;
        zzpg zzpgVar2 = um3Var.b;
        zzic zzicVar = (zzic) um3Var.a;
        zzpgVar.j0();
        zzhw zzhwVarD = zzpk.D(zzhsVar, "_eid");
        Long l = (Long) (zzhwVarD == null ? null : zzpk.L(zzhwVarD));
        if (l != null) {
            if (strE.equals("_ep")) {
                Preconditions.checkNotNull(l);
                zzpgVar.j0();
                zzhw zzhwVarD2 = zzpk.D(zzhsVar, "_en");
                String str2 = (String) (zzhwVarD2 == null ? null : zzpk.L(zzhwVarD2));
                if (TextUtils.isEmpty(str2)) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.l(zzguVar);
                    zzguVar.g.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((zzhs) this.b) == null || ((Long) this.c) == null || l.longValue() != ((Long) this.c).longValue()) {
                    ow3 ow3Var = zzpgVar.c;
                    zzpg.T(ow3Var);
                    zzic zzicVar2 = (zzic) ow3Var.a;
                    ow3Var.t();
                    ow3Var.u();
                    try {
                        try {
                            cursorRawQuery = ow3Var.k0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    zzhsVar2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((zzhs) ((zzhr) zzpk.e0(zzhs.Q(), cursorRawQuery.getBlob(0))).n(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair = pairCreate;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            j = 0;
                                            zzgu zzguVar2 = zzicVar2.f;
                                            zzic.l(zzguVar2);
                                            zzguVar2.f.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            r0 = zzhsVar2;
                                        }
                                    } catch (IOException e3) {
                                        zzgu zzguVar3 = zzicVar2.f;
                                        zzic.l(zzguVar3);
                                        j = 0;
                                        try {
                                            zzguVar3.f.d("Failed to merge main event. appId, eventId", zzgu.B(str), l, e3);
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            zzgu zzguVar4 = zzicVar2.f;
                                            zzic.l(zzguVar4);
                                            zzguVar4.f.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            r0 = zzhsVar2;
                                            if (r0 != 0) {
                                            }
                                            zzgu zzguVar5 = zzicVar.f;
                                            zzic.l(zzguVar5);
                                            zzguVar5.g.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                            return zzhsVar2;
                                        }
                                        cursorRawQuery.close();
                                        r0 = zzhsVar2;
                                    }
                                } else {
                                    zzgu zzguVar6 = zzicVar2.f;
                                    zzic.l(zzguVar6);
                                    zzguVar6.n.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair = null;
                                    zzhsVar2 = null;
                                }
                                j = 0;
                                r0 = pair;
                            } catch (SQLiteException e5) {
                                e = e5;
                                zzhsVar2 = null;
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            zzhsVar2 = null;
                            j = 0;
                            cursorRawQuery = null;
                        } catch (Throwable th) {
                            th = th;
                            r9 = 0;
                            if (r9 != 0) {
                                r9.close();
                            }
                            throw th;
                        }
                        if (r0 != 0 || (obj = ((Pair) r0).first) == null) {
                            zzgu zzguVar7 = zzicVar.f;
                            zzic.l(zzguVar7);
                            zzguVar7.g.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                            return zzhsVar2;
                        }
                        this.b = (zzhs) obj;
                        this.a = ((Long) ((Pair) r0).second).longValue();
                        zzpgVar2.j0();
                        this.c = (Long) zzpk.F((zzhs) this.b, "_eid");
                    } catch (Throwable th2) {
                        th = th2;
                        r9 = strE;
                        if (r9 != 0) {
                            r9.close();
                        }
                        throw th;
                    }
                } else {
                    j = 0;
                }
                long j2 = this.a - 1;
                this.a = j2;
                if (j2 <= j) {
                    ow3 ow3Var2 = zzpgVar2.c;
                    zzpg.T(ow3Var2);
                    zzic zzicVar3 = (zzic) ow3Var2.a;
                    ow3Var2.t();
                    zzgu zzguVar8 = zzicVar3.f;
                    zzic.l(zzguVar8);
                    zzguVar8.n.b(str, "Clearing complex main event info. appId");
                    try {
                        ow3Var2.k0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e7) {
                        zzgu zzguVar9 = zzicVar3.f;
                        zzic.l(zzguVar9);
                        zzguVar9.f.b(e7, "Error clearing complex main event");
                    }
                } else {
                    ow3 ow3Var3 = zzpgVar2.c;
                    zzpg.T(ow3Var3);
                    ow3Var3.L(str, l, this.a, (zzhs) this.b);
                }
                ArrayList arrayList = new ArrayList();
                for (zzhw zzhwVar : ((zzhs) this.b).B()) {
                    zzpgVar2.j0();
                    if (zzpk.D(zzhsVar, zzhwVar.A()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    zzgu zzguVar10 = zzicVar.f;
                    zzic.l(zzguVar10);
                    zzguVar10.g.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listB);
                    listB = arrayList;
                }
                strE = str2;
            } else {
                this.c = l;
                this.b = zzhsVar;
                zzpgVar.j0();
                zzhw zzhwVarD3 = zzpk.D(zzhsVar, "_epc");
                Serializable serializableL = zzhwVarD3 == null ? null : zzpk.L(zzhwVarD3);
                long jLongValue = ((Long) (serializableL != null ? serializableL : 0L)).longValue();
                this.a = jLongValue;
                if (jLongValue <= 0) {
                    zzgu zzguVar11 = zzicVar.f;
                    zzic.l(zzguVar11);
                    zzguVar11.g.b(strE, "Complex event with zero extra param count. eventName");
                } else {
                    ow3 ow3Var4 = zzpgVar.c;
                    zzpg.T(ow3Var4);
                    ow3Var4.L(str, (Long) Preconditions.checkNotNull(l), this.a, zzhsVar);
                }
            }
        }
        zzhr zzhrVar = (zzhr) zzhsVar.r();
        zzhrVar.x(strE);
        zzhrVar.l();
        ((zzhs) zzhrVar.b).U();
        zzhrVar.l();
        ((zzhs) zzhrVar.b).T(listB);
        return (zzhs) zzhrVar.n();
    }

    public yf0(SerialDescriptor serialDescriptor, ja1 ja1Var) {
        serialDescriptor.getClass();
        this.b = serialDescriptor;
        this.c = ja1Var;
        int iE = serialDescriptor.e();
        if (iE <= 64) {
            this.a = iE != 64 ? (-1) << iE : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            jArr[i - 1] = (-1) << iE;
        }
        this.d = jArr;
    }
}
