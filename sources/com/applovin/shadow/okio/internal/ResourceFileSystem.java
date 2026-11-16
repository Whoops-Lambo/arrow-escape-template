package com.applovin.shadow.okio.internal;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import defpackage.cm2;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.du;
import defpackage.e80;
import defpackage.eu;
import defpackage.gd1;
import defpackage.iu;
import defpackage.kk2;
import defpackage.n30;
import defpackage.s71;
import defpackage.vq2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u0010*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020/2\u0006\u0010)\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020/2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u00101J\u001f\u00106\u001a\u00020/2\u0006\u0010)\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R-\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/applovin/shadow/okio/internal/ResourceFileSystem;", "Lcom/applovin/shadow/okio/FileSystem;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "Lcom/applovin/shadow/okio/Path;", "path", "canonicalizeInternal", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "", "toRelativePath", "(Lcom/applovin/shadow/okio/Path;)Ljava/lang/String;", "", "Ldt1;", "toClasspathRoots", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "toFileRoot", "(Ljava/net/URL;)Ldt1;", "toJarRoot", "canonicalize", "dir", "list", "(Lcom/applovin/shadow/okio/Path;)Ljava/util/List;", "listOrNull", "file", "Lcom/applovin/shadow/okio/FileHandle;", "openReadOnly", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lcom/applovin/shadow/okio/Path;ZZ)Lcom/applovin/shadow/okio/FileHandle;", "Lcom/applovin/shadow/okio/FileMetadata;", "metadataOrNull", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/FileMetadata;", "Lcom/applovin/shadow/okio/Source;", "source", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/Sink;", "sink", "(Lcom/applovin/shadow/okio/Path;Z)Lcom/applovin/shadow/okio/Sink;", "appendingSink", "Laz2;", "createDirectory", "(Lcom/applovin/shadow/okio/Path;Z)V", "target", "atomicMove", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)V", "delete", "createSymlink", "Ljava/lang/ClassLoader;", "Lcom/applovin/shadow/okio/FileSystem;", "roots$delegate", "Lgd1;", "getRoots", "()Ljava/util/List;", "roots", "Companion", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceFileSystem extends FileSystem {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Path ROOT = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);

    @NotNull
    private final ClassLoader classLoader;

    /* JADX INFO: renamed from: roots$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 roots;

    @NotNull
    private final FileSystem systemFileSystem;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/applovin/shadow/okio/internal/ResourceFileSystem$Companion;", "", "()V", NativeAdContent.ViewTag.ROOT, "Lcom/applovin/shadow/okio/Path;", "getROOT", "()Lokio/Path;", "keepPath", "", "path", "removeBase", TtmlNode.RUBY_BASE, "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !kk2.C(path.name(), ".class", true);
        }

        @NotNull
        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        @NotNull
        public final Path removeBase(@NotNull Path path, @NotNull Path path2) {
            path.getClass();
            path2.getClass();
            String string = path2.toString();
            Path root = getROOT();
            String strReplace = dk2.g0(path.toString(), string).replace('\\', '/');
            strReplace.getClass();
            return root.resolve(strReplace);
        }

        private Companion() {
        }
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<dt1> getRoots() {
        return (List) this.roots.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<dt1> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        resources.getClass();
        ArrayList list = Collections.list(resources);
        list.getClass();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            i2++;
            URL url = (URL) obj;
            url.getClass();
            dt1 fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        resources2.getClass();
        ArrayList list2 = Collections.list(resources2);
        list2.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size2 = list2.size();
        while (i < size2) {
            Object obj2 = list2.get(i);
            i++;
            URL url2 = (URL) obj2;
            url2.getClass();
            dt1 jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return du.o0(arrayList2, arrayList);
    }

    public ResourceFileSystem(@NotNull ClassLoader classLoader, boolean z, @NotNull FileSystem fileSystem) {
        classLoader.getClass();
        fileSystem.getClass();
        this.classLoader = classLoader;
        this.systemFileSystem = fileSystem;
        this.roots = new cm2(new ResourceFileSystem$roots$2(this));
        if (z) {
            getRoots().size();
        }
    }

    private final dt1 toFileRoot(URL url) {
        if (!s71.b(url.getProtocol(), "file")) {
            return null;
        }
        return new dt1(this.systemFileSystem, Path.Companion.get$default(Path.INSTANCE, new File(url.toURI()), false, 1, (Object) null));
    }

    private final dt1 toJarRoot(URL url) {
        int iA0;
        String string = url.toString();
        string.getClass();
        if (!kk2.L(string, "jar:file:", false) || (iA0 = dk2.a0(6, string, "!")) == -1) {
            return null;
        }
        return new dt1(ZipFilesKt.openZip(Path.Companion.get$default(Path.INSTANCE, new File(URI.create(string.substring(4, iA0))), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path file, boolean mustExist) throws IOException {
        file.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(@NotNull Path source, @NotNull Path target) throws IOException {
        source.getClass();
        target.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) {
        path.getClass();
        return canonicalizeInternal(path);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(@NotNull Path dir, boolean mustCreate) throws IOException {
        dir.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(@NotNull Path source, @NotNull Path target) throws IOException {
        source.getClass();
        target.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(@NotNull Path path, boolean mustExist) throws IOException {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path dir) throws FileNotFoundException {
        dir.getClass();
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (dt1 dt1Var : getRoots()) {
            FileSystem fileSystem = (FileSystem) dt1Var.a;
            Path path = (Path) dt1Var.b;
            try {
                List<Path> list = fileSystem.list(path.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(Companion.removeBase((Path) obj2, path));
                }
                iu.N(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return du.z0(linkedHashSet);
        }
        vq2.w(n30.h(dir, "file not found: "));
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path dir) {
        dir.getClass();
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<dt1> it = getRoots().iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            dt1 next = it.next();
            FileSystem fileSystem = (FileSystem) next.a;
            Path path = (Path) next.b;
            List<Path> listListOrNull = fileSystem.listOrNull(path.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(eu.f(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    arrayList3.add(Companion.removeBase((Path) obj2, path));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                iu.N(arrayList, linkedHashSet);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return du.z0(linkedHashSet);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path) throws IOException {
        path.getClass();
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (dt1 dt1Var : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) dt1Var.a).metadataOrNull(((Path) dt1Var.b).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path file) throws FileNotFoundException {
        file.getClass();
        if (Companion.keepPath(file)) {
            String relativePath = toRelativePath(file);
            Iterator<dt1> it = getRoots().iterator();
            while (it.hasNext()) {
                dt1 next = it.next();
                try {
                    return ((FileSystem) next.a).openReadOnly(((Path) next.b).resolve(relativePath));
                } catch (FileNotFoundException unused) {
                }
            }
            vq2.w(n30.h(file, "file not found: "));
            return null;
        }
        vq2.w(n30.h(file, "file not found: "));
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path file, boolean mustCreate, boolean mustExist) throws IOException {
        file.getClass();
        throw new IOException("resources are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path file, boolean mustCreate) throws IOException {
        file.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    @NotNull
    public Source source(@NotNull Path file) throws FileNotFoundException {
        Source source;
        file.getClass();
        if (Companion.keepPath(file)) {
            Path path = ROOT;
            InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
            if (resourceAsStream != null && (source = Okio.source(resourceAsStream)) != null) {
                return source;
            }
            vq2.w(n30.h(file, "file not found: "));
            return null;
        }
        vq2.w(n30.h(file, "file not found: "));
        return null;
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z, FileSystem fileSystem, int i, e80 e80Var) {
        this(classLoader, z, (i & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }
}
