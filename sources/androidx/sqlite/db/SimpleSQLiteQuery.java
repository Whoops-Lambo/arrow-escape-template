package androidx.sqlite.db;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Companion", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    public final String a;
    public final Object[] b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static void a(SupportSQLiteProgram supportSQLiteProgram, Object[] objArr) {
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    supportSQLiteProgram.s(i);
                } else if (obj instanceof byte[]) {
                    supportSQLiteProgram.p(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    supportSQLiteProgram.J(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    supportSQLiteProgram.J(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    supportSQLiteProgram.m(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    supportSQLiteProgram.m(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    supportSQLiteProgram.m(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    supportSQLiteProgram.m(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    supportSQLiteProgram.l(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    supportSQLiteProgram.m(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void f(SupportSQLiteProgram supportSQLiteProgram) {
        Companion.a(supportSQLiteProgram, this.b);
    }

    public SimpleSQLiteQuery(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }
}
