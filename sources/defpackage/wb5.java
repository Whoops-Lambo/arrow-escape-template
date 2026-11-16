package defpackage;

import com.google.android.gms.internal.measurement.zzabe;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.ironsource.C4664b4;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wb5 extends zzyl {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb5(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public void a(Iterator it, zzzc zzzcVar) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.a;
                    if (!zHasNext) {
                        zzzcVar.a(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder(C4664b4.j.d);
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        zzzcVar.a(sb.toString(), str);
                    }
                }
                break;
            default:
                super.a(it, zzzcVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public void b(Object obj, zzzc zzzcVar) {
        switch (this.f) {
            case 1:
                zzabe zzabeVar = (zzabe) obj;
                if (zzabeVar != null) {
                    pl3 pl3Var = (pl3) zzabeVar.a.f;
                    pl3Var.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < pl3Var.d() - pl3Var.c())) {
                            break;
                        } else if (i >= pl3Var.d() - pl3Var.c()) {
                            d.v();
                            break;
                        } else {
                            ql3 ql3Var = pl3Var.b;
                            int iC = pl3Var.c() + i;
                            i++;
                            Map.Entry entry = (Map.Entry) ql3Var.b[iC];
                            if (((Set) entry.getValue()).isEmpty()) {
                                zzzcVar.a(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    zzzcVar.a(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.b(obj, zzzcVar);
                break;
        }
    }
}
