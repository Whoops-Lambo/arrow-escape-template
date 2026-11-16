package defpackage;

import java.io.IOException;
import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lc0 extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink sink(Path path, boolean z) throws IOException {
        Path pathParent = path.parent();
        if (pathParent != null) {
            createDirectories(pathParent);
        }
        return super.sink(path, z);
    }
}
