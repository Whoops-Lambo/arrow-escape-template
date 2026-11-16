package defpackage;

import com.google.android.gms.internal.ads.zziet;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vx4 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ zziet b;

    public /* synthetic */ vx4(zziet zzietVar, int i) {
        this.a = i;
        this.b = zzietVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        wx4 wx4VarA;
        int i = this.a;
        zziet zzietVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                zzietVar.getClass();
                Object key = entry.getKey();
                wx4 wx4Var = null;
                if (key != null) {
                    try {
                        wx4VarA = zzietVar.a(key, false);
                    } catch (ClassCastException unused) {
                        wx4VarA = null;
                    }
                    break;
                } else {
                    wx4VarA = null;
                }
                if (wx4VarA != null && Objects.equals(wx4VarA.h, entry.getValue())) {
                    wx4Var = wx4VarA;
                }
                return wx4Var != null;
            default:
                return zzietVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ux4(this.b, 0);
            default:
                return new ux4(this.b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        wx4 wx4VarA;
        int i = this.a;
        wx4 wx4VarA2 = null;
        zziet zzietVar = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                zzietVar.getClass();
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        wx4VarA = zzietVar.a(key, false);
                    } catch (ClassCastException unused) {
                        wx4VarA = null;
                    }
                    break;
                } else {
                    wx4VarA = null;
                }
                if (wx4VarA != null && Objects.equals(wx4VarA.h, entry.getValue())) {
                    wx4VarA2 = wx4VarA;
                }
                if (wx4VarA2 == null) {
                    return false;
                }
                zzietVar.b(wx4VarA2, true);
                return true;
            default:
                zzietVar.getClass();
                if (obj != null) {
                    try {
                        wx4VarA2 = zzietVar.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (wx4VarA2 != null) {
                    zzietVar.b(wx4VarA2, true);
                }
                return wx4VarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c;
    }
}
