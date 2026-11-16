package okio;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.d;
import defpackage.e80;
import defpackage.l7;
import defpackage.l92;
import defpackage.wr0;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import okio.internal.ResourceFileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010#J5\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010\u0019\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00028\u00000%H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b,\u0010-J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b,\u0010.J?\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u00000%H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b4\u0010-J\u0015\u00104\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b4\u0010.J!\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\fH&¢\u0006\u0004\b6\u00107J\u0015\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b6\u00108J\u001f\u00109\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b9\u00107J\u0015\u00109\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b9\u00108J\u001f\u0010;\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H&¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010<J!\u0010>\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b>\u00107J\u0015\u0010>\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b>\u00108J!\u0010@\u001a\u0002052\u0006\u0010?\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u00107J\u0015\u0010@\u001a\u0002052\u0006\u0010?\u001a\u00020\u0004¢\u0006\u0004\b@\u00108J\u001f\u0010A\u001a\u0002052\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H&¢\u0006\u0004\bA\u0010<\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"Lokio/FileSystem;", "", "<init>", "()V", "Lokio/Path;", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadata", "(Lokio/Path;)Lokio/FileMetadata;", "metadataOrNull", "", "exists", "(Lokio/Path;)Z", "dir", "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "followSymlinks", "Ll92;", "listRecursively", "(Lokio/Path;Z)Ll92;", "(Lokio/Path;)Ll92;", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lokio/BufferedSource;", "readerAction", "-read", "(Lokio/Path;Lwr0;)Ljava/lang/Object;", "read", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "(Lokio/Path;)Lokio/Sink;", "Lokio/BufferedSink;", "writerAction", "-write", "(Lokio/Path;ZLwr0;)Ljava/lang/Object;", "write", "appendingSink", "Laz2;", "createDirectory", "(Lokio/Path;Z)V", "(Lokio/Path;)V", "createDirectories", "target", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "copy", "delete", "fileOrDirectory", "deleteRecursively", "createSymlink", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileSystem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final FileSystem RESOURCES;

    @NotNull
    public static final FileSystem SYSTEM;

    @NotNull
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m1382write$default(FileSystem fileSystem, Path path, boolean z, wr0 wr0Var, int i, Object obj) throws Throwable {
        Object objInvoke;
        Throwable th = null;
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: write");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        path.getClass();
        wr0Var.getClass();
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path, z));
        try {
            objInvoke = wr0Var.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    l7.a(th3, th4);
                }
            }
            th = th3;
            objInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        objInvoke.getClass();
        return objInvoke;
    }

    @NotNull
    public abstract Sink appendingSink(@NotNull Path file, boolean mustExist) throws IOException;

    public abstract void atomicMove(@NotNull Path source, @NotNull Path target) throws IOException;

    @NotNull
    public abstract Path canonicalize(@NotNull Path path) throws IOException;

    public abstract void createDirectory(@NotNull Path dir, boolean mustCreate) throws IOException;

    public abstract void createSymlink(@NotNull Path source, @NotNull Path target) throws IOException;

    public abstract void delete(@NotNull Path path, boolean mustExist) throws IOException;

    @NotNull
    public abstract List<Path> list(@NotNull Path dir) throws IOException;

    @Nullable
    public abstract List<Path> listOrNull(@NotNull Path dir);

    @Nullable
    public abstract FileMetadata metadataOrNull(@NotNull Path path) throws IOException;

    @NotNull
    public abstract FileHandle openReadOnly(@NotNull Path file) throws IOException;

    @NotNull
    public abstract FileHandle openReadWrite(@NotNull Path file, boolean mustCreate, boolean mustExist) throws IOException;

    @NotNull
    public abstract Sink sink(@NotNull Path file, boolean mustCreate) throws IOException;

    @NotNull
    public abstract Source source(@NotNull Path file) throws IOException;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokio/FileSystem$Companion;", "", "()V", "RESOURCES", "Lokio/FileSystem;", "SYSTEM", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "asOkioFileSystem", "Ljava/nio/file/FileSystem;", "get", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        @NotNull
        public final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
            fileSystem.getClass();
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        classLoader.getClass();
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: appendingSink");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.appendingSink(path, z);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: createDirectories");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectories(path, z);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: createDirectory");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectory(path, z);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: delete");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.delete(path, z);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: deleteRecursively");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.deleteRecursively(path, z);
    }

    @NotNull
    public static final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
        return INSTANCE.get(fileSystem);
    }

    public static /* synthetic */ l92 listRecursively$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: listRecursively");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.listRecursively(path, z);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z, boolean z2, int i, Object obj) throws IOException {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: openReadWrite");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return fileSystem.openReadWrite(path, z, z2);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            d.u("Super calls with default arguments not supported in this target, function: sink");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.sink(path, z);
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m1383read(@NotNull Path file, @NotNull wr0 readerAction) throws Throwable {
        T t;
        file.getClass();
        readerAction.getClass();
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        Throwable th = null;
        try {
            t = (T) readerAction.invoke(bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th4) {
                    l7.a(th3, th4);
                }
            }
            t = null;
            th = th3;
        }
        if (th == null) {
            t.getClass();
            return t;
        }
        throw th;
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m1384write(@NotNull Path file, boolean mustCreate, @NotNull wr0 writerAction) throws Throwable {
        T t;
        file.getClass();
        writerAction.getClass();
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, mustCreate));
        Throwable th = null;
        try {
            t = (T) writerAction.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    l7.a(th3, th4);
                }
            }
            t = null;
            th = th3;
        }
        if (th == null) {
            t.getClass();
            return t;
        }
        throw th;
    }

    @NotNull
    public final Sink appendingSink(@NotNull Path file) throws IOException {
        file.getClass();
        return appendingSink(file, false);
    }

    public void copy(@NotNull Path source, @NotNull Path target) throws IOException {
        source.getClass();
        target.getClass();
        okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(@NotNull Path dir) throws IOException {
        dir.getClass();
        createDirectories(dir, false);
    }

    public final void createDirectory(@NotNull Path dir) throws IOException {
        dir.getClass();
        createDirectory(dir, false);
    }

    public final void delete(@NotNull Path path) throws IOException {
        path.getClass();
        delete(path, false);
    }

    public final void deleteRecursively(@NotNull Path fileOrDirectory) throws IOException {
        fileOrDirectory.getClass();
        deleteRecursively(fileOrDirectory, false);
    }

    public final boolean exists(@NotNull Path path) throws IOException {
        path.getClass();
        return okio.internal.FileSystem.commonExists(this, path);
    }

    @NotNull
    public final l92 listRecursively(@NotNull Path dir) {
        dir.getClass();
        return listRecursively(dir, false);
    }

    @NotNull
    public final FileMetadata metadata(@NotNull Path path) throws IOException {
        path.getClass();
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    @NotNull
    public final FileHandle openReadWrite(@NotNull Path file) throws IOException {
        file.getClass();
        return openReadWrite(file, false, false);
    }

    @NotNull
    public final Sink sink(@NotNull Path file) throws IOException {
        file.getClass();
        return sink(file, false);
    }

    public final void createDirectories(@NotNull Path dir, boolean mustCreate) throws IOException {
        dir.getClass();
        okio.internal.FileSystem.commonCreateDirectories(this, dir, mustCreate);
    }

    public void deleteRecursively(@NotNull Path fileOrDirectory, boolean mustExist) throws IOException {
        fileOrDirectory.getClass();
        okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, mustExist);
    }

    @NotNull
    public l92 listRecursively(@NotNull Path dir, boolean followSymlinks) {
        dir.getClass();
        return okio.internal.FileSystem.commonListRecursively(this, dir, followSymlinks);
    }
}
