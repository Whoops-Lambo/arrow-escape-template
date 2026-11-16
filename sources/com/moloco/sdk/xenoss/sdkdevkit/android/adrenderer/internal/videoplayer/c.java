package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j;
import defpackage.az2;
import defpackage.cg0;
import defpackage.cz;
import defpackage.dy;
import defpackage.s71;
import defpackage.t50;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
public final class c implements DataSource {
    public final String a;
    public final j b;
    public RandomAccessFile c;
    public long d;
    public boolean e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @t50(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.ProgressiveMediaFileDataSource$open$1", f = "ProgressiveMediaFileDataSource.kt", l = {}, m = "invokeSuspend")
    public final class a extends ul2 implements zr0 {
        public final /* synthetic */ DataSpec s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataSpec dataSpec, dy dyVar) {
            super(2, dyVar);
            this.s = dataSpec;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return c.this.new a(this.s, dyVar);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) throws IOException {
            File file;
            DataSpec dataSpec = this.s;
            c cVar = c.this;
            String str = cVar.a;
            wz2.a0(obj);
            try {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVarB = cVar.b(str);
                if (gVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) {
                    file = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) gVarB).a;
                } else {
                    if (!(gVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e)) {
                        cVar.f = true;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Failed to download file: " + str, null, false, 12, null);
                        throw new IOException("Cannot read file: " + str);
                    }
                    file = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e) gVarB).a;
                }
                if (!file.exists()) {
                    throw new IOException("Cannot read file, does not exist yet: " + str);
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                randomAccessFile.seek(dataSpec.position);
                cVar.c = randomAccessFile;
                long length = dataSpec.length;
                if (length == -1) {
                    length = file.length() - dataSpec.position;
                }
                cVar.d = length;
                if (length == 0 && cVar.e && (gVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e) && s71.b(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e) gVarB).b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h.a)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Streaming error likely detected", null, false, 12, null);
                    cVar.f = true;
                }
                return new Long(cVar.d);
            } catch (IOException e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Failed to open file: " + str, e, false, 8, null);
                throw e;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @t50(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.ProgressiveMediaFileDataSource$streamingStatus$1", f = "ProgressiveMediaFileDataSource.kt", l = {}, m = "invokeSuspend")
    public final class b extends ul2 implements zr0 {
        public final /* synthetic */ String s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, dy dyVar) {
            super(2, dyVar);
            this.s = str;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return c.this.new b(this.s, dyVar);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            wz2.a0(obj);
            return c.this.b.a(this.s);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        try {
            RandomAccessFile randomAccessFile = this.c;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } finally {
            this.c = null;
        }
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g b(String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g) tb5.y(cg0.a, new b(str, null));
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return Uri.parse(this.a);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        IOException iOException;
        int i3;
        bArr.getClass();
        int i4 = 0;
        try {
            if (i2 == 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Read length is 0", null, false, 12, null);
                return 0;
            }
            long j = this.d;
            String str = this.a;
            if (j == 0 && (b(str) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Media stream is complete", null, false, 12, null);
                return -1;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVarB = b(str);
            if (gVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Streaming failed: " + str, null, false, 12, null);
                this.f = true;
                return 0;
            }
            if (gVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) {
                RandomAccessFile randomAccessFile = this.c;
                i4 = randomAccessFile != null ? randomAccessFile.read(bArr, i, i2) : 0;
                if (i4 > 0) {
                    this.e = true;
                    this.d -= (long) i4;
                }
                return i4;
            }
            loop0: while (true) {
                i3 = 0;
                while (true) {
                    if (i3 > 0) {
                        break loop0;
                    }
                    try {
                        if (!(b(str) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e)) {
                            break loop0;
                        }
                        RandomAccessFile randomAccessFile2 = this.c;
                        if (randomAccessFile2 != null) {
                            i3 = randomAccessFile2.read(bArr, i, i2);
                        }
                    } catch (IOException e) {
                        iOException = e;
                        i4 = i3;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Waiting for more data", iOException, false, 8, null);
                        return i4;
                    }
                }
            }
            if (i3 > 0) {
                this.e = true;
                this.d -= (long) i3;
            }
            return i3;
        } catch (IOException e2) {
            iOException = e2;
        }
    }

    public c(String str, j jVar) {
        str.getClass();
        jVar.getClass();
        this.a = str;
        this.b = jVar;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        transferListener.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "addTransferListener", null, false, 12, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) {
        dataSpec.getClass();
        return ((Number) tb5.y(cg0.a, new a(dataSpec, null))).longValue();
    }
}
