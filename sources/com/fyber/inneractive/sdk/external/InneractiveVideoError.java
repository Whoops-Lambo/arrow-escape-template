package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class InneractiveVideoError extends InneractiveError {
    public final Error a;
    public final Throwable b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private String errorString;
        private boolean isFatal;

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }

        Error(String str, boolean z) {
            this.errorString = str;
            this.isFatal = z;
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        Throwable th = this.b;
        Error error = this.a;
        if (th == null) {
            return error.getErrorString();
        }
        return error.getErrorString() + ": " + this.b;
    }

    public Throwable getCause() {
        return this.b;
    }

    public Error getPlayerError() {
        return this.a;
    }

    public InneractiveVideoError(Error error) {
        this.a = error;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.b = th;
    }
}
