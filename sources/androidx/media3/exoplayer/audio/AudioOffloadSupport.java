package androidx.media3.exoplayer.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AudioOffloadSupport {
    public static final AudioOffloadSupport DEFAULT_UNSUPPORTED = new Builder().build();
    public final boolean isFormatSupported;
    public final boolean isGaplessSupported;
    public final boolean isSpeedChangeSupported;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        private boolean isFormatSupported;
        private boolean isGaplessSupported;
        private boolean isSpeedChangeSupported;

        public AudioOffloadSupport build() {
            if (this.isFormatSupported || !(this.isGaplessSupported || this.isSpeedChangeSupported)) {
                return new AudioOffloadSupport(this);
            }
            e32.i("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }

        public Builder setIsFormatSupported(boolean z) {
            this.isFormatSupported = z;
            return this;
        }

        public Builder setIsGaplessSupported(boolean z) {
            this.isGaplessSupported = z;
            return this;
        }

        public Builder setIsSpeedChangeSupported(boolean z) {
            this.isSpeedChangeSupported = z;
            return this;
        }

        public Builder(AudioOffloadSupport audioOffloadSupport) {
            this.isFormatSupported = audioOffloadSupport.isFormatSupported;
            this.isGaplessSupported = audioOffloadSupport.isGaplessSupported;
            this.isSpeedChangeSupported = audioOffloadSupport.isSpeedChangeSupported;
        }

        public Builder() {
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AudioOffloadSupport.class == obj.getClass()) {
            AudioOffloadSupport audioOffloadSupport = (AudioOffloadSupport) obj;
            if (this.isFormatSupported == audioOffloadSupport.isFormatSupported && this.isGaplessSupported == audioOffloadSupport.isGaplessSupported && this.isSpeedChangeSupported == audioOffloadSupport.isSpeedChangeSupported) {
                return true;
            }
        }
        return false;
    }

    public Builder buildUpon() {
        return new Builder(this);
    }

    public int hashCode() {
        return ((this.isFormatSupported ? 1 : 0) << 2) + ((this.isGaplessSupported ? 1 : 0) << 1) + (this.isSpeedChangeSupported ? 1 : 0);
    }

    private AudioOffloadSupport(Builder builder) {
        this.isFormatSupported = builder.isFormatSupported;
        this.isGaplessSupported = builder.isGaplessSupported;
        this.isSpeedChangeSupported = builder.isSpeedChangeSupported;
    }
}
