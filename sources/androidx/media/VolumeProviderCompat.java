package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class VolumeProviderCompat {

    /* JADX INFO: renamed from: androidx.media.VolumeProviderCompat$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass1 extends VolumeProvider {
        @Override // android.media.VolumeProvider
        public final void onAdjustVolume(int i) {
            throw null;
        }

        @Override // android.media.VolumeProvider
        public final void onSetVolumeTo(int i) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.media.VolumeProviderCompat$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass2 extends VolumeProvider {
        @Override // android.media.VolumeProvider
        public final void onAdjustVolume(int i) {
            throw null;
        }

        @Override // android.media.VolumeProvider
        public final void onSetVolumeTo(int i) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Callback {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ControlType {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        public static void a(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }
}
