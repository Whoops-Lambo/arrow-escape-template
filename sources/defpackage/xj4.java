package defpackage;

import com.google.android.gms.internal.games_v2.a;
import com.google.android.gms.internal.games_v2.b;
import com.google.android.gms.internal.games_v2.zzfv;
import com.google.android.gms.internal.games_v2.zzgz;
import com.google.android.gms.internal.games_v2.zzhh;
import com.google.android.gms.internal.games_v2.zzhi;
import com.google.android.gms.internal.games_v2.zzhj;
import com.google.android.gms.internal.games_v2.zzhk;
import com.google.android.gms.internal.games_v2.zzhw;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xj4 implements Function {
    public static final /* synthetic */ xj4 b = new xj4(0);
    public static final /* synthetic */ xj4 c = new xj4(1);
    public static final /* synthetic */ xj4 d = new xj4(2);
    public static final /* synthetic */ xj4 e = new xj4(3);
    public static final /* synthetic */ xj4 f = new xj4(4);
    public static final /* synthetic */ xj4 g = new xj4(5);
    public final /* synthetic */ int a;

    public /* synthetic */ xj4(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zzhw zzhwVar;
        switch (this.a) {
            case 0:
                return ((zzgz) obj).d();
            case 1:
                ArrayList arrayList = ((zzhh) obj).a;
                zzgz zzgzVar = new zzgz(arrayList.size());
                zzhw zzhwVar2 = zzhw.c;
                Collections.sort(arrayList, uw4.a);
                Iterator it = arrayList.iterator();
                rv4 rv4Var = it instanceof rv4 ? (rv4) it : new rv4(it);
                while (rv4Var.hasNext()) {
                    zzhw zzhwVar3 = (zzhw) rv4Var.next();
                    while (rv4Var.hasNext()) {
                        if (!rv4Var.b) {
                            rv4Var.c = rv4Var.a.next();
                            rv4Var.b = true;
                        }
                        zzhw zzhwVar4 = (zzhw) rv4Var.c;
                        co4 co4Var = zzhwVar3.a;
                        co4 co4Var2 = zzhwVar3.b;
                        co4 co4Var3 = zzhwVar4.b;
                        co4 co4Var4 = zzhwVar4.a;
                        if (co4Var.c(co4Var3) > 0 || co4Var4.c(co4Var2) > 0) {
                        }
                        int iC = co4Var.c(co4Var4);
                        co4 co4Var5 = zzhwVar4.b;
                        int iC2 = co4Var2.c(co4Var5);
                        if (iC >= 0 && iC2 <= 0) {
                            zzhwVar = zzhwVar3;
                        } else if (iC > 0 || iC2 < 0) {
                            if (iC >= 0) {
                                co4Var4 = co4Var;
                            }
                            if (iC2 <= 0) {
                                co4Var5 = co4Var2;
                            }
                            if (!(co4Var4.c(co4Var5) <= 0)) {
                                d.r(zzfv.a("intersection is undefined for disconnected ranges %s and %s", zzhwVar3, zzhwVar4));
                                return null;
                            }
                            zzhwVar = new zzhw(co4Var4, co4Var5);
                        } else {
                            zzhwVar = zzhwVar4;
                        }
                        if (!zzhwVar.a.equals(zzhwVar.b)) {
                            d.r(zzfv.a("Overlapping ranges not permitted but found %s overlapping %s", zzhwVar3, zzhwVar4));
                            return null;
                        }
                        zzhw zzhwVar5 = (zzhw) rv4Var.next();
                        co4 co4Var6 = zzhwVar5.a;
                        int iC3 = co4Var.c(co4Var6);
                        co4 co4Var7 = zzhwVar5.b;
                        int iC4 = co4Var2.c(co4Var7);
                        if (iC3 > 0 || iC4 < 0) {
                            if (iC3 < 0 || iC4 > 0) {
                                if (iC3 > 0) {
                                    co4Var = co4Var6;
                                }
                                if (iC4 < 0) {
                                    co4Var2 = co4Var7;
                                }
                                zzhwVar3 = new zzhw(co4Var, co4Var2);
                            } else {
                                zzhwVar3 = zzhwVar5;
                            }
                        }
                        break;
                    }
                    zzgzVar.b(zzhwVar3);
                }
                a aVarD = zzgzVar.d();
                if (aVarD.isEmpty()) {
                    return zzhi.b;
                }
                if (aVarD.d == 1) {
                    ur4 ur4VarListIterator = aVarD.listIterator(0);
                    Object next = ur4VarListIterator.next();
                    if (ur4VarListIterator.hasNext()) {
                        StringBuilder sb = new StringBuilder("expected one element but was: <");
                        sb.append(next);
                        for (int i = 0; i < 4 && ur4VarListIterator.hasNext(); i++) {
                            sb.append(", ");
                            sb.append(ur4VarListIterator.next());
                        }
                        if (ur4VarListIterator.hasNext()) {
                            sb.append(", ...");
                        }
                        sb.append('>');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (((zzhw) next).equals(zzhw.c)) {
                        return zzhi.c;
                    }
                }
                return new zzhi(aVarD);
            case 2:
                zzhj zzhjVar = (zzhj) obj;
                int i2 = zzhjVar.b;
                if (i2 == 0) {
                    return b.i;
                }
                Object[] objArr = zzhjVar.a;
                if (i2 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new bz4(obj2);
                }
                zzhk zzhkVarT = zzhk.t(i2, objArr);
                zzhjVar.b = zzhkVarT.size();
                zzhjVar.c = true;
                return zzhkVarT;
            case 3:
                return Long.valueOf(((zzoh) obj).b);
            case 4:
                return new Integer(Integer.bitCount(((Integer) obj).intValue()));
            default:
                return new Integer(Integer.bitCount(((Integer) obj).intValue()));
        }
    }
}
