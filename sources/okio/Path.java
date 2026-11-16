package okio;

import com.singular.sdk.internal.SLRemoteConfiguration;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.ak1;
import defpackage.e80;
import defpackage.eu;
import defpackage.s71;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0002\b\"J\u0013\u0010#\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\u0006\u0010&\u001a\u00020\u0000J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006/"}, d2 = {"Lokio/Path;", "", "bytes", "Lokio/ByteString;", "(Lokio/ByteString;)V", "getBytes$okio", "()Lokio/ByteString;", "isAbsolute", "", "()Z", "isRelative", "isRoot", "name", "", "()Ljava/lang/String;", "nameBytes", "parent", "()Lokio/Path;", "root", "getRoot", "segments", "", "getSegments", "()Ljava/util/List;", "segmentsBytes", "getSegmentsBytes", "volumeLetter", "", "()Ljava/lang/Character;", "compareTo", "", "other", "div", "child", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "equals", "", "hashCode", "normalized", "relativeTo", "normalize", "toFile", "Ljava/io/File;", "toNioPath", "Ljava/nio/file/Path;", "toString", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Path implements Comparable<Path> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DIRECTORY_SEPARATOR;

    @NotNull
    private final ByteString bytes;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(str, z);
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        @NotNull
        public final Path get(@NotNull File file, boolean z) {
            file.getClass();
            String string = file.toString();
            string.getClass();
            return get(string, z);
        }

        private Companion() {
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(file, z);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.get(path, z);
        }

        @NotNull
        public final Path get(@NotNull String str) {
            str.getClass();
            return get$default(this, str, false, 1, (Object) null);
        }

        @NotNull
        public final Path get(@NotNull java.nio.file.Path path) {
            path.getClass();
            return get$default(this, path, false, 1, (Object) null);
        }

        @NotNull
        public final Path get(@NotNull String str, boolean z) {
            str.getClass();
            return okio.internal.Path.commonToPath(str, z);
        }

        @NotNull
        public final Path get(@NotNull File file) {
            file.getClass();
            return get$default(this, file, false, 1, (Object) null);
        }

        @NotNull
        public final Path get(@NotNull java.nio.file.Path path, boolean z) {
            path.getClass();
            return get(path.toString(), z);
        }
    }

    static {
        String str = File.separator;
        str.getClass();
        DIRECTORY_SEPARATOR = str;
    }

    @NotNull
    public static final Path get(@NotNull File file) {
        return INSTANCE.get(file);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(str, z);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof Path) && s71.b(((Path) other).getBytes(), getBytes());
    }

    @NotNull
    /* JADX INFO: renamed from: getBytes$okio, reason: from getter */
    public final ByteString getBytes() {
        return this.bytes;
    }

    @NotNull
    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        int i = 0;
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes().size();
        int i2 = iRootLength;
        while (iRootLength < size) {
            if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
                arrayList.add(getBytes().substring(i2, iRootLength));
                i2 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i2 < getBytes().size()) {
            arrayList.add(getBytes().substring(i2, getBytes().size()));
        }
        ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ByteString) obj).utf8());
        }
        return arrayList2;
    }

    @NotNull
    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes().size() && getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes().size();
        int i = iRootLength;
        while (iRootLength < size) {
            if (getBytes().getByte(iRootLength) == 47 || getBytes().getByte(iRootLength) == 92) {
                arrayList.add(getBytes().substring(i, iRootLength));
                i = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i < getBytes().size()) {
            arrayList.add(getBytes().substring(i, getBytes().size()));
        }
        return arrayList;
    }

    @NotNull
    public final Path normalized() {
        return INSTANCE.get(toString(), true);
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    public Path(@NotNull ByteString byteString) {
        byteString.getClass();
        this.bytes = byteString;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Path other) {
        other.getClass();
        return getBytes().compareTo(other.getBytes());
    }

    @Nullable
    public final Path getRoot() {
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes().substring(0, iRootLength));
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        if (okio.internal.Path.rootLength(this) != -1) {
            return true;
        }
        return false;
    }

    public final boolean isRelative() {
        if (okio.internal.Path.rootLength(this) == -1) {
            return true;
        }
        return false;
    }

    public final boolean isRoot() {
        if (okio.internal.Path.rootLength(this) == getBytes().size()) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String name() {
        return nameBytes().utf8();
    }

    @NotNull
    public final ByteString nameBytes() {
        int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != -1) {
            return ByteString.substring$default(getBytes(), indexOfLastSlash + 1, 0, 2, null);
        }
        if (volumeLetter() != null && getBytes().size() == 2) {
            return ByteString.EMPTY;
        }
        return getBytes();
    }

    @Nullable
    public final Path parent() {
        if (!s71.b(getBytes(), okio.internal.Path.DOT) && !s71.b(getBytes(), okio.internal.Path.SLASH) && !s71.b(getBytes(), okio.internal.Path.BACKSLASH) && !okio.internal.Path.lastSegmentIsDotDot(this)) {
            int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
            if (indexOfLastSlash == 2 && volumeLetter() != null) {
                if (getBytes().size() == 3) {
                    return null;
                }
                return new Path(ByteString.substring$default(getBytes(), 0, 3, 1, null));
            }
            if (indexOfLastSlash == 1 && getBytes().startsWith(okio.internal.Path.BACKSLASH)) {
                return null;
            }
            if (indexOfLastSlash == -1 && volumeLetter() != null) {
                if (getBytes().size() == 2) {
                    return null;
                }
                return new Path(ByteString.substring$default(getBytes(), 0, 2, 1, null));
            }
            if (indexOfLastSlash == -1) {
                return new Path(okio.internal.Path.DOT);
            }
            if (indexOfLastSlash == 0) {
                return new Path(ByteString.substring$default(getBytes(), 0, 1, 1, null));
            }
            return new Path(ByteString.substring$default(getBytes(), 0, indexOfLastSlash, 1, null));
        }
        return null;
    }

    @NotNull
    public final Path relativeTo(@NotNull Path other) {
        other.getClass();
        if (s71.b(getRoot(), other.getRoot())) {
            List<ByteString> segmentsBytes = getSegmentsBytes();
            List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
            int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
            int i = 0;
            while (i < iMin && s71.b(segmentsBytes.get(i), segmentsBytes2.get(i))) {
                i++;
            }
            if (i == iMin && getBytes().size() == other.getBytes().size()) {
                return Companion.get$default(INSTANCE, UserDetailsUtils.UserDetailsLiterals.DOT, false, 1, (Object) null);
            }
            if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(okio.internal.Path.DOT_DOT) == -1) {
                Buffer buffer = new Buffer();
                ByteString slash = okio.internal.Path.getSlash(other);
                if (slash == null && (slash = okio.internal.Path.getSlash(this)) == null) {
                    slash = okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
                }
                int size = segmentsBytes2.size();
                for (int i2 = i; i2 < size; i2++) {
                    buffer.write(okio.internal.Path.DOT_DOT);
                    buffer.write(slash);
                }
                int size2 = segmentsBytes.size();
                while (i < size2) {
                    buffer.write(segmentsBytes.get(i));
                    buffer.write(slash);
                    i++;
                }
                return okio.internal.Path.toPath(buffer, false);
            }
            ak1.f(this, other, "Impossible relative path to resolve: ");
            return null;
        }
        ak1.f(this, other, "Paths of different roots cannot be relative to each other: ");
        return null;
    }

    @NotNull
    public final Path resolve(@NotNull String child) {
        child.getClass();
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), false);
    }

    @NotNull
    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        path.getClass();
        return path;
    }

    @NotNull
    public String toString() {
        return getBytes().utf8();
    }

    @Nullable
    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes(), okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes().size() < 2 || getBytes().getByte(1) != 58) {
            return null;
        }
        char c = (char) getBytes().getByte(0);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return null;
        }
        return Character.valueOf(c);
    }

    @NotNull
    public static final Path get(@NotNull File file, boolean z) {
        return INSTANCE.get(file, z);
    }

    @NotNull
    public static final Path get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @NotNull
    public static final Path get(@NotNull String str, boolean z) {
        return INSTANCE.get(str, z);
    }

    @NotNull
    public static final Path get(@NotNull java.nio.file.Path path) {
        return INSTANCE.get(path);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(byteString, z);
    }

    @NotNull
    public static final Path get(@NotNull java.nio.file.Path path, boolean z) {
        return INSTANCE.get(path, z);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return path.resolve(path2, z);
    }

    @NotNull
    public final Path resolve(@NotNull Path child, boolean normalize) {
        child.getClass();
        return okio.internal.Path.commonResolve(this, child, normalize);
    }

    @NotNull
    public final Path resolve(@NotNull Path child) {
        child.getClass();
        return okio.internal.Path.commonResolve(this, child, false);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString child) {
        child.getClass();
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), false);
    }

    @NotNull
    public final Path resolve(@NotNull String child, boolean normalize) {
        child.getClass();
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), normalize);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString child, boolean normalize) {
        child.getClass();
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), normalize);
    }
}
