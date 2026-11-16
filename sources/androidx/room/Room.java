package androidx.room;

import android.content.Context;
import defpackage.d;
import defpackage.dk2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/Room;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Room {
    public static final RoomDatabase.Builder a(Context context, Class cls, String str) {
        if (!dk2.Z(str)) {
            return new RoomDatabase.Builder(context, cls, str);
        }
        d.r("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }
}
