package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public abstract class Id3Frame implements Metadata.Entry {
    public final String id;

    public String toString() {
        return this.id;
    }

    public Id3Frame(String str) {
        this.id = str;
    }
}
