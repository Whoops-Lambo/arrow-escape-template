package com.fyber.inneractive.sdk.protobuf;

import defpackage.e32;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ e3 d;

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.b.size()) {
            return (Map.Entry) this.d.b.get(this.a);
        }
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return (Map.Entry) this.c.next();
    }

    public c3(e3 e3Var) {
        this.d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a + 1 >= this.d.b.size()) {
            if (this.d.c.isEmpty()) {
                return false;
            }
            if (this.c == null) {
                this.c = this.d.c.entrySet().iterator();
            }
            if (!this.c.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            e32.i("remove() was called before next()");
            return;
        }
        this.b = false;
        e3 e3Var = this.d;
        int i = e3.h;
        e3Var.a();
        if (this.a >= this.d.b.size()) {
            if (this.c == null) {
                this.c = this.d.c.entrySet().iterator();
            }
            this.c.remove();
            return;
        }
        e3 e3Var2 = this.d;
        int i2 = this.a;
        this.a = i2 - 1;
        e3Var2.a();
        Object obj = ((b3) e3Var2.b.remove(i2)).b;
        if (e3Var2.c.isEmpty()) {
            return;
        }
        Iterator it = e3Var2.c().entrySet().iterator();
        e3Var2.b.add(new b3(e3Var2, (Map.Entry) it.next()));
        it.remove();
    }
}
