package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PercentageRating;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Rating;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.source.MediaParserExtractorAdapter;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.MediaParserChunkExtractor;
import com.google.firebase.inject.Provider;
import com.usercentrics.sdk.PredefinedUIAlertDialogFactory;
import java.net.ProtocolException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ak1 implements Bundleable.Creator, ChunkExtractor.Factory, ProgressiveMediaExtractor.Factory, com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory, Id3Decoder.FramePredicate, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate, wa0, OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;

    @Override // defpackage.wa0
    public void d(Provider provider) {
    }

    public /* synthetic */ ak1(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void b(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + ((Object) " and ") + obj2).toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    public static /* synthetic */ void h(Object obj, String str, int i, int i2) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ')');
    }

    public static /* synthetic */ void i(String str) throws ProtocolException {
        throw new ProtocolException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void l(String str, Throwable th) {
        throw new AssertionError(str, th);
    }

    public static /* synthetic */ void n(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void o(Object obj, Object obj2, String str) {
        throw new NullPointerException(str + obj + obj2);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    public com.google.android.exoplayer2.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return new MediaParserExtractorAdapter(playerId);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 9:
                return Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
            default:
                return androidx.media3.extractor.mp3.Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.a) {
            case 0:
                return MediaItem.ClippingConfiguration.lambda$static$0(bundle);
            case 1:
                return MediaItem.LiveConfiguration.lambda$static$0(bundle);
            case 2:
                return MediaItem.RequestMetadata.lambda$static$0(bundle);
            case 3:
                return MediaMetadata.fromBundle(bundle);
            case 17:
                return PercentageRating.fromBundle(bundle);
            case 21:
                return new PlaybackException(bundle);
            case 22:
                return PlaybackParameters.lambda$static$0(bundle);
            case 23:
                return Player.Commands.fromBundle(bundle);
            case 24:
                return Player.PositionInfo.fromBundle(bundle);
            default:
                return Rating.fromBundle(bundle);
        }
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new RuntimeException(sb.toString());
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        return PredefinedUIAlertDialogFactory.applySafeInsets$lambda$10(view, windowInsetsCompat);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return androidx.media3.exoplayer.source.MediaParserExtractorAdapter.lambda$static$0(playerId);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
    public ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
        return MediaParserChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
    }
}
