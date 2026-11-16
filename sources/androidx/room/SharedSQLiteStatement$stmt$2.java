package androidx.room;

import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/sqlite/db/SupportSQLiteStatement;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
final class SharedSQLiteStatement$stmt$2 extends rc1 implements sr0 {
    public final /* synthetic */ SharedSQLiteStatement i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSQLiteStatement$stmt$2(SharedSQLiteStatement sharedSQLiteStatement) {
        super(0);
        this.i = sharedSQLiteStatement;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        SharedSQLiteStatement sharedSQLiteStatement = this.i;
        return sharedSQLiteStatement.a.compileStatement(sharedSQLiteStatement.b());
    }
}
