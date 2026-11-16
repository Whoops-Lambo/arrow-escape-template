package com.mbridge.msdk.foundation.download.core;

import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class SynchronizeAvailableDirectorPath implements IDownloadTask {
    private int cacheDirectorPathType;
    private String cacheDirectoryPath;
    private String cacheDirectoryPathExternal;
    private String cacheDirectoryPathInternal;
    private DownloadRequest downloadRequest;

    public static IDownloadTask create(DownloadRequest downloadRequest) {
        return new SynchronizeAvailableDirectorPath(downloadRequest);
    }

    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() {
        this.cacheDirectoryPathExternal = this.downloadRequest.getDirectoryPathExternal();
        String directoryPathInternal = this.downloadRequest.getDirectoryPathInternal();
        this.cacheDirectoryPathInternal = directoryPathInternal;
        if (TextUtils.isEmpty(directoryPathInternal)) {
            y.j("必须指定 cacheDirectoryPathInternal");
            return null;
        }
        try {
            try {
                if (!TextUtils.isEmpty(this.cacheDirectoryPathExternal) && Build.VERSION.SDK_INT <= 28) {
                    GlobalComponent.getInstance().getContext();
                    this.cacheDirectoryPath = this.cacheDirectoryPathInternal;
                    this.cacheDirectorPathType = 0;
                } else {
                    this.cacheDirectoryPath = this.cacheDirectoryPathInternal;
                    this.cacheDirectorPathType = 0;
                }
                this.downloadRequest.setCacheDirectoryPath(this.cacheDirectoryPath);
                this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
                return null;
            } catch (Exception unused) {
                String str = this.cacheDirectoryPathInternal;
                this.cacheDirectoryPath = str;
                this.cacheDirectorPathType = 0;
                this.downloadRequest.setCacheDirectoryPath(str);
                this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
                return null;
            }
        } catch (Throwable th) {
            this.downloadRequest.setCacheDirectoryPath(this.cacheDirectoryPath);
            this.downloadRequest.setCacheDirectorPathType(this.cacheDirectorPathType);
            throw th;
        }
    }

    public SynchronizeAvailableDirectorPath(DownloadRequest downloadRequest) {
        this.downloadRequest = downloadRequest;
    }
}
