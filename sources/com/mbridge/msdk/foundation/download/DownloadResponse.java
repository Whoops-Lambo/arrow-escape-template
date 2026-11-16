package com.mbridge.msdk.foundation.download;

import com.mbridge.msdk.foundation.download.utils.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class DownloadResponse {
    private static final String UN_KNOWN = "unknown";
    private DownloadError _error;
    private boolean _isCancelled;
    private boolean _isSuccessful;
    private int from = 0;
    private boolean isFailed;
    private boolean isResponseStart;
    private boolean isTimeout;

    public DownloadError getError() {
        return this._error;
    }

    public int getFrom() {
        return this.from;
    }

    public boolean isCancelled() {
        return this._isCancelled;
    }

    public boolean isFailed() {
        return this.isFailed;
    }

    public boolean isResponseStart() {
        return this.isResponseStart;
    }

    public boolean isSuccessful() {
        return this._isSuccessful;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setCancelled(boolean z) {
        this._isCancelled = z;
    }

    public void setError(Exception exc) {
        setError(new DownloadError(exc));
    }

    public void setFailed(boolean z) {
        this.isFailed = z;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    public void setResponseStart(boolean z) {
        this.isResponseStart = z;
    }

    public void setSuccessful(boolean z) {
        this._isSuccessful = z;
    }

    public void setTimeout(boolean z) {
        this.isTimeout = z;
    }

    public String getErrorMessage() {
        if (!Objects.isNull(getError()) && !Objects.isNull(getError().getException())) {
            return getError().getException().getMessage();
        }
        return "unknown";
    }

    public void setError(DownloadError downloadError) {
        this._error = downloadError;
        setSuccessful(false);
    }
}
