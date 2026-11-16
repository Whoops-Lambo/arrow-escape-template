package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.offline.FilterableManifest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class FilteringManifestParser<T extends FilterableManifest<T, K>, K> implements ParsingLoadable.Parser<T> {
    private final ParsingLoadable.Parser<T> parser;
    private final List<K> trackKeys;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.ParsingLoadable.Parser
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t = this.parser.parse(uri, inputStream);
        List<K> list = this.trackKeys;
        return (list == null || list.isEmpty()) ? t : (T) t.copy(this.trackKeys);
    }

    public FilteringManifestParser(ParsingLoadable.Parser<T> parser, List<K> list) {
        this.parser = parser;
        this.trackKeys = list;
    }
}
