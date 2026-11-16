package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class AudioAttributesCompatParcelizer {
    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        versionedParcel.p(1);
        versionedParcel.y(audioAttributesImpl);
    }

    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        VersionedParcelable versionedParcelableO = audioAttributesCompat.a;
        if (versionedParcel.j(1)) {
            versionedParcelableO = versionedParcel.o();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) versionedParcelableO;
        return audioAttributesCompat;
    }
}
