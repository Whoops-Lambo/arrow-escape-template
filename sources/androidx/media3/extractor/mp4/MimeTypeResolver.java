package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class MimeTypeResolver {
    private MimeTypeResolver() {
    }

    public static String getContainerMimeType(List<TrackSampleTable> list) {
        Iterator<TrackSampleTable> it = list.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().track.format.sampleMimeType;
            if (MimeTypes.isVideo(str2)) {
                return "video/mp4";
            }
            if (MimeTypes.isAudio(str2)) {
                z = true;
            } else if (MimeTypes.isImage(str2)) {
                if (Objects.equals(str2, MimeTypes.IMAGE_HEIC)) {
                    str = MimeTypes.IMAGE_HEIF;
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }

    public static String getContainerMimeType(Format format) {
        String str = format.sampleMimeType;
        if (MimeTypes.isVideo(str)) {
            return "video/mp4";
        }
        if (MimeTypes.isAudio(str)) {
            return "audio/mp4";
        }
        if (MimeTypes.isImage(str)) {
            if (Objects.equals(str, MimeTypes.IMAGE_HEIC)) {
                return MimeTypes.IMAGE_HEIF;
            }
            if (Objects.equals(str, MimeTypes.IMAGE_AVIF)) {
                return MimeTypes.IMAGE_AVIF;
            }
            return "application/mp4";
        }
        return "application/mp4";
    }
}
