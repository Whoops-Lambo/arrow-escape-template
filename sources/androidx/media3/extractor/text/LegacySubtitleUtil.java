package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public class LegacySubtitleUtil {
    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static void toCuesWithTiming(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        boolean z;
        int startIndex = getStartIndex(subtitle, outputOptions.startTimeUs);
        if (outputOptions.startTimeUs == -9223372036854775807L || startIndex >= subtitle.getEventTimeCount()) {
            z = false;
        } else {
            List<Cue> cues = subtitle.getCues(outputOptions.startTimeUs);
            long eventTime = subtitle.getEventTime(startIndex);
            if (cues.isEmpty()) {
                z = false;
            } else {
                long j = outputOptions.startTimeUs;
                if (j < eventTime) {
                    consumer.accept(new CuesWithTiming(cues, j, eventTime - j));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = startIndex; i < subtitle.getEventTimeCount(); i++) {
            outputSubtitleEvent(subtitle, i, consumer);
        }
        if (outputOptions.outputAllCues) {
            if (z) {
                startIndex--;
            }
            for (int i2 = 0; i2 < startIndex; i2++) {
                outputSubtitleEvent(subtitle, i2, consumer);
            }
            if (z) {
                consumer.accept(new CuesWithTiming(subtitle.getCues(outputOptions.startTimeUs), subtitle.getEventTime(startIndex), outputOptions.startTimeUs - subtitle.getEventTime(startIndex)));
            }
        }
    }

    private LegacySubtitleUtil() {
    }

    private static void outputSubtitleEvent(Subtitle subtitle, int i, Consumer<CuesWithTiming> consumer) {
        long eventTime = subtitle.getEventTime(i);
        List<Cue> cues = subtitle.getCues(eventTime);
        if (!cues.isEmpty()) {
            if (i != subtitle.getEventTimeCount() - 1) {
                long eventTime2 = subtitle.getEventTime(i + 1) - subtitle.getEventTime(i);
                if (eventTime2 > 0) {
                    consumer.accept(new CuesWithTiming(cues, eventTime, eventTime2));
                    return;
                }
                return;
            }
            y.b();
        }
    }

    private static int getStartIndex(Subtitle subtitle, long j) {
        if (j == -9223372036854775807L) {
            return 0;
        }
        int nextEventTimeIndex = subtitle.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = subtitle.getEventTimeCount();
        }
        if (nextEventTimeIndex > 0 && subtitle.getEventTime(nextEventTimeIndex - 1) == j) {
            return nextEventTimeIndex - 1;
        }
        return nextEventTimeIndex;
    }
}
