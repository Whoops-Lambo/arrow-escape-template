package io.p071bidmachine.media3.exoplayer.hls;

import androidx.annotation.Nullable;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.pv1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class t extends IOException {
    public t(@Nullable String str) {
        super(pv1.n("Unable to bind a sample queue to TrackGroup with MIME type ", str, UserDetailsUtils.UserDetailsLiterals.DOT));
    }
}
