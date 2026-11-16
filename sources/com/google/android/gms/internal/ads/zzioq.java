package com.google.android.gms.internal.ads;

import com.ironsource.C4664b4;
import defpackage.zz4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class zzioq implements Iterator, Closeable, zzavm {
    public static final zz4 g = new zz4("eof ");
    public zzavi a;
    public zzior b;
    public zzavl c = null;
    public long d = 0;
    public long e = 0;
    public final ArrayList f = new ArrayList();

    public void close() {
    }

    static {
        zziox.b(zzioq.class);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final zzavl next() {
        zzavl zzavlVarA;
        zzavl zzavlVar = this.c;
        if (zzavlVar != null && zzavlVar != g) {
            this.c = null;
            return zzavlVar;
        }
        zzior zziorVar = this.b;
        if (zziorVar == null || this.d >= this.e) {
            this.c = g;
            defpackage.d.v();
            return null;
        }
        try {
            synchronized (zziorVar) {
                this.b.j(this.d);
                zzavlVarA = this.a.a(this.b, this);
                this.d = this.b.zzc();
            }
            return zzavlVarA;
        } catch (EOFException unused) {
            defpackage.d.v();
            return null;
        } catch (IOException unused2) {
            defpackage.d.v();
            return null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzavl zzavlVar = this.c;
        zz4 zz4Var = g;
        if (zzavlVar == zz4Var) {
            return false;
        }
        if (zzavlVar != null) {
            return true;
        }
        try {
            this.c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.c = zz4Var;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(C4664b4.j.d);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                sb.append(C4664b4.j.e);
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzavl) arrayList.get(i)).toString());
            i++;
        }
    }
}
