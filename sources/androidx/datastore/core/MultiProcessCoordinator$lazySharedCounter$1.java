package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import defpackage.rc1;
import defpackage.sr0;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/datastore/core/SharedCounter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class MultiProcessCoordinator$lazySharedCounter$1 extends rc1 implements sr0 {
    public final /* synthetic */ MultiProcessCoordinator i;

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements sr0 {
        public final /* synthetic */ MultiProcessCoordinator i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiProcessCoordinator multiProcessCoordinator) {
            super(0);
            this.i = multiProcessCoordinator;
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            MultiProcessCoordinator multiProcessCoordinator = this.i;
            File file = new File(multiProcessCoordinator.b.getAbsolutePath() + multiProcessCoordinator.e);
            MultiProcessCoordinator.f(multiProcessCoordinator, file);
            return file;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lazySharedCounter$1(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.i = multiProcessCoordinator;
    }

    @Override // defpackage.sr0
    public final Object invoke() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        System.loadLibrary("datastore_shared_counter");
        try {
            parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new AnonymousClass1(this.i).invoke(), 939524096);
            try {
                int fd = parcelFileDescriptorOpen.getFd();
                NativeSharedCounter nativeSharedCounter = SharedCounter.b;
                if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                    throw new IOException("Failed to truncate counter file");
                }
                long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                if (jNativeCreateSharedCounter < 0) {
                    throw new IOException("Failed to mmap counter file");
                }
                SharedCounter sharedCounter = new SharedCounter(jNativeCreateSharedCounter);
                parcelFileDescriptorOpen.close();
                return sharedCounter;
            } catch (Throwable th) {
                th = th;
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            parcelFileDescriptorOpen = null;
        }
    }
}
