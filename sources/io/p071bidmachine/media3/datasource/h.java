package io.p071bidmachine.media3.datasource;

import android.net.Uri;
import io.p071bidmachine.media3.common.g;
import io.p071bidmachine.media3.exoplayer.upstream.e;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface h extends g {
    long a(k kVar);

    void b(e eVar);

    void close();

    Uri getUri();

    default Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }
}
