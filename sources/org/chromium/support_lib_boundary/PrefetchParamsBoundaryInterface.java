package org.chromium.support_lib_boundary;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface PrefetchParamsBoundaryInterface {
    @Nullable
    Map<String, String> getAdditionalHeaders();

    @Nullable
    String getNoVarySearchHint();
}
