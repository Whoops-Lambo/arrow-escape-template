package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o7 implements AbstractMessage.BuilderParent {
    public AbstractMessage.BuilderParent a;
    public List b;
    public boolean c;
    public ArrayList d;
    public boolean e;
    public m7 f;
    public l7 g;
    public n7 h;

    public final List f() {
        this.e = true;
        boolean z = this.c;
        if (!z && this.d == null) {
            return this.b;
        }
        if (!z) {
            int i = 0;
            while (true) {
                int size = this.b.size();
                List list = this.b;
                if (i >= size) {
                    return list;
                }
                Message message = (Message) list.get(i);
                v7 v7Var = (v7) this.d.get(i);
                if (v7Var != null && v7Var.a() != message) {
                    break;
                }
                i++;
            }
        }
        i();
        int i2 = 0;
        while (true) {
            int size2 = this.b.size();
            List list2 = this.b;
            if (i2 >= size2) {
                List listUnmodifiableList = Collections.unmodifiableList(list2);
                this.b = listUnmodifiableList;
                this.c = false;
                return listUnmodifiableList;
            }
            list2.set(i2, l(i2, true));
            i2++;
        }
    }

    public final void d(int i, AbstractMessage abstractMessage) {
        Charset charset = l5.a;
        abstractMessage.getClass();
        i();
        this.b.add(i, abstractMessage);
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            arrayList.add(i, null);
        }
        q();
        p();
    }

    public final void e(AbstractMessage abstractMessage) {
        Charset charset = l5.a;
        abstractMessage.getClass();
        i();
        this.b.add(abstractMessage);
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            arrayList.add(null);
        }
        q();
        p();
    }

    public final void g() {
        this.b = Collections.EMPTY_LIST;
        int i = 0;
        this.c = false;
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                v7 v7Var = (v7) obj;
                if (v7Var != null) {
                    v7Var.a = null;
                }
            }
            this.d = null;
        }
        q();
        p();
    }

    public final void h() {
        if (this.d == null) {
            this.d = new ArrayList(this.b.size());
            for (int i = 0; i < this.b.size(); i++) {
                this.d.add(null);
            }
        }
    }

    public final void i() {
        if (this.c) {
            return;
        }
        this.b = new ArrayList(this.b);
        this.c = true;
    }

    public final l7 k() {
        if (this.g == null) {
            this.g = new l7(this);
        }
        return this.g;
    }

    public final AbstractMessage l(int i, boolean z) {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return (AbstractMessage) this.b.get(i);
        }
        v7 v7Var = (v7) arrayList.get(i);
        if (v7Var == null) {
            return (AbstractMessage) this.b.get(i);
        }
        return z ? v7Var.a() : v7Var.d();
    }

    public final m7 m() {
        if (this.f == null) {
            this.f = new m7(this);
        }
        return this.f;
    }

    public final MessageOrBuilder n(int i) {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return (MessageOrBuilder) this.b.get(i);
        }
        v7 v7Var = (v7) arrayList.get(i);
        return v7Var == null ? (MessageOrBuilder) this.b.get(i) : v7Var.e();
    }

    public final n7 o() {
        if (this.h == null) {
            this.h = new n7(this);
        }
        return this.h;
    }

    public final void p() {
        m7 m7Var = this.f;
        if (m7Var != null) {
            m7Var.c();
        }
        l7 l7Var = this.g;
        if (l7Var != null) {
            l7Var.c();
        }
        n7 n7Var = this.h;
        if (n7Var != null) {
            n7Var.c();
        }
    }

    public final void q() {
        AbstractMessage.BuilderParent builderParent;
        if (!this.e || (builderParent = this.a) == null) {
            return;
        }
        builderParent.markDirty();
        this.e = false;
    }

    public final void s(int i, AbstractMessage abstractMessage) {
        v7 v7Var;
        Charset charset = l5.a;
        abstractMessage.getClass();
        i();
        this.b.set(i, abstractMessage);
        ArrayList arrayList = this.d;
        if (arrayList != null && (v7Var = (v7) arrayList.set(i, null)) != null) {
            v7Var.a = null;
        }
        q();
        p();
    }

    public o7(List list, boolean z, h4 h4Var, boolean z2) {
        this.b = list;
        this.c = z;
        this.a = h4Var;
        this.e = z2;
    }

    public final void a(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractMessage abstractMessage = (AbstractMessage) it.next();
            Charset charset = l5.a;
            abstractMessage.getClass();
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return;
            } else {
                size = collection.size();
            }
        } else {
            size = -1;
        }
        i();
        if (size >= 0) {
            List list = this.b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            e((AbstractMessage) it2.next());
        }
        q();
        p();
    }

    public final AbstractMessage.Builder b(int i, y4 y4Var) {
        i();
        h();
        v7 v7Var = new v7(y4Var, this, this.e);
        this.b.add(i, null);
        this.d.add(i, v7Var);
        q();
        p();
        return v7Var.c();
    }

    public final AbstractMessage.Builder c(y4 y4Var) {
        i();
        h();
        v7 v7Var = new v7(y4Var, this, this.e);
        this.b.add(null);
        this.d.add(v7Var);
        q();
        p();
        return v7Var.c();
    }

    public final AbstractMessage.Builder j(int i) {
        h();
        v7 v7Var = (v7) this.d.get(i);
        if (v7Var == null) {
            v7 v7Var2 = new v7((AbstractMessage) this.b.get(i), this, this.e);
            this.d.set(i, v7Var2);
            v7Var = v7Var2;
        }
        return v7Var.c();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public final void markDirty() {
        q();
    }

    public final void r(int i) {
        v7 v7Var;
        i();
        this.b.remove(i);
        ArrayList arrayList = this.d;
        if (arrayList != null && (v7Var = (v7) arrayList.remove(i)) != null) {
            v7Var.a = null;
        }
        q();
        p();
    }
}
