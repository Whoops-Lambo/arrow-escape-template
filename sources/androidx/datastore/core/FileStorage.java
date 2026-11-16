package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/FileStorage;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Storage;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileStorage<T> implements Storage<T> {
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final Object e = new Object();
    public final Serializer a;
    public final wr0 b;
    public final sr0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.datastore.core.FileStorage$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/datastore/core/InterProcessCoordinator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public final class AnonymousClass1 extends rc1 implements wr0 {
        public static final AnonymousClass1 i = new AnonymousClass1(1);

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            File file = (File) obj;
            file.getClass();
            String absolutePath = file.getCanonicalFile().getAbsolutePath();
            absolutePath.getClass();
            return new SingleProcessCoordinator(absolutePath);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/FileStorage$Companion;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public FileStorage(Serializer serializer, wr0 wr0Var, sr0 sr0Var) {
        serializer.getClass();
        this.a = serializer;
        this.b = wr0Var;
        this.c = sr0Var;
    }

    public /* synthetic */ FileStorage(Serializer serializer, sr0 sr0Var) {
        this(serializer, AnonymousClass1.i, sr0Var);
    }
}
