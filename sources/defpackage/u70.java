package defpackage;

import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class u70 {
    @DoNotInline
    public static void a(AudioTrack audioTrack, @Nullable w70 w70Var) {
        audioTrack.setPreferredDevice(w70Var == null ? null : w70Var.a);
    }
}
