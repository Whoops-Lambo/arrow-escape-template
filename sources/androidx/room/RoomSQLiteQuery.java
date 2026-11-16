package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import defpackage.d;
import defpackage.e32;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "Binding", "Companion", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    public static final TreeMap i = new TreeMap();
    public final int a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public int h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface Binding {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "", "BLOB", "I", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public static final RoomSQLiteQuery b(int i2, String str) {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (entryCeilingEntry == null) {
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i2);
                roomSQLiteQuery.b = str;
                roomSQLiteQuery.h = i2;
                return roomSQLiteQuery;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            RoomSQLiteQuery roomSQLiteQuery2 = (RoomSQLiteQuery) entryCeilingEntry.getValue();
            roomSQLiteQuery2.getClass();
            roomSQLiteQuery2.b = str;
            roomSQLiteQuery2.h = i2;
            return roomSQLiteQuery2;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void J(int i2, double d) {
        this.g[i2] = 3;
        this.d[i2] = d;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* JADX INFO: renamed from: d */
    public final String getA() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        e32.i("Required value was null.");
        return null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void f(SupportSQLiteProgram supportSQLiteProgram) {
        int i2 = this.h;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int i4 = this.g[i3];
            if (i4 == 1) {
                supportSQLiteProgram.s(i3);
            } else if (i4 == 2) {
                supportSQLiteProgram.m(i3, this.c[i3]);
            } else if (i4 == 3) {
                supportSQLiteProgram.J(i3, this.d[i3]);
            } else if (i4 == 4) {
                String str = this.e[i3];
                if (str == null) {
                    d.r("Required value was null.");
                    return;
                }
                supportSQLiteProgram.l(i3, str);
            } else if (i4 == 5) {
                byte[] bArr = this.f[i3];
                if (bArr == null) {
                    d.r("Required value was null.");
                    return;
                }
                supportSQLiteProgram.p(i3, bArr);
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void m(int i2, long j) {
        this.g[i2] = 2;
        this.c[i2] = j;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void p(int i2, byte[] bArr) {
        this.g[i2] = 5;
        this.f[i2] = bArr;
    }

    public final void release() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void s(int i2) {
        this.g[i2] = 1;
    }

    public RoomSQLiteQuery(int i2) {
        this.a = i2;
        int i3 = i2 + 1;
        this.g = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3][];
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void l(int i2, String str) {
        str.getClass();
        this.g[i2] = 4;
        this.e[i2] = str;
    }
}
