package defpackage;

import android.os.Bundle;
import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MediaItem;
import androidx.media3.common.StreamKey;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.MediaExtractorCompat;
import androidx.media3.exoplayer.source.BundledExtractorsAdapter;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.Extractor;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.util.Clock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kk implements gs0 {
    public final /* synthetic */ int a;

    public /* synthetic */ kk(int i) {
        this.a = i;
    }

    @Override // defpackage.gs0
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
            case 1:
                return ((Cue) obj).toSerializableBundle();
            case 2:
                return CueGroup.lambda$static$0((Cue) obj);
            case 3:
                return Cue.fromBundle((Bundle) obj);
            case 4:
                return ((Cue) obj).toBinderBasedBundle();
            case 5:
                return DefaultGainProvider.Builder.lambda$new$0((Pair) obj);
            case 6:
                return ((TrackGroupArray) obj).toBundle();
            case 7:
                return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
            case 8:
                return TrackGroupArray.fromBundle((Bundle) obj);
            case 9:
                return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
            case 10:
                return new DefaultAnalyticsCollector((Clock) obj);
            case 11:
                return new androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector((androidx.media3.common.util.Clock) obj);
            case 12:
                return ((Label) obj).toBundle();
            case 13:
                return Label.fromBundle((Bundle) obj);
            case 14:
                return Format.lambda$toLogString$0((Label) obj);
            case 15:
                return MediaExtractorCompat.lambda$selectExtractor$0((Extractor) obj);
            case 16:
                return ((StreamKey) obj).toBundle();
            case 17:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            case 18:
                return StreamKey.fromBundle((Bundle) obj);
            case 19:
                return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
            case 20:
                return Mp4Extractor.lambda$processMoovAtom$1((Track) obj);
            case 21:
                return androidx.media3.extractor.mp4.Mp4Extractor.lambda$processMoovAtom$2((androidx.media3.extractor.mp4.Track) obj);
            case 22:
                return Timeline.Window.fromBundle((Bundle) obj);
            case 23:
                return Timeline.Period.fromBundle((Bundle) obj);
            case 24:
                return Format.fromBundle((Bundle) obj);
            case 25:
                return TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj);
            case 26:
                return ((TrackGroup) obj).toBundle();
            case 27:
                return TrackGroup.fromBundle((Bundle) obj);
            case 28:
                return ((TrackSelectionOverride) obj).toBundle();
            default:
                return TrackSelectionOverride.fromBundle((Bundle) obj);
        }
    }
}
