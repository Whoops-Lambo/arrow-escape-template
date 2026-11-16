package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import defpackage.x;
import defpackage.yd0;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends Handler {
    public boolean a;
    public final HandlerThread b;
    public final WritableDownloadIndex c;
    public final DownloaderFactory d;
    public final Handler e;
    public final ArrayList f;
    public final HashMap g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public boolean m;

    public final int c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((Download) arrayList.get(i)).request.id.equals(str)) {
                return i;
            }
            i++;
        }
    }

    public final Download e(Download download, int i, int i2) {
        Assertions.checkState((i == 3 || i == 4) ? false : true);
        Download downloadA = a(download, i, i2);
        d(downloadA);
        return downloadA;
    }

    public final void f(Download download, int i) {
        if (i == 0) {
            if (download.state == 1) {
                e(download, 0, 0);
            }
        } else if (i != download.stopReason) {
            int i2 = download.state;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            d(new Download(download.request, i2, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i, 0, download.progress));
        }
    }

    public final void g() {
        c cVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                return;
            }
            Download download = (Download) arrayList.get(i);
            String str = download.request.id;
            HashMap map = this.g;
            c cVar2 = (c) map.get(str);
            int i3 = download.state;
            DownloaderFactory downloaderFactory = this.d;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        Assertions.checkNotNull(cVar2);
                        Assertions.checkState(!cVar2.d);
                        if (this.i || this.h != 0 || i2 >= this.j) {
                            e(download, 0, 0);
                            cVar2.a(false);
                        }
                    } else {
                        if (i3 != 5 && i3 != 7) {
                            y.b();
                            return;
                        }
                        if (cVar2 != null) {
                            if (!cVar2.d) {
                                cVar2.a(false);
                            }
                        } else if (!this.m) {
                            c cVar3 = new c(download.request, downloaderFactory.createDownloader(download.request), download.progress, true, this.k, this);
                            map.put(download.request.id, cVar3);
                            this.m = true;
                            cVar3.start();
                        }
                    }
                } else if (cVar2 != null) {
                    Assertions.checkState(!cVar2.d);
                    cVar2.a(false);
                }
            } else if (cVar2 != null) {
                Assertions.checkState(!cVar2.d);
                cVar2.a(false);
            } else {
                if (this.i || this.h != 0 || this.l >= this.j) {
                    cVar = null;
                } else {
                    Download downloadE = e(download, 2, 0);
                    cVar = new c(downloadE.request, downloaderFactory.createDownloader(downloadE.request), downloadE.progress, false, this.k, this);
                    map.put(downloadE.request.id, cVar);
                    int i4 = this.l;
                    this.l = i4 + 1;
                    if (i4 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    cVar.start();
                }
                cVar2 = cVar;
            }
            if (cVar2 != null && !cVar2.d) {
                i2++;
            }
            i++;
        }
    }

    public static Download a(Download download, int i, int i2) {
        return new Download(download.request, i, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i2, 0, download.progress);
    }

    public final void d(Download download) {
        int i = download.state;
        Assertions.checkState((i == 3 || i == 4) ? false : true);
        int iC = c(download.request.id);
        int i2 = 16;
        ArrayList arrayList = this.f;
        if (iC == -1) {
            arrayList.add(download);
            Collections.sort(arrayList, new x(i2));
        } else {
            boolean z = download.startTimeMs != ((Download) arrayList.get(iC)).startTimeMs;
            arrayList.set(iC, download);
            if (z) {
                Collections.sort(arrayList, new x(i2));
            }
        }
        try {
            this.c.putDownload(download);
        } catch (IOException e) {
            Log.e("DownloadManager", "Failed to update index.", e);
        }
        this.e.obtainMessage(2, new yd0(download, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0204 A[LOOP:3: B:105:0x01fe->B:107:0x0204, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x021b A[LOOP:4: B:109:0x0215->B:111:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x024b A[LOOP:5: B:118:0x0245->B:120:0x024b, LOOP_END] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        DownloadCursor downloads = null;
        i = 0;
        int i4 = 0;
        switch (message.what) {
            case 0:
                int i5 = message.arg1;
                WritableDownloadIndex writableDownloadIndex = this.c;
                ArrayList arrayList2 = this.f;
                this.h = i5;
                try {
                    try {
                        writableDownloadIndex.setDownloadingStatesToQueued();
                        downloads = writableDownloadIndex.getDownloads(0, 1, 2, 5, 7);
                        while (downloads.moveToNext()) {
                            arrayList2.add(downloads.getDownload());
                        }
                    } catch (Throwable th) {
                        Util.closeQuietly(downloads);
                        throw th;
                    }
                } catch (IOException e) {
                    Log.e("DownloadManager", "Failed to load index.", e);
                    arrayList2.clear();
                    break;
                }
                Util.closeQuietly(downloads);
                this.e.obtainMessage(0, new ArrayList(arrayList2)).sendToTarget();
                g();
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 1:
                this.i = message.arg1 != 0;
                g();
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 2:
                this.h = message.arg1;
                g();
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 3:
                String str = (String) message.obj;
                int i6 = message.arg1;
                WritableDownloadIndex writableDownloadIndex2 = this.c;
                ArrayList arrayList3 = this.f;
                if (str != null) {
                    Download downloadB = b(str, false);
                    if (downloadB != null) {
                        f(downloadB, i6);
                    } else {
                        try {
                            writableDownloadIndex2.setStopReason(str, i6);
                        } catch (IOException e2) {
                            Log.e("DownloadManager", "Failed to set manual stop reason: ".concat(str), e2);
                        }
                    }
                    break;
                } else {
                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                        f((Download) arrayList3.get(i7), i6);
                    }
                    try {
                        writableDownloadIndex2.setStopReason(i6);
                    } catch (IOException e3) {
                        Log.e("DownloadManager", "Failed to set manual stop reason", e3);
                    }
                    break;
                }
                g();
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 4:
                this.j = message.arg1;
                g();
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 5:
                this.k = message.arg1;
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 6:
                DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                int i8 = message.arg1;
                Download downloadB2 = b(downloadRequest.id, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (downloadB2 != null) {
                    d(DownloadManager.mergeRequest(downloadB2, downloadRequest, i8, jCurrentTimeMillis));
                } else {
                    d(new Download(downloadRequest, i8 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i8, 0));
                }
                g();
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 7:
                String str2 = (String) message.obj;
                Download downloadB3 = b(str2, true);
                if (downloadB3 == null) {
                    Log.e("DownloadManager", "Failed to remove nonexistent download: " + str2);
                } else {
                    e(downloadB3, 5, 0);
                    g();
                }
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 8:
                WritableDownloadIndex writableDownloadIndex3 = this.c;
                ArrayList arrayList4 = this.f;
                ArrayList arrayList5 = new ArrayList();
                try {
                    DownloadCursor downloads2 = writableDownloadIndex3.getDownloads(3, 4);
                    while (downloads2.moveToNext()) {
                        try {
                            arrayList5.add(downloads2.getDownload());
                        } catch (Throwable th2) {
                            if (downloads2 == null) {
                                throw th2;
                            }
                            try {
                                downloads2.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                            for (i = 0; i < arrayList4.size(); i++) {
                                arrayList4.set(i, a((Download) arrayList4.get(i), 5, 0));
                            }
                            for (i2 = 0; i2 < arrayList5.size(); i2++) {
                                arrayList4.add(a((Download) arrayList5.get(i2), 5, 0));
                            }
                            Collections.sort(arrayList4, new x(16));
                            writableDownloadIndex3.setStatesToRemoving();
                            arrayList = new ArrayList(arrayList4);
                            for (i3 = 0; i3 < arrayList4.size(); i3++) {
                                this.e.obtainMessage(2, new yd0((Download) arrayList4.get(i3), false, arrayList, null)).sendToTarget();
                            }
                            g();
                            i4 = 1;
                            this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                            return;
                        }
                    }
                    downloads2.close();
                } catch (IOException unused) {
                    Log.e("DownloadManager", "Failed to load downloads.");
                }
                while (i < arrayList4.size()) {
                    arrayList4.set(i, a((Download) arrayList4.get(i), 5, 0));
                }
                while (i2 < arrayList5.size()) {
                    arrayList4.add(a((Download) arrayList5.get(i2), 5, 0));
                }
                Collections.sort(arrayList4, new x(16));
                try {
                    writableDownloadIndex3.setStatesToRemoving();
                    break;
                } catch (IOException e4) {
                    Log.e("DownloadManager", "Failed to update index.", e4);
                }
                arrayList = new ArrayList(arrayList4);
                while (i3 < arrayList4.size()) {
                    this.e.obtainMessage(2, new yd0((Download) arrayList4.get(i3), false, arrayList, null)).sendToTarget();
                }
                g();
                i4 = 1;
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 9:
                c cVar = (c) message.obj;
                String str3 = cVar.a.id;
                this.g.remove(str3);
                boolean z = cVar.d;
                if (z) {
                    this.m = false;
                } else {
                    int i9 = this.l - 1;
                    this.l = i9;
                    if (i9 == 0) {
                        removeMessages(11);
                    }
                }
                if (!cVar.g) {
                    Exception exc = cVar.h;
                    if (exc != null) {
                        Log.e("DownloadManager", "Task failed: " + cVar.a + ", " + z, exc);
                    }
                    Download download = (Download) Assertions.checkNotNull(b(str3, false));
                    int i10 = download.state;
                    if (i10 == 2) {
                        Assertions.checkState(!z);
                        ArrayList arrayList6 = this.f;
                        Download download2 = new Download(download.request, exc == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
                        arrayList6.remove(c(download2.request.id));
                        try {
                            this.c.putDownload(download2);
                        } catch (IOException e5) {
                            Log.e("DownloadManager", "Failed to update index.", e5);
                        }
                        this.e.obtainMessage(2, new yd0(download2, false, new ArrayList(arrayList6), exc)).sendToTarget();
                    } else {
                        if (i10 != 5 && i10 != 7) {
                            y.b();
                            return;
                        }
                        Assertions.checkState(z);
                        ArrayList arrayList7 = this.f;
                        if (download.state == 7) {
                            int i11 = download.stopReason;
                            e(download, i11 == 0 ? 0 : 1, i11);
                            g();
                        } else {
                            arrayList7.remove(c(download.request.id));
                            try {
                                this.c.removeDownload(download.request.id);
                            } catch (IOException unused2) {
                                Log.e("DownloadManager", "Failed to remove from database");
                            }
                            this.e.obtainMessage(2, new yd0(download, true, new ArrayList(arrayList7), null)).sendToTarget();
                        }
                    }
                    g();
                    break;
                } else {
                    g();
                }
                this.e.obtainMessage(1, i4, this.g.size()).sendToTarget();
                return;
            case 10:
                c cVar2 = (c) message.obj;
                long j = Util.toLong(message.arg1, message.arg2);
                Download download3 = (Download) Assertions.checkNotNull(b(cVar2.a.id, false));
                if (j == download3.contentLength || j == -1) {
                    return;
                }
                d(new Download(download3.request, download3.state, download3.startTimeMs, System.currentTimeMillis(), j, download3.stopReason, download3.failureReason, download3.progress));
                return;
            case 11:
                ArrayList arrayList8 = this.f;
                for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                    Download download4 = (Download) arrayList8.get(i12);
                    if (download4.state == 2) {
                        try {
                            this.c.putDownload(download4);
                        } catch (IOException e6) {
                            Log.e("DownloadManager", "Failed to update index.", e6);
                        }
                    }
                }
                sendEmptyMessageDelayed(11, 5000L);
                return;
            case 12:
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(true);
                }
                try {
                    this.c.setDownloadingStatesToQueued();
                    break;
                } catch (IOException e7) {
                    Log.e("DownloadManager", "Failed to update index.", e7);
                }
                this.f.clear();
                this.b.quit();
                synchronized (this) {
                    this.a = true;
                    notifyAll();
                    break;
                }
                return;
            default:
                y.b();
                return;
        }
    }

    public b(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i, int i2, boolean z) {
        super(handlerThread.getLooper());
        this.b = handlerThread;
        this.c = writableDownloadIndex;
        this.d = downloaderFactory;
        this.e = handler;
        this.j = i;
        this.k = i2;
        this.i = z;
        this.f = new ArrayList();
        this.g = new HashMap();
    }

    public final Download b(String str, boolean z) {
        int iC = c(str);
        if (iC != -1) {
            return (Download) this.f.get(iC);
        }
        if (z) {
            try {
                return this.c.getDownload(str);
            } catch (IOException e) {
                Log.e("DownloadManager", "Failed to load download: " + str, e);
                return null;
            }
        }
        return null;
    }
}
