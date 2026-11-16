package androidx.media;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi
@RestrictTo
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Builder extends AudioAttributesImplApi21.Builder {
        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        public final AudioAttributesImpl.Builder a() {
            this.a.setUsage(1);
            return this;
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder
        /* JADX INFO: renamed from: b */
        public final AudioAttributesImplApi21.Builder a() {
            this.a.setUsage(1);
            return this;
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        public final AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.a.build());
        }
    }

    @RestrictTo
    public AudioAttributesImplApi26() {
    }
}
