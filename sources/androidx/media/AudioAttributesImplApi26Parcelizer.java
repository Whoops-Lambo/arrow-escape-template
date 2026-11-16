package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public class AudioAttributesImplApi26Parcelizer {
    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        AudioAttributes audioAttributes = audioAttributesImplApi26.a;
        versionedParcel.p(1);
        versionedParcel.w(audioAttributes);
        versionedParcel.v(audioAttributesImplApi26.b, 2);
    }

    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        Parcelable parcelableM = audioAttributesImplApi26.a;
        if (versionedParcel.j(1)) {
            parcelableM = versionedParcel.m();
        }
        audioAttributesImplApi26.a = (AudioAttributes) parcelableM;
        audioAttributesImplApi26.b = versionedParcel.l(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }
}
