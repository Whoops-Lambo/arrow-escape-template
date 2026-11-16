package defpackage;

import com.google.android.gms.internal.auth.zzhe;
import com.google.android.gms.internal.consent_sdk.zzqz;
import com.google.android.gms.internal.measurement.zzael;
import com.google.android.gms.internal.play_billing.zzgh;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.protobuf.LazyField;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class jd1 implements Iterator {
    public final /* synthetic */ int a;
    public Iterator b;

    public jd1(zzbf zzbfVar) {
        this.a = 4;
        this.b = zzbfVar.a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                if (!(entry.getValue() instanceof LazyField)) {
                    return entry;
                }
                id1 id1Var = new id1();
                id1Var.a = entry;
                return id1Var;
            case 1:
                return (String) this.b.next();
            case 2:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                return entry2.getValue() instanceof zzael ? new ao3(entry2) : entry2;
            case 3:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                return entry3.getValue() instanceof ps3 ? new ls3(entry3) : entry3;
            case 4:
                return (String) this.b.next();
            case 5:
                Map.Entry entry4 = (Map.Entry) this.b.next();
                return entry4.getValue() instanceof zzgh ? new lk4(entry4) : entry4;
            case 6:
                return (String) this.b.next();
            case 7:
                Map.Entry entry5 = (Map.Entry) this.b.next();
                return entry5.getValue() instanceof yy4 ? new xy4(entry5) : entry5;
            default:
                Map.Entry entry6 = (Map.Entry) this.b.next();
                return entry6.getValue() instanceof zzqz ? new t65(entry6) : entry6;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                this.b.remove();
                return;
            case 3:
                this.b.remove();
                return;
            case 4:
                throw new UnsupportedOperationException("Remove not supported");
            case 5:
                this.b.remove();
                return;
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                this.b.remove();
                return;
            default:
                this.b.remove();
                return;
        }
    }

    public /* synthetic */ jd1(Iterator it, int i) {
        this.a = i;
        this.b = it;
    }

    public jd1(zzhe zzheVar) {
        this.a = 6;
        this.b = zzheVar.a.iterator();
    }

    public /* synthetic */ jd1(int i) {
        this.a = i;
    }
}
