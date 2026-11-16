package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ke1 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ ne1 b;

    public /* synthetic */ ke1(ne1 ne1Var, int i) {
        this.a = i;
        this.b = ne1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        ne1 ne1Var = this.b;
        switch (i) {
            case 0:
                ne1Var.clear();
                break;
            default:
                ne1Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        me1 me1VarA;
        Object obj2;
        Object value;
        int i = this.a;
        ne1 ne1Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                me1 me1Var = null;
                if (key != null) {
                    try {
                        me1VarA = ne1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        me1VarA = null;
                    }
                    break;
                } else {
                    me1VarA = null;
                }
                if (me1VarA != null && ((obj2 = me1VarA.g) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    me1Var = me1VarA;
                }
                return me1Var != null;
            default:
                return ne1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        ne1 ne1Var = this.b;
        switch (i) {
            case 0:
                return new je1(ne1Var, 0);
            default:
                return new je1(ne1Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        me1 me1VarA;
        Object obj2;
        Object value;
        int i = this.a;
        me1 me1VarA2 = null;
        ne1 ne1Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        me1VarA = ne1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        me1VarA = null;
                    }
                    break;
                } else {
                    me1VarA = null;
                }
                if (me1VarA != null && ((obj2 = me1VarA.g) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    me1VarA2 = me1VarA;
                }
                if (me1VarA2 == null) {
                    return false;
                }
                ne1Var.c(me1VarA2, true);
                return true;
            default:
                if (obj != null) {
                    try {
                        me1VarA2 = ne1Var.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (me1VarA2 != null) {
                    ne1Var.c(me1VarA2, true);
                }
                return me1VarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        ne1 ne1Var = this.b;
        switch (i) {
            case 0:
                break;
        }
        return ne1Var.c;
    }
}
