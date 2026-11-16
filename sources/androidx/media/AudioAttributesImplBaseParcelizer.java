package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo
public class AudioAttributesImplBaseParcelizer {
    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        versionedParcel.v(audioAttributesImplBase.a, 1);
        versionedParcel.v(audioAttributesImplBase.b, 2);
        versionedParcel.v(audioAttributesImplBase.c, 3);
        versionedParcel.v(audioAttributesImplBase.d, 4);
    }

    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.l(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = versionedParcel.l(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = versionedParcel.l(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.l(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }
}
