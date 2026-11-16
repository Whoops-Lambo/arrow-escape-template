package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class w2 implements Iterator {
    public int a;
    public Iterator b;
    public final /* synthetic */ e3 c;

    public w2(e3 e3Var) {
        this.c = e3Var;
        this.a = e3Var.b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i > 0 && i <= this.c.b.size()) {
            return true;
        }
        if (this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        if (this.b.hasNext()) {
            if (this.b == null) {
                this.b = this.c.f.entrySet().iterator();
            }
            return (Map.Entry) this.b.next();
        }
        List list = this.c.b;
        int i = this.a - 1;
        this.a = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
