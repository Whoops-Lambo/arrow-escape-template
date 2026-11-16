package androidx.sqlite.db;

import java.io.Closeable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteProgram;", "Ljava/io/Closeable;", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SupportSQLiteProgram extends Closeable {
    void J(int i, double d);

    void l(int i, String str);

    void m(int i, long j);

    void p(int i, byte[] bArr);

    void s(int i);
}
