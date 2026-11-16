package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p81 implements Iterator {
    public static final p81 a;
    public static final /* synthetic */ p81[] b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        fs1.n("no calls to next() since the last call to remove()", false);
    }

    static {
        p81 p81Var = new p81("INSTANCE", 0);
        a = p81Var;
        b = new p81[]{p81Var};
    }

    public static p81 valueOf(String str) {
        return (p81) Enum.valueOf(p81.class, str);
    }

    public static p81[] values() {
        return (p81[]) b.clone();
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }
}
