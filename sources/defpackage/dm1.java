package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 {
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final String a;
    public final String b;
    public final List c;

    public static final CopyOnWriteArraySet a() {
        if (lz.a.contains(dm1.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            lz.a(dm1.class, th);
            return null;
        }
    }

    public final ArrayList b() {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            return new ArrayList(this.c);
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    public final String c() {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    public dm1(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
