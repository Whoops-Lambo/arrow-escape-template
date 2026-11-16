package defpackage;

import com.explorestack.protobuf.w7;
import com.google.android.gms.internal.p002firebaseauthapi.zzalo;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class yg2 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yg2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((rg2) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((w7) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((cp3) obj2).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((kt3) obj2).put((zzalo) entry4.getKey(), entry4.getValue());
                return true;
            case 4:
                Map.Entry entry5 = (Map.Entry) obj;
                if (contains(entry5)) {
                    return false;
                }
                ((hm4) obj2).put((Comparable) entry5.getKey(), entry5.getValue());
                return true;
            case 5:
                Map.Entry entry6 = (Map.Entry) obj;
                if (contains(entry6)) {
                    return false;
                }
                ((yv4) obj2).put((Comparable) entry6.getKey(), entry6.getValue());
                return true;
            case 6:
            default:
                return super.add(obj);
            case 7:
                Map.Entry entry7 = (Map.Entry) obj;
                if (contains(entry7)) {
                    return false;
                }
                ((v75) obj2).b((Comparable) entry7.getKey(), entry7.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rg2) obj).clear();
                break;
            case 1:
                ((w7) obj).clear();
                break;
            case 2:
                ((cp3) obj).clear();
                break;
            case 3:
                ((kt3) obj).clear();
                break;
            case 4:
                ((hm4) obj).clear();
                break;
            case 5:
                ((yv4) obj).clear();
                break;
            case 6:
            default:
                super.clear();
                break;
            case 7:
                ((v75) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((rg2) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 != value) {
                    return obj3 != null && obj3.equals(value);
                }
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((w7) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 != value2) {
                    return obj4 != null && obj4.equals(value2);
                }
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj5 = ((cp3) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj5 != value3) {
                    return obj5 != null && obj5.equals(value3);
                }
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj6 = ((kt3) obj2).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj6 != value4) {
                    return obj6 != null && obj6.equals(value4);
                }
                return true;
            case 4:
                Map.Entry entry5 = (Map.Entry) obj;
                Object obj7 = ((hm4) obj2).get(entry5.getKey());
                Object value5 = entry5.getValue();
                if (obj7 != value5) {
                    return obj7 != null && obj7.equals(value5);
                }
                return true;
            case 5:
                Map.Entry entry6 = (Map.Entry) obj;
                Object obj8 = ((yv4) obj2).get(entry6.getKey());
                Object value6 = entry6.getValue();
                if (obj8 != value6) {
                    return obj8 != null && obj8.equals(value6);
                }
                return true;
            case 6:
                Map.Entry entry7 = (Map.Entry) obj;
                Object obj9 = ((mz4) obj2).get(entry7.getKey());
                Object value7 = entry7.getValue();
                if (obj9 != value7) {
                    return obj9 != null && obj9.equals(value7);
                }
                return true;
            case 7:
                Map.Entry entry8 = (Map.Entry) obj;
                Object obj10 = ((v75) obj2).get(entry8.getKey());
                Object value8 = entry8.getValue();
                if (obj10 != value8) {
                    return obj10 != null && obj10.equals(value8);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.a;
        int i2 = 3;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new xg2((rg2) obj, 0);
            case 1:
                return new xg2((w7) obj, 1);
            case 2:
                return new xg2((cp3) obj);
            case 3:
                return new sg2((kt3) obj);
            case 4:
                return new xg2((hm4) obj, i2);
            case 5:
                return new xg2((yv4) obj);
            case 6:
                mz4 mz4Var = (mz4) obj;
                mz4Var.d();
                return new tm3(mz4Var);
            case 7:
                return new xg2((v75) obj);
            default:
                return new ml3(this, i2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((rg2) obj2).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((w7) obj2).remove(entry2.getKey());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((cp3) obj2).remove(entry3.getKey());
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((kt3) obj2).remove(entry4.getKey());
                return true;
            case 4:
                Map.Entry entry5 = (Map.Entry) obj;
                if (!contains(entry5)) {
                    return false;
                }
                ((hm4) obj2).remove(entry5.getKey());
                return true;
            case 5:
                Map.Entry entry6 = (Map.Entry) obj;
                if (!contains(entry6)) {
                    return false;
                }
                ((yv4) obj2).remove(entry6.getKey());
                return true;
            case 6:
            default:
                return super.remove(obj);
            case 7:
                Map.Entry entry7 = (Map.Entry) obj;
                if (!contains(entry7)) {
                    return false;
                }
                ((v75) obj2).remove(entry7.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((rg2) obj).size();
            case 1:
                return ((w7) obj).size();
            case 2:
                return ((cp3) obj).size();
            case 3:
                return ((kt3) obj).size();
            case 4:
                return ((hm4) obj).size();
            case 5:
                return ((yv4) obj).size();
            case 6:
                mz4 mz4Var = (mz4) obj;
                mz4Var.d();
                return mz4Var.b;
            case 7:
                return ((v75) obj).size();
            default:
                return ((md5) obj).e;
        }
    }
}
