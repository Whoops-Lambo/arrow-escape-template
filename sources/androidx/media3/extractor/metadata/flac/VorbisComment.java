package androidx.media3.extractor.metadata.flac;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import defpackage.ns1;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() + n30.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.key);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numF = s71.F(this.value);
                if (numF != null) {
                    builder.setTotalTrackCount(numF);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numF2 = s71.F(this.value);
                if (numF2 != null) {
                    builder.setTotalDiscCount(numF2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numF3 = s71.F(this.value);
                if (numF3 != null) {
                    builder.setTrackNumber(numF3);
                    break;
                }
                break;
            case "ALBUM":
                builder.setAlbumTitle(this.value);
                break;
            case "GENRE":
                builder.setGenre(this.value);
                break;
            case "TITLE":
                builder.setTitle(this.value);
                break;
            case "DESCRIPTION":
                builder.setDescription(this.value);
                break;
            case "DISCNUMBER":
                Integer numF4 = s71.F(this.value);
                if (numF4 != null) {
                    builder.setDiscNumber(numF4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                builder.setAlbumArtist(this.value);
                break;
            case "ARTIST":
                builder.setArtist(this.value);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }

    public VorbisComment(String str, String str2) {
        this.key = ns1.C(str);
        this.value = str2;
    }
}
