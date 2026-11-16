package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    public final ArrayList a = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void s(int i) {
        b(i, null);
    }

    public final void b(int i, Object obj) {
        int size;
        int i2 = i - 1;
        ArrayList arrayList = this.a;
        if (i2 >= arrayList.size() && (size = arrayList.size()) <= i2) {
            while (true) {
                arrayList.add(null);
                if (size == i2) {
                    break;
                } else {
                    size++;
                }
            }
        }
        arrayList.set(i2, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void J(int i, double d) {
        b(i, Double.valueOf(d));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void l(int i, String str) {
        b(i, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void m(int i, long j) {
        b(i, Long.valueOf(j));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void p(int i, byte[] bArr) {
        b(i, bArr);
    }
}
