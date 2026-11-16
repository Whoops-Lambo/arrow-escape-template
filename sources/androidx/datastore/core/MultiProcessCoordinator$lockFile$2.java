package androidx.datastore.core;

import defpackage.rc1;
import defpackage.sr0;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class MultiProcessCoordinator$lockFile$2 extends rc1 implements sr0 {
    public final /* synthetic */ MultiProcessCoordinator i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lockFile$2(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.i = multiProcessCoordinator;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        MultiProcessCoordinator multiProcessCoordinator = this.i;
        File file = new File(multiProcessCoordinator.b.getAbsolutePath() + multiProcessCoordinator.d);
        MultiProcessCoordinator.f(multiProcessCoordinator, file);
        return file;
    }
}
