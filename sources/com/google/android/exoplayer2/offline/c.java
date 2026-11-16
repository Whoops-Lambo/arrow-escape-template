package com.google.android.exoplayer2.offline;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends Thread implements Downloader.ProgressListener {
    public final DownloadRequest a;
    public final Downloader b;
    public final DownloadProgress c;
    public final boolean d;
    public final int e;
    public volatile b f;
    public volatile boolean g;
    public Exception h;
    public long i = -1;

    public final void a(boolean z) {
        if (z) {
            this.f = null;
        }
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.cancel();
        interrupt();
    }

    @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
    public final void onProgress(long j, long j2, float f) {
        this.c.bytesDownloaded = j2;
        this.c.percentDownloaded = f;
        if (j != this.i) {
            this.i = j;
            b bVar = this.f;
            if (bVar != null) {
                bVar.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.d) {
                this.b.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.g) {
                    try {
                        this.b.download(this);
                        break;
                    } catch (IOException e) {
                        if (!this.g) {
                            long j2 = this.c.bytesDownloaded;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.e) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.h = e2;
        }
        b bVar = this.f;
        if (bVar != null) {
            bVar.obtainMessage(9, this).sendToTarget();
        }
    }

    public c(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z, int i, b bVar) {
        this.a = downloadRequest;
        this.b = downloader;
        this.c = downloadProgress;
        this.d = z;
        this.e = i;
        this.f = bVar;
    }
}
