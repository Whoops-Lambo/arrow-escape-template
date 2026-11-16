package com.moloco.sdk.acm.db;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends SharedSQLiteStatement {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(RoomDatabase roomDatabase, int i) {
        super(roomDatabase);
        this.d = i;
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String b() {
        switch (this.d) {
            case 0:
                return "DELETE FROM events";
            case 1:
                return "DELETE FROM sqlite_sequence WHERE name='events'";
            case 2:
                return "DELETE FROM crash_reports WHERE id IN (SELECT id FROM crash_reports ORDER BY created_at_ms ASC LIMIT ?)";
            case 3:
                return "UPDATE crash_reports SET attempt_count = attempt_count + 1 WHERE id = ?";
            case 4:
                return "UPDATE crash_reports SET not_before_ms = ? WHERE id = ?";
            case 5:
                return "DELETE FROM crash_reports WHERE id = ?";
            default:
                return "DELETE FROM crash_reports WHERE created_at_ms < ? OR attempt_count >= ?";
        }
    }
}
