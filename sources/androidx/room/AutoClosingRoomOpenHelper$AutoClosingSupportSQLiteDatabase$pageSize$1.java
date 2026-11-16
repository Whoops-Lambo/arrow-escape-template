package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import defpackage.jp1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1 extends jp1 {
    @Override // defpackage.jp1, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).O());
    }

    @Override // defpackage.jp1, kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        ((SupportSQLiteDatabase) obj).m0(((Number) obj2).longValue());
    }
}
