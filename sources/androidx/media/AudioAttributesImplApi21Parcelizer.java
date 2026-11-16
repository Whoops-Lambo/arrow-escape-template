package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public class AudioAttributesImplApi21Parcelizer {
    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        versionedParcel.p(1);
        versionedParcel.w(audioAttributes);
        versionedParcel.v(audioAttributesImplApi21.b, 2);
    }

    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Parcelable parcelableM = audioAttributesImplApi21.a;
        if (versionedParcel.j(1)) {
            parcelableM = versionedParcel.m();
        }
        audioAttributesImplApi21.a = (AudioAttributes) parcelableM;
        audioAttributesImplApi21.b = versionedParcel.l(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }
}
